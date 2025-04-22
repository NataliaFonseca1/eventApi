package dev.java.eventApi.eventApi.core.gateway;

import dev.java.eventApi.eventApi.core.entities.Event;

public interface  EventGateway {

    Event criarEvento(Event event);
}
