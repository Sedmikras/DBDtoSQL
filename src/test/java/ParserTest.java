import cz.kiv.sar.antlr.DBDLexer;
import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.preprocessing.Configuration;
import cz.kiv.sar.preprocessing.SimpleProcessor;
import cz.kiv.sar.structure.dbd.DBDDataType;
import cz.kiv.sar.structure.sql.*;
import cz.kiv.sar.visitors.SourceVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import static cz.kiv.sar.structure.DataTypeMapper.dbdToSqlDataType;
import static cz.kiv.sar.structure.dbd.DBDDataType.dbdDataType;
import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void Test() throws Exception {
        Database mock = new Database();
        mockTables(mock);
        Configuration g = new Configuration("resources/test-file1.dbd");
        CharStream s = new SimpleProcessor().processFile(g.getFileName());
        DBDLexer lexer = new DBDLexer(s);
        DBDParser parser = new DBDParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        SourceVisitor v = new SourceVisitor();
        Database generated = v.visitSource(parser.source());
        assertEquals(generated, mock);
    }


    private void mockTables(Database d) {
        Table tableOrder = new Table("XXORDER");
        Column ID = new IdentifierColumn();
        Column ORDID = new Column("ORDID", dbdToSqlDataType(dbdDataType(DBDDataType.Type.INT)), false);
        tableOrder
                .addColumn(ID)
                .addColumn(ORDID);
        d.addTable(tableOrder);

        Table tableCust = new Table("XXCUST");
        Column tableCustForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableCustID = new IdentifierColumn();
        Column tableCustName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(24)), false);
        tableCust
                .addColumn(tableCustForeignKey)
                .addColumn(tableCustID)
                .addColumn(tableCustName);
        d.addTable(tableCust);

        Table tableProd = new Table("XXPROD");
        Column tableProdForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableProdID = new IdentifierColumn();
        Column tableProdName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(24)), false);
        Column tableProdPrice = new Column("PRICE", dbdToSqlDataType(dbdDataType(DBDDataType.Type.DECIMAL).setPrecision(10).setScale(2).setLength(6)), false);
        tableProd
                .addColumn(tableProdForeignKey)
                .addColumn(tableProdID)
                .addColumn(tableProdName)
                .addColumn(tableProdPrice);
        d.addTable(tableProd);

        Table tableStore = new Table("XXSTORE");
        Column tableStoreForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableStoreID = new IdentifierColumn();
        Column tableStoreName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(20)), false);
        tableStore
                .addColumn(tableStoreForeignKey)
                .addColumn(tableStoreID)
                .addColumn(tableStoreName);
        d.addTable(tableStore);

        Table tableSales = new Table("XXSALES");
        Column tableSalesForeignKey = new ForeignKeyColumn(tableStore, tableStoreID);
        Column tableSalesID = new IdentifierColumn();
        Column tableSalesName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(20)), false);
        tableSales
                .addColumn(tableSalesForeignKey)
                .addColumn(tableSalesID)
                .addColumn(tableSalesName);
        d.addTable(tableSales);
        d.setName("ORDRMR");
        d.setCollation("utf8");
        d.setCharacterSet("utf8");
    }
}
