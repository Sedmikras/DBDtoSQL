package cz.kiv.sar;

import cz.kiv.sar.antlr.DBDLexer;
import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.codegen.CodeGen;
import cz.kiv.sar.preprocessing.Configuration;
import cz.kiv.sar.preprocessing.SimpleProcessor;
import cz.kiv.sar.structure.sql.Database;
import cz.kiv.sar.visitors.SourceVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.logging.LogManager;

public class Main {

    static {
        // workaround to disable jooq logging
        LogManager.getLogManager().reset();
    }

    public static void main(String[] args) {
        try {
            Configuration g = new Configuration(args);
            CharStream s = new SimpleProcessor().processFile(g.getFileName());
            DBDLexer lexer = new DBDLexer(s);
            DBDParser parser = new DBDParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            SourceVisitor v = new SourceVisitor();
            Database d = v.visitSource(parser.source());
            CodeGen.codeGen(d);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}
