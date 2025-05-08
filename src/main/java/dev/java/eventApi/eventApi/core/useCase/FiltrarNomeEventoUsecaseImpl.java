package dev.java.eventApi.eventApi.core.useCase;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.core.gateway.EventGateway;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;

public class FiltrarNomeEventoUsecaseImpl implements FiltrarNomeEventoUsecase {
    private final EventGateway eventoGateway;


    public FiltrarNomeEventoUsecaseImpl(EventGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Event execute(String name) {
        return eventoGateway.filtrarPorNome(name)
                .orElseThrow(() -> new RuntimeException("Evento com nome " + name + " não encontrado."));
    }
}
