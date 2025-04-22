package dev.java.eventApi.eventApi.infracstruture.Mapper;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.infracstruture.Dto.EventDto;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public EventDto toDto(Event evento) {
        return new EventDto(
                evento.id(),
                evento.name(),
                evento.description(),
                evento.dataInicio(),
                evento.dataFim(),
                evento.identificador(),
                evento.localEvento(),
                evento.capacidade(),
                evento.organizador(),
                evento.imgUrl(),
                evento.tipo()
        );
    }

    public Event toDomain(EventDto eventoDto) {
        return new Event(
                eventoDto.id(),
                eventoDto.name(),
                eventoDto.description(),
                eventoDto.dataInicio(),
                eventoDto.dataFim(),
                eventoDto.identificador(),
                eventoDto.localEvento(),
                eventoDto.capacidade(),
                eventoDto.organizador(),
                eventoDto.imgUrl(),
                eventoDto.tipo()
        );
    }
}
