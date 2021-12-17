package cz.kiv.sar.preprocessing.exceptions;

public class ArgumentsException extends Exception{
    public ArgumentsException() {
        super("Bad usage - there is one argument <fileName>");
    }
}
