package com.tutatoo.tutatooartif.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comentario")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "id_publicacion")
    private Long idPublicacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "comentario", length = 500)
    private String comentario;

    @Column(name = "puntuacion")
    private Integer puntuacion;
}
