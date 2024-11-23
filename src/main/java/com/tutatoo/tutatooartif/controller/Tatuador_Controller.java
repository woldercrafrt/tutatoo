package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Tatuador;
import com.tutatoo.tutatooartif.service.TatuadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequesMapping(path = )
public class Tatuador_Controller {

    @Autowired
    private TatuadorService TatuadorService;

    @GetMapping
    public List<Tatuador> getAll(){
        return TatuadorService.getTatuador();
    }

    @GetMapping("/{tatuadorId}")
    public Optional<Tatuador> getById(@PathVariable("tatuadorId") Long tatuadorId){
        return TatuadorService.getTatuador(tatuadorId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Tatuador tatuador){
        TatuadorService.saveOrUpdate(tatuador);
    }

    @DeleteMapping("/{tatuadorId}")
    public void delete(@PathVariable("tatuadorId") Long tatuadorId){
        tatuadorService.delete(tatuadorId);
    }
}