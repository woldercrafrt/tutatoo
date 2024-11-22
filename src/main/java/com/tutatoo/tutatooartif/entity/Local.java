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

    @Column(name = "nombreLocal", length = 100)
    private String nombreLocal;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "municipio", length = 100)
    private String municipio;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
