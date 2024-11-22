package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Comentario;
import com.tutatoo.tutatooartif.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/realidad")
public class RealidadAumentada_Controller {
    @Autowired
    private RealidadService realidadService;

    @GetMapping
    public list<Realidad> getAll(){return realidadService.getRealidad();}

    @GetMapping("/{realidadId}")
    public Optional<Realidad> getById(@PathVariable("realidadId") Long realidadId){
        return realidadService.getRealidad(realidadId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Realidad realidad){
        realidadService.saveOrUpdate(realidad);
    }

    @DeleteMapping("/{realidadId}")
    public void delete(@PathVariable("realidadId") Long realidadId){
        realidadService.delete(realidadId);
    }
}
