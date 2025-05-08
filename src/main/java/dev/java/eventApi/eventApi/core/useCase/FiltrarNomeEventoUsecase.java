package dev.java.eventApi.eventApi.core.useCase;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;

public interface FiltrarNomeEventoUsecase {
    public Event execute(String name);
}
