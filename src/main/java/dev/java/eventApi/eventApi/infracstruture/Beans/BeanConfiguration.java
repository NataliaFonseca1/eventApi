package dev.java.eventApi.eventApi.infracstruture.Beans;

import dev.java.eventApi.eventApi.core.gateway.EventGateway;
import dev.java.eventApi.eventApi.core.useCase.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public createEventUseCase criarEvento(EventGateway eventGateway){
    return new createEventImpl(eventGateway);
    }


    @Bean
    public buscarEventUseCase buscarEventoUsecase(EventGateway eventoGateway) {
        return new BuscarEventoImpl(eventoGateway);
    }

    @Bean
    public FiltrarIdentificadorEventoUsecase filtrarIdentificadorEventoUsacase(EventGateway eventoGateway) {
        return new FiltraIdentificadorUsecaseImpl(eventoGateway);
    }

    @Bean
    public FiltrarNomeEventoUsecase filtrarNomeEventoUsecase(EventGateway eventoGateway) {
        return new FiltrarNomeEventoUsecaseImpl(eventoGateway);
    }




}
