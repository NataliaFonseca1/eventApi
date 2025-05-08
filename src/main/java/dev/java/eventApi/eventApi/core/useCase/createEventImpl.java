package dev.java.eventApi.eventApi.core.useCase;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.core.gateway.EventGateway;
import dev.java.eventApi.eventApi.infracstruture.Exception.DuplicateEventException;
import org.springframework.stereotype.Service;


public class createEventImpl implements  createEventUseCase{

    private final EventGateway eventGateway;

    public createEventImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event evento) {
        if (eventGateway.existePorIdentificador(evento.identificador())) {
            throw new DuplicateEventException("O identificador numero: " + evento.identificador() + " ja esta em uso para outro evento!");
        }
        return eventGateway.criarEvento(evento);
    }
}
