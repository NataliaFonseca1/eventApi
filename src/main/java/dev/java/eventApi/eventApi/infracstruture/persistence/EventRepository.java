package dev.java.eventApi.eventApi.infracstruture.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Long, EventEntity> {
}
