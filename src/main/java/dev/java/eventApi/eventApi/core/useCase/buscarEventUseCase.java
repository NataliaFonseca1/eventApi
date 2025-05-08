package dev.java.eventApi.eventApi.core.useCase;

import dev.java.eventApi.eventApi.core.entities.Event;

import java.util.List;

public interface buscarEventUseCase {
    public List<Event> execute();
}

