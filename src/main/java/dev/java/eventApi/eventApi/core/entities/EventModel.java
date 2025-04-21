package dev.java.eventApi.eventApi.core.entities;

import dev.java.eventApi.eventApi.core.Enums.TypeEvent;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jdk.jfr.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


public class EventModel {

private Long id;
private String name;
private String description;
private LocalDate inicio;
private LocalDate fim;
private String identificador;
private String local;
private String capacidade;
private TypeEvent type;

}
