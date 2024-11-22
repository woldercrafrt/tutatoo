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

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "usuarioEmail", length = 100, unique = true, nullable = false)
    private String usuarioEmail;

    @Column(name = "usuarioPassword", length = 100)
    private String usuarioPassword;

    @Column(name = "rol", length = 100)
    private String rol;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Publicacion> publicaciones;
}
