package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Comentario;
import com.tutatoo.tutatooartif.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/comentario")
public class Comentario_Controller {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping
    public List<Comentario> getAll(){
        return comentarioService.getComentarios();
    }

    @GetMapping("/{comentarioId}")
    public Optional<Comentario> getById(@PathVariable("comentarioId") Long comentarioId){
        return comentarioService.getComentario(comentarioId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Comentario comentario){
        comentarioService.saveOrUpdate(comentario);
    }

    @DeleteMapping("/{comentarioId}")
    public void delete(@PathVariable("comentarioId") Long comentarioId){
        comentarioService.delete(comentarioId);
    }
}
