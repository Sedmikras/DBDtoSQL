package cz.kiv.sar.preprocessing.exceptions;

/**
 * Arguments exception
 */
public class ArgumentsException extends Exception {
    public ArgumentsException() {
        super("Bad usage - there are three arguments <input-file> <output-file> <sql-dialect>");
    }

    public ArgumentsException(String message) {
        super(message);
    }
}
