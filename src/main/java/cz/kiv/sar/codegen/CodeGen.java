package cz.kiv.sar.codegen;

import cz.kiv.sar.codegen.exceptions.CodeGenException;
import cz.kiv.sar.structure.sql.*;
import cz.kiv.sar.structure.sql.Table;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.io.FileWriter;
import java.io.IOException;

import static org.jooq.impl.DSL.constraint;

/**
 * Created by Martin Forejt on 28.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
public class CodeGen {

    private final Database db;
    private final String file;
    private final SQLDialect dialect;
    private FileWriter writer;

    public CodeGen(Database db, String file, SQLDialect dialect) {
        this.db = db;
        this.file = file;
        this.dialect = dialect;
    }

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

    private void generate() throws IOException {
        System.getProperties().setProperty("org.jooq.no-logo", "true");

        DSLContext create = DSL.using(dialect);

        w(create.createDatabase(db.getName()).getSQL()).w("\n");
        w("CHARACTER SET `").w(db.getCharacterSet()).w("`\n");
        w("COLLATE `").w(db.getCollation()).w("`;\n");
        w("USE `").w(db.getName()).w("`;\n\n");

        for (Table table : db.getTables()) {
            CreateTableColumnStep c = create.createTable(table.getName());

            for (Column column : table.getColumns()) {
                c = c.column(column.getName(), column.getType());

                if (column.isUnique()) {
                    c.unique(column.getName());
                }

                if (column instanceof IdentifierColumn) {
                    c.primaryKey(column.getName());
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
                w("\n").w("CHARACTER SET ").w(table.getCharacterSet());
            }
            if (table.getCollation() != null) {
                w("\n").w("COLLATE ").w(table.getCollation());
            }

            w(";\n\n");
        }
    }

    private CodeGen w(String data) throws IOException {
        writer.write(data);
        return this;
    }

}
