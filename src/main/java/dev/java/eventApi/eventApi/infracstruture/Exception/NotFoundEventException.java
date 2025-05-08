package dev.java.eventApi.eventApi.infracstruture.Exception;

public class NotFoundEventException extends  RuntimeException{
    public NotFoundEventException(String message) {
        super(message);
    }
}
