package dev.java.eventApi.eventApi.core.entities;

import dev.java.eventApi.eventApi.core.Enums.TypeEvent;

import java.time.LocalDate;


public class Event {

private Long id;
private String name;
private String description;
private LocalDate dataInicio;
private LocalDate dataFim;
private String identificador;
private String localEvento;
private Integer capacidade;
private String organizador;
private TypeEvent type;

}
