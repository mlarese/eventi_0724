package it.epicode.eventi_0724;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// applicazione Spring Boot generata in automatico
// contiene il main da lanciare per far partire l'applicazione
// tutte le classi create devono essere sotto il package principale
// specificato in questa classe
// altrimenti non vengono trovate per le dependency injection
public class Eventi0724Application {
	public static void main(String[] args) {
		SpringApplication.run(Eventi0724Application.class, args);
	}

}
