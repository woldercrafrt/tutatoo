package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Publicacion;
import com.tutatoo.tutatooartif.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/publicacion")
public class Publicacion_Controller {
    @Autowired
    private PublicacionService publicacionService;

    @GetMapping
    public List<Publicacion> getAll(){
        return publicacionService.getPublicaciones();
    }

    @GetMapping("/{publicacionId}")
    public Optional<Publicacion> getById(@PathVariable("publicacionId") Long publicacionId){
        return publicacionService.getPublicacion(publicacionId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Publicacion publicacion){
        publicacionService.saveOrUpdate(publicacion);
    }

    @DeleteMapping("/{publicacionId}")
    public void delete(@PathVariable("publicacionId") Long publicacionId){
        publicacionService.delete(publicacionId);
    }
}
