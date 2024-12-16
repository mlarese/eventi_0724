package it.epicode.eventi_0724.configuration;

import com.github.javafaker.Faker;
import it.epicode.eventi_0724.entity.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EventoConfiguration {
    @Autowired
    Faker faker;

    @Bean
    @Scope("prototype")
    public Evento createEvento() {
        Evento evento = new Evento();
        evento.setNome(faker.name().fullName());
        evento.setDescrizione(faker.lorem().sentence());
        return evento;
    }
}
