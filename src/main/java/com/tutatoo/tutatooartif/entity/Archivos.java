package com.tutatoo.tutatooartif.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Archivos")
public class Archivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "IDguardar")
    private int IDguardar;

    @Column(name = "urlimagen")
    private String urlimagen;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "usuarioID")
    private int usuarioID;

    @ManyToOne
    @JoinColumn(name = "usuarioID", nullable = false)
    private Usuario usuario;
}
