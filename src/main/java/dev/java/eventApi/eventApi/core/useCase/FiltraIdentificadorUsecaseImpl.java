package dev.java.eventApi.eventApi.core.useCase;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.core.gateway.EventGateway;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;

public class FiltraIdentificadorUsecaseImpl implements FiltrarIdentificadorEventoUsecase {
    private final EventGateway eventoGateway;

    public FiltraIdentificadorUsecaseImpl(EventGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }


    @Override
    public EventEntity execute(String identificador) {
        return eventoGateway.filtrarPorIdentificador(identificador)
                .orElseThrow(() -> new RuntimeException("Evento com identificador " + identificador + " não encontrado."));
    }
}
