package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.*;

import java.util.List;
import java.util.ArrayList;

public class SourceVisitor extends DBDParserBaseVisitor<Database> {
    Database database;

    @Override
    public Database visitSource(DBDParser.SourceContext ctx) {
        DBDVisitor v = new DBDVisitor();
        Database d = v.visitDbd(ctx.dbd());
        DatasetVisitor dv = new DatasetVisitor();
        DataSet ds = dv.visitDataset(ctx.dataset());
        SegmentVisitor sv = new SegmentVisitor();
        List<Segment> segments = new ArrayList<>();
        for (DBDParser.SegmentContext segmentContext : ctx.segment()) {
            segments.add(sv.visitSegment(segmentContext));
        }
        mockTables(d);
        return d;
    }

    private void mockTables(Database d) {
        Table tableOrder = new Table();
        tableOrder.setName("XXORDER");
        Column ID = new IdentifierColumn();
        Column ORDID = new Column("ORDID", DataType.INT, false);
        List<Column> columns = new ArrayList<>();
        columns.add(ID);
        columns.add(ORDID);
        tableOrder.setColumns(columns);
        d.addTable(tableOrder);

        Table tableCust = new Table();
        tableCust.setName("XXCUST");
        List<Column> tableCustColumns = new ArrayList<>();
        Column tableCustForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableCustID = new IdentifierColumn();
        Column tableCustName = new Column("NAME", DataType.CHAR, false);
        tableCustColumns.add(tableCustForeignKey);
        tableCustColumns.add(tableCustID);
        tableCustColumns.add(tableCustName);
        tableCust.setColumns(tableCustColumns);
        d.addTable(tableCust);

        Table tableProd = new Table();
        tableProd.setName("XXPROD");
        List<Column> tableProdColumns = new ArrayList<>();
        Column tableProdForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableProdID = new IdentifierColumn();
        Column tableProdName = new Column("NAME", DataType.CHAR, false);
        Column tableProdPrice = new Column("PRICE", DataType.DECIMAL, false);
        tableProdColumns.add(tableProdForeignKey);
        tableProdColumns.add(tableProdID);
        tableProdColumns.add(tableProdName);
        tableProdColumns.add(tableProdPrice);
        tableProd.setColumns(tableProdColumns);
        d.addTable(tableProd);

        Table tableStore = new Table();
        tableStore.setName("XXSTORE");
        List<Column> tableStoreColumns = new ArrayList<>();
        Column tableStoreForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableStoreID = new IdentifierColumn();
        Column tableStoreName = new Column("NAME", DataType.CHAR, false);
        tableStoreColumns.add(tableStoreForeignKey);
        tableStoreColumns.add(tableStoreID);
        tableStoreColumns.add(tableStoreName);
        tableStore.setColumns(tableStoreColumns);
        d.addTable(tableStore);

        Table tableSales = new Table();
        tableSales.setName("XXSALES");
        List<Column> tableSalesColumns = new ArrayList<>();
        Column tableSalesForeignKey = new ForeignKeyColumn(tableStore, tableStoreID);
        Column tableSalesID = new IdentifierColumn();
        Column tableSalesName = new Column("NAME", DataType.CHAR, false);
        tableSalesColumns.add(tableSalesForeignKey);
        tableSalesColumns.add(tableSalesID);
        tableSalesColumns.add(tableSalesName);
        tableSales.setColumns(tableSalesColumns);
        d.addTable(tableSales);
    }
}
