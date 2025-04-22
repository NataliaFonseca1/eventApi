package dev.java.eventApi.eventApi.infracstruture.Dto;

import dev.java.eventApi.eventApi.core.Enums.TypeEvent;


import java.time.LocalDateTime;

public record EventDto(Long id,
                        String name,
                        String description,
                        LocalDateTime dataInicio,
                        LocalDateTime dataFim,
                       String identificador,
                        String localEvento,
                        Integer capacidade,
                       String organizador,
                       String imgUrl,
                       TypeEvent tipo) {}
