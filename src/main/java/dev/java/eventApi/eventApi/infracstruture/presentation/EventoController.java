package dev.java.eventApi.eventApi.infracstruture.presentation;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.core.useCase.createEventUseCase;
import dev.java.eventApi.eventApi.infracstruture.Dto.EventDto;
import dev.java.eventApi.eventApi.infracstruture.Mapper.EventMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EventoController {
    private final createEventUseCase createEventUseCase;
    private final EventMapper eventMapper;

    public EventoController(createEventUseCase createEventUseCase, EventMapper eventMapper) {
        this.createEventUseCase = createEventUseCase;
        this.eventMapper = eventMapper;
    }
    @PostMapping("criarEvento")
        public EventDto criarEvento(EventDto eventDto) {
            Event newEvent = createEventUseCase.execute(eventMapper.toDomain(eventDto));
            return eventMapper.toDto(newEvent);
    }
    }

