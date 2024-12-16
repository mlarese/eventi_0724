package it.epicode.eventi_0724.repository;

import it.epicode.eventi_0724.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;


// il dao per la tabella location
// estendendo JpaRepository ho a disposizione tutti i metodi per fare operazioni CRUD
// senza doverli scrivere
// devo dirgli il tipo di classe (Location) e il tipo di chiave primaria (Long)
public interface LocationRepo extends JpaRepository<Location, Long> {

}
