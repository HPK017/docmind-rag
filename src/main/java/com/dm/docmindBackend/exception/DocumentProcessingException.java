package com.dm.docmindBackend.exception;

public class DocumentProcessingException extends RuntimeException{

    public DocumentProcessingException(String message) {
        super(message);
    }

    public DocumentProcessingException() {
        super("Error in Processing Documents");
    }

    public DocumentProcessingException(String message, Throwable ex) {
        super(message, ex);
    }
}
