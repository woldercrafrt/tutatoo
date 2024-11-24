package com.tutatoo.tutatooartif.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RealidadAumentada")
public class RealidadAumentada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "realidadID")
    private int realidadID;

    @Column(name = "modelo", length = 255)
    private String modelo;

    @Column(name = "imagen", length = 255)
    private String imagen;

    @Column(name = "usuarioID")
    private int usuarioID;

    @Column(name = "IDguardar")
    private int IDguardar;

    @OneToMany
    @JoinColumn(name = "usuarioID", nullable = false)
    private Usuario usuario;
    @OneToMany
    @JoinColumn(name = "IDguardar", nullable = false)
    private Tatuador tatuador;
}
