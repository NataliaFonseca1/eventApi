package dev.java.eventApi.eventApi.infracstruture.Mapper;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventoEntityMapper {


    public EventEntity toEntity(Event event) {
        return new EventEntity(
        event.id(),
        event.name(),
        event.description(),
        event.dataInicio(),
        event.dataFim(),
        event.identificador(),
        event.localEvento(),
        event.capacidade(),
        event.organizador(),
        event.imgUrl(),
        event.tipo()
        );
    }

    public Event toDomain(EventEntity eventEntity){
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getDataInicio(),
                eventEntity.getDataFim(),
                eventEntity.getIdentificador(),
                eventEntity.getLocalEvento(),
                eventEntity.getCapacidade(),
                eventEntity.getOrganizador(),
                eventEntity.getImgUrl(),
                eventEntity.getTipo()
                );
    }
}
