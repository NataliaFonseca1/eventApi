package dev.java.eventApi.eventApi.infracstruture.persistence;

import dev.java.eventApi.eventApi.core.Enums.TypeEvent;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="eventos")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String identificador;
    private String localEvento;
    private Integer capacidade;
    private String organizador;
    @Column(name = "img_url")
    private String imgUrl;
    @Enumerated(EnumType.STRING)
    private TypeEvent tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public TypeEvent getTipo() {
        return tipo;
    }

    public void setTipo(TypeEvent tipo) {
        this.tipo = tipo;
    }

    public EventEntity(Long id, String name, String description, LocalDateTime dataInicio, LocalDateTime dataFim, String identificador, String localEvento, Integer capacidade, String organizador, String imgUrl, TypeEvent tipo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.identificador = identificador;
        this.localEvento = localEvento;
        this.capacidade = capacidade;
        this.organizador = organizador;
        this.imgUrl = imgUrl;
        this.tipo = tipo;
    }
}
