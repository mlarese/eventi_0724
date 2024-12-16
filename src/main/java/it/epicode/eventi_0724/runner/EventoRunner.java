package it.epicode.eventi_0724.runner;

import com.github.javafaker.Faker;
import it.epicode.eventi_0724.entity.Evento;
import it.epicode.eventi_0724.entity.Location;
import it.epicode.eventi_0724.repository.EventoRepo;
import it.epicode.eventi_0724.repository.LocationRepo;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Order(2)
public class EventoRunner implements ApplicationRunner {
        @Autowired
        private EventoRepo eventoRepo;

        @Autowired
        private Faker faker;

        @Autowired
        private ObjectProvider<Evento> eventoProvider;

        @Autowired
        private LocationRepo locationRepo;

        @Override
        @Transactional
        public void run(ApplicationArguments args) throws Exception {

            List<Location> locations = locationRepo.findAll();
            if(eventoRepo.count() == 0) {
                for(int i = 0; i < 20; i++) {
                    Evento evento = eventoProvider.getObject();
                    evento.setLocation( locations.get(faker.number().numberBetween(0, locations.size())) );
                    eventoRepo.save(evento);
                }
            }

            // la location è contenuta nell'evento
            // caricato l'evento la connessione si chiude e non è più possibile accedere alla location
            // usando @Transactional si evita il problema perchè la connessione rimane aperta in tutto il metodo

            eventoRepo.findAll().forEach(System.out::println);

        }
}