package cz.kiv.sar.preprocessing;

import cz.kiv.sar.preprocessing.exceptions.ArgumentsException;
import org.jooq.SQLDialect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Configuration {
    private static final SQLDialect DEFAULT_DIALECT = SQLDialect.MYSQL;

    private final String inputFile;
    private final String outputFile;
    private final SQLDialect sqlDialect;

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

    private void checkFile(String path) throws FileNotFoundException {
        File f = new File(path);
        if (!f.exists() || f.isDirectory()) {
            throw new FileNotFoundException();
        }
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public SQLDialect getSqlDialect() {
        return sqlDialect;
    }
}
