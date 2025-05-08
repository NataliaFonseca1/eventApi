package dev.java.eventApi.eventApi.infracstruture.Exception;

public class DuplicateEventException extends RuntimeException{
    public DuplicateEventException(String message) {
        super(message);
    }
}
