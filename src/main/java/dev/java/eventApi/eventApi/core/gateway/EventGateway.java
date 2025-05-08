package dev.java.eventApi.eventApi.core.gateway;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;

import java.util.List;
import java.util.Optional;

public interface  EventGateway {

    Event criarEvento(Event event);
    List<Event> buscarEvento();
    Optional<EventEntity> filtrarPorIdentificador(String identificador);
    Optional<EventEntity> filtrarPorNome(String name);
    boolean existePorIdentificador(String identificador);
}
