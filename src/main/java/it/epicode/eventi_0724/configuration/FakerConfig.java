package it.epicode.eventi_0724.configuration;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
public class FakerConfig {

    @Bean
    public Faker getFaker() {
        // creo un oggetto faker con la localizzazione italiana
        // da inniettare in altre classi
        Faker faker = new Faker(Locale.ITALIAN);
        return faker;
    }
}
