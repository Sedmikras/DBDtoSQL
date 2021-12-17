package cz.kiv.sar;

import cz.kiv.sar.antlr.DBDLexer;
import cz.kiv.sar.antlr.DBDParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            DBDLexer lexer = new DBDLexer(CharStreams.fromFileName("resources/test-file2.dbd"));
            DBDParser parser = new DBDParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.source();
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}
