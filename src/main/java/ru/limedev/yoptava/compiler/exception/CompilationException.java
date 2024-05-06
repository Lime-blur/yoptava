package ru.limedev.yoptava.compiler.exception;

public class CompilationException extends Exception {

    public CompilationException(String s) {
        super(s);
    }

    public CompilationException(Exception e) {
        super(e);
    }
}
