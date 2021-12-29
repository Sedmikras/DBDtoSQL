package cz.kiv.sar.codegen;

import cz.kiv.sar.structure.sql.*;
import cz.kiv.sar.structure.sql.Table;
import org.jooq.*;
import org.jooq.impl.DSL;

import static org.jooq.impl.DSL.constraint;

/**
 * Created by Martin Forejt on 28.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
public class CodeGen {

    public static void codeGen(Database db) {
        System.getProperties().setProperty("org.jooq.no-logo", "true");
        DSLContext create = DSL.using(SQLDialect.MYSQL);

        StringBuilder sb = new StringBuilder();
        String sql;

        sql = create.createDatabase(db.getName()).getSQL();
        sb.append(sql).append("\n");
        sb.append("CHARACTER SET `").append(db.getCharacterSet()).append("`\n");
        sb.append("COLLATE `").append(db.getCollation()).append("`;\n");
        sb.append("USE `").append(db.getName()).append("`;\n\n");

        for (Table table : db.getTables()) {
            CreateTableColumnStep c = create.createTable(table.getName());

            for (Column column : table.getColumns()) {
                c = c.column(column.getName(), column.getDataType());

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

            sql = c.getSQL();
            sb.append(sql);

            if (table.getCharacterSet() != null) {
                sb.append("\n").append("CHARACTER SET ").append(table.getCharacterSet());
            }
            if (table.getCollation() != null) {
                sb.append("\n").append("COLLATE ").append(table.getCollation());
            }

            sb.append(";\n\n");
        }

        System.out.println(sb);
    }

}
