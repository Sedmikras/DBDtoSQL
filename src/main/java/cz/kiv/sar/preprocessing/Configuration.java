package cz.kiv.sar.preprocessing;

import cz.kiv.sar.preprocessing.exceptions.ArgumentsException;
import org.jooq.SQLDialect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * App configuration
 * <p>
 * Two (or Three) arguments are passed to app:
 * - input file - dbd
 * - output file - sql
 * - sql dialect (optional)
 */
public class Configuration {
    private static final SQLDialect DEFAULT_DIALECT = SQLDialect.MYSQL;

    /**
     * Path to dbd input file
     */
    private final String inputFile;
    /**
     * Path to sql output file
     */
    private final String outputFile;
    /**
     * Sql dialect
     */
    private final SQLDialect sqlDialect;

    /**
     * Create configuration based on app arguments
     *
     * @param args [input-file, output-file, sql-dialect]
     * @throws Exception on invalid arguments
     */
    public Configuration(String[] args) throws Exception {
        if (args.length != 2 && args.length != 3) {
            throw new ArgumentsException();
        }

        inputFile = args[0];
        outputFile = args[1];
        checkFile(inputFile);

        if (args.length == 3) {
            String dialectName = args[2];
            try {
                SQLDialect dialect = SQLDialect.valueOf(dialectName.toUpperCase());
                if (dialect == SQLDialect.DEFAULT) dialect = DEFAULT_DIALECT;
                sqlDialect = dialect;
            } catch (IllegalArgumentException e) {
                throw new ArgumentsException("Dialect " + dialectName + " not exists. Available dialects: "
                        + Arrays.toString(SQLDialect.values()));
            }
        } else {
            sqlDialect = DEFAULT_DIALECT;
        }
    }

    public Configuration(String inputFile, String outputFile, SQLDialect sqlDialect) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.sqlDialect = sqlDialect;
    }

    /**
     * Check if input file is valid (exist, not dir)
     *
     * @param path file path
     * @throws FileNotFoundException when file not valid (exists, not dir)
     */
    private void checkFile(String path) throws FileNotFoundException {
        File f = new File(path);
        if (!f.exists() || f.isDirectory()) {
            throw new FileNotFoundException();
        }
    }

    /**
     * Get dbd input file path
     *
     * @return dbd input file path
     */
    public String getInputFile() {
        return inputFile;
    }

    /**
     * Get sql output file path
     *
     * @return sql output file path
     */
    public String getOutputFile() {
        return outputFile;
    }

    /**
     * Get sql dialect
     *
     * @return sql dialect
     */
    public SQLDialect getSqlDialect() {
        return sqlDialect;
    }
}
