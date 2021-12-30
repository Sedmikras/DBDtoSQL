package cz.kiv.sar.parser.exceptions;

import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Created by Martin Forejt on 30.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class ParserException extends ParseCancellationException {
    public ParserException(String message) {
        super(message);
    }
}
