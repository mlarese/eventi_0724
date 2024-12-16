package it.epicode.eventi_0724.configuration;

import com.github.javafaker.Faker;
import it.epicode.eventi_0724.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Locale;

@Configuration
public class LocationConfiguration {

    @Autowired // faccio dependency injection di un oggetto faker configurato in un configuration file
    Faker faker;

    @Bean
    @Scope("prototype")
    public Location getLocation() {
        // Creo un oggetto location con il nome di una città italiana
        // da usare per salvare dati demo nel db
        Location location = new Location();
        location.setNome(faker.address().cityName());
        return location;
    }
}
