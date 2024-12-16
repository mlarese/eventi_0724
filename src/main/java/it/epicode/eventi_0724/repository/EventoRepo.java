package it.epicode.eventi_0724.repository;

import it.epicode.eventi_0724.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepo extends JpaRepository<Evento, Long> {
}
