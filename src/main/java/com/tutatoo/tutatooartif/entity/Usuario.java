package com.tutatoo.tutatooartif.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuarioID")
    private int usuarioID;

    @Column(name = "nombre", length = 100, unique = true, nullable = false)
    private String nombre;

    @Column(name = "correo", length = 100)
    private String correo;

    @Column(name = "contraseña", length = 255)
    private String contraseña;

    @ManyToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Publicacion> publicaciones;
}
