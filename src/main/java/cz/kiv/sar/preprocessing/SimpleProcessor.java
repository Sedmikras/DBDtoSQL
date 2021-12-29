package cz.kiv.sar.preprocessing;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;

/**
 * Simple processor is used to (pre)process input dbd file
 * and create {@link CharStream} for further processing
 */
public class SimpleProcessor {
    /**
     * Use only first n chars each line from dbd file
     */
    private final static int LAST_POSSIBLE_CHARACTER_POSITION = 71;

    /**
     * (Pre)process dbd file:
     * - remove comments
     * - use only first {@link SimpleProcessor#LAST_POSSIBLE_CHARACTER_POSITION} characters each line
     *
     * @param filePath dbd input file path
     * @return char stream
     * @throws Exception on any file related error
     */
    public CharStream processFile(String filePath) throws Exception {
        File initialFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(initialFile));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.startsWith("*")) {
                sb.append(line, 0, LAST_POSSIBLE_CHARACTER_POSITION);
                sb.append(System.getProperty("line.separator"));
            }
        }
        br.close();
        CharStreams.fromString(sb.toString());
        return CharStreams.fromString(sb.toString());
    }
}
