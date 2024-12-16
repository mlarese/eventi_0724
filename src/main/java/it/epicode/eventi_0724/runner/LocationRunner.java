package it.epicode.eventi_0724.runner;

import it.epicode.eventi_0724.entity.Location;
import it.epicode.eventi_0724.repository.LocationRepo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


// il runner per la tabella location
// è una classe che estende ApplicationRunner
// e implementa il metodo run
// viene eseguita all'avvio dell'applicazione

@Component // ricordarsi di inserirlo se no spring non esegue il runner e non fa la dependency injection
@Order(1) // definisco l'ordine di esecuzione del runner nel caso siano più di uno
public class LocationRunner  implements ApplicationRunner {
    @Autowired // fa la dependency injection
    private ObjectProvider<Location> locationProvider; // un provider è in grado di restituire  bean di tipo prototype

    @Autowired
    private LocationRepo locationRepo; // il dao per la tabella location

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // controllo se la tabella è vuota
        // se è vuota
        // inserisco 30 location
        if(locationRepo.count() == 0) {
            for (int i = 0; i < 30; i++) {
                Location location = locationProvider.getObject();
                locationRepo.save(location);
            }
        }

    }
}
