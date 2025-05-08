package dev.java.eventApi.eventApi.infracstruture.persistence;

import dev.java.eventApi.eventApi.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity,Long> {
    Optional<EventEntity> findByIdentificador(String identificador);
    Optional<EventEntity> findByNameIgnoreCase(String name);
}
