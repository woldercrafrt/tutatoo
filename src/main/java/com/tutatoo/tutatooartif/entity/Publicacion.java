package com.tutatoo.tutatooartif.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "publicacioID")
    private int publicacionID;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "comentarios")
    private String comentarios;

    @Column(name = "calificacion")
    private int calificacion;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "urlImagen", length = 255)
    private String urlImagen;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "usuarioID")
    private int usuarioID;

    @Column(name = "tatuadorID")
    private int tatuadorID;

    @ManyToMany
    @JoinColumn(name = "usuarioID", nullable = false)
    private Usuario usuario;
    @ManyToMany
    @JoinColumn(name = "tatuadorID", nullable = false)
    private Tatuador tatuador;
}
