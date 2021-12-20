package cz.kiv.sar;

import cz.kiv.sar.antlr.DBDLexer;
import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.preprocessing.Configuration;
import cz.kiv.sar.preprocessing.SimpleProcessor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        try {
            Configuration g = new Configuration(args);
            CharStream s = new SimpleProcessor().processFile(g.getFileName());
            DBDLexer lexer = new DBDLexer(s);
            DBDParser parser = new DBDParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.source();
            System.out.println(tree.getText());
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}
