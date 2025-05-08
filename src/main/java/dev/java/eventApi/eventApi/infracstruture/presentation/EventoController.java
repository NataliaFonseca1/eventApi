package dev.java.eventApi.eventApi.infracstruture.presentation;

import dev.java.eventApi.eventApi.core.entities.Event;
import dev.java.eventApi.eventApi.core.useCase.FiltrarIdentificadorEventoUsecase;
import dev.java.eventApi.eventApi.core.useCase.FiltrarNomeEventoUsecase;
import dev.java.eventApi.eventApi.core.useCase.buscarEventUseCase;
import dev.java.eventApi.eventApi.core.useCase.createEventUseCase;
import dev.java.eventApi.eventApi.infracstruture.Dto.EventDto;
import dev.java.eventApi.eventApi.infracstruture.Mapper.EventMapper;
import dev.java.eventApi.eventApi.infracstruture.persistence.EventEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
public class EventoController {
    private final createEventUseCase createEventUseCase;
    private final buscarEventUseCase buscarEventUseCase;
    private final FiltrarIdentificadorEventoUsecase filtrarIdentificadorEventoUsecase;
    private final FiltrarNomeEventoUsecase filtrarNomeEventoUsecase;
    private final EventMapper eventMapper;

    public EventoController(createEventUseCase createEventUseCase, buscarEventUseCase buscarEventUseCase, FiltrarIdentificadorEventoUsecase filtrarIdentificadorEventoUsecase, FiltrarNomeEventoUsecase filtrarNomeEventoUsecase, EventMapper eventMapper) {
        this.createEventUseCase = createEventUseCase;
        this.buscarEventUseCase = buscarEventUseCase;
        this.filtrarIdentificadorEventoUsecase = filtrarIdentificadorEventoUsecase;
        this.filtrarNomeEventoUsecase = filtrarNomeEventoUsecase;
        this.eventMapper = eventMapper;
    }
    @PostMapping("/criarEvento")
    public ResponseEntity<Map<String, Object>> criarEvento(@RequestBody EventDto eventoDto) {
        Event novoEvento = createEventUseCase.execute(eventMapper.toDomain(eventoDto));
        Map<String, Object> response = new HashMap<>();
        response.put("Mensagem: ", "Evento cadastrado com sucesso no nosso banco de dados");
        response.put("Dados do evento: ", eventMapper.toDto(novoEvento));
        return ResponseEntity.ok(response);
    }
    @GetMapping("/buscarEvento")
    public List<EventDto> buscarEvento() {
        return buscarEventUseCase.execute().stream().map(eventMapper::toDto).collect(Collectors.toList());
    }
    @GetMapping("/identificador/{identificador}")
    public ResponseEntity<EventEntity> buscarPorIdentificador(@PathVariable String identificador) {
        EventEntity evento = filtrarIdentificadorEventoUsecase.execute(identificador);
        return ResponseEntity.ok(evento);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<EventEntity> buscarPorNome(@PathVariable String name) {
        EventEntity evento = filtrarNomeEventoUsecase.execute(name);
        return ResponseEntity.ok(evento);
    }
    }

