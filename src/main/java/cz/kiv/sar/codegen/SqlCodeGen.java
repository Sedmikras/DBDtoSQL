package cz.kiv.sar.codegen;

import cz.kiv.sar.codegen.exceptions.CodeGenException;
import cz.kiv.sar.structure.sql.*;
import cz.kiv.sar.structure.sql.Table;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.io.FileWriter;
import java.io.IOException;

import static org.jooq.impl.DSL.*;

/**
 * Sql codegen used to generate (and write to file) database creation sql script
 * based on {@link Database}
 * <p>
 * Usage - create new instance and call {@link SqlCodeGen#run()}
 */
public class SqlCodeGen {

    private final Database db;
    private final String file;
    private final SQLDialect dialect;
    private FileWriter writer;

    /**
     * Create new SqlCodeGen
     *
     * @param db      database
     * @param file    output file to write sql creation script in
     * @param dialect sql dialect
     */
    public SqlCodeGen(Database db, String file, SQLDialect dialect) {
        this.db = db;
        this.file = file;
        this.dialect = dialect;
    }

    /**
     * Start sql generation, if success after method finish, generated sql will
     * be written in output file passed to {@link SqlCodeGen#SqlCodeGen(Database, String, SQLDialect)}
     *
     * @throws CodeGenException on any err
     */
    public void run() throws CodeGenException {
        try {
            writer = new FileWriter(file);
            generate();
        } catch (IOException e) {
            throw new CodeGenException(e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) { /* empty */ }
                writer = null;
            }
        }
    }

    /**
     * Generate sql
     *
     * @throws IOException on any file related error
     */
    private void generate() throws IOException {
        System.getProperties().setProperty("org.jooq.no-logo", "true");

        DSLContext create = DSL.using(dialect);

        w(create.createDatabase(db.getName()).getSQL()).w("\n");
        w("CHARACTER SET `").w(db.getCharacterSet()).w("`;\n");
        //w("COLLATE `").w(db.getCollation()).w("`;\n");
        w("USE `").w(db.getName()).w("`;\n\n");

        for (Table table : db.getTables()) {
            CreateTableColumnStep c = create.createTable(table.getName());

            for (Column column : table.getColumns()) {
                c = c.column(column.getName(), column.getDataType());

                if (column.isUnique()) {
                    c.constraint(unique(column.getName()));
                }

                if (column instanceof IdentifierColumn) {
                    c.constraint(primaryKey(column.getName()));
                }

                if (column instanceof ForeignKeyColumn) {
                    c.constraint(
                            constraint()
                                    .foreignKey(column.getName())
                                    .references(
                                            ((ForeignKeyColumn) column).getReferencedTable().getName(),
                                            ((ForeignKeyColumn) column).getReferencedColumn().getName()
                                    ));
                }
            }

            w(c.getSQL());
            if (table.getCharacterSet() != null) {
                w("\n").w("CHARACTER SET `").w(table.getCharacterSet()).w("`");
            }
            //if (table.getCollation() != null) {
            //    w("\n").w("COLLATE `").w(table.getCollation()).w("`");
            //}

            w(";\n\n");
        }
    }

    /**
     * Write string to {@link SqlCodeGen#writer}
     * Note: Can be only called after creation of {@link SqlCodeGen#writer}
     *
     * @param data string to write
     * @return self
     * @throws IOException on file related exception
     */
    private SqlCodeGen w(String data) throws IOException {
        writer.write(data);
        return this;
    }

}
