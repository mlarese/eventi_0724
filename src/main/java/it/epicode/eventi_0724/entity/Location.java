package it.epicode.eventi_0724.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "locations")
// tabella nel db
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "location")
    @ToString.Exclude
    private List<Evento> eventi = new ArrayList<>();
}
