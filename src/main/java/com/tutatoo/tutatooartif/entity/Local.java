package com.tutatoo.tutatooartif.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "local")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "localID")
    private int localID;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @OneToMany
    @JoinColumn(name = "tatuadorID", nullable = false)
    private Tatuador tatuador;

    @ManyToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Tatuador> tatuador;
}
