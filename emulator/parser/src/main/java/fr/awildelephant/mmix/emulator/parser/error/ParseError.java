package fr.awildelephant.mmix.emulator.parser.error;

public class ParseError extends RuntimeException {

    public ParseError() {

    }

    public ParseError(Throwable t) {
        super(t);
    }
}
