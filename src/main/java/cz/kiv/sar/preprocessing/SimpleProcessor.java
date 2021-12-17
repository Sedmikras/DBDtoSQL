package cz.kiv.sar.preprocessing;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;

public class SimpleProcessor {
    private final static int LAST_POSSIBLE_CHARACTER_POSITION = 71;

    public CharStream processFile (String filePath) throws Exception {
        File initialFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(initialFile));
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = br.readLine()) != null) {
            if(!line.startsWith("*")) {
                sb.append(line, 0, LAST_POSSIBLE_CHARACTER_POSITION);
                sb.append(System.getProperty("line.separator"));
            }
        }
        br.close();
        CharStreams.fromString(sb.toString());
        return CharStreams.fromString(sb.toString());
    }
}
