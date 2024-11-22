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

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "urlImagen", length = 255)
    private String urlImagen;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
