package dev.java.eventApi.eventApi.infracstruture.gateway;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.core.gateway.EventGateway;
import dev.java.eventApi.eventApi.infracstruture.Mapper.EventoEntityMapper;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EventRepositoryGateway implements EventGateway {
    private final EventRepository eventRepository;
    private final EventoEntityMapper eventoEntityMapper;

    public EventRepositoryGateway(EventRepository eventRepository, EventoEntityMapper eventoEntityMapper) {
        this.eventRepository = eventRepository;
        this.eventoEntityMapper = eventoEntityMapper;
    }

    @Override
    public Event criarEvento(Event event) {
        EventEntity eventoEntity = eventoEntityMapper.toEntity(event);
        EventEntity novoEvent = eventRepository.save(eventoEntity);
        return eventoEntityMapper.toDomain(novoEvent);
    }

    @Override
    public List<Event> buscarEvento() {
        return eventRepository.findAll().stream().map(eventoEntityMapper::toDomain).toList();
    }
    @Override
    public boolean existePorIdentificador(String identificador) {
        return eventRepository.findAll().stream()
                .anyMatch(evento -> evento.getIdentificador().equalsIgnoreCase(identificador));
    }

    @Override
    public Optional<EventEntity> filtrarPorIdentificador(String identificador) {
        return eventRepository.findByIdentificador(identificador);
    }

    @Override
    public Optional<EventEntity> filtrarPorNome(String name) {
        return eventRepository.findByNameIgnoreCase(name);
    }
}
