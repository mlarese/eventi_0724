package it.epicode.eventi_0724.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String descrizione;

    @ManyToOne

    private Location location;

}
