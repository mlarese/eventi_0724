package it.epicode.eventi_0724.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "locations")
// tabella nel db
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
}
