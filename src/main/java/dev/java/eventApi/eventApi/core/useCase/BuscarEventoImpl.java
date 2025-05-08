package dev.java.eventApi.eventApi.core.useCase;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.core.gateway.EventGateway;
import org.springframework.stereotype.Service;

import java.util.List;

public class BuscarEventoImpl implements buscarEventUseCase{

    private final EventGateway eventGateway;

    public BuscarEventoImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return eventGateway.buscarEvento();
    }
}
