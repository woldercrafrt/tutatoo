package com.tutatoo.tutatooartif.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "AgendarCitas")
public class AgendarCitas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "citaID")
    private int citaID;

    @Column(name = "hora")
    private String hora;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "usuarioID")
    private int usuarioID;

    @Column(name = "tatuadorID")
    private int tatuadorID;

    @ManyToOne
    @JoinColumn(name = "usuarioID", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "tatuadorID", nullable = false)
    private Tatuador tatuador;
}
