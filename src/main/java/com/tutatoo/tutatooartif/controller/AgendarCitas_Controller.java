package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Comentario;
import com.tutatoo.tutatooartif.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/agendar")
public class AgendarCitas_Controller {
    @Autowired
    private AgendarService agendarService;

    @GetMapping
    public list<Agendar> getAll(){return agendarService.getAgendar();}

    @GetMapping("/{agendarId}")
    public Optional<Agendar> getById(@PathVariable("agendarId") Long agendarId){
        return agendarService.getAgendar(agendarId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Agendar agendar){
        agendarService.saveOrUpdate(agendar);
    }

    @DeleteMapping("/{agendarId}")
    public void delete(@PathVariable("agendarId") Long agendarId){
        agendarService.delete(agendarId);
    }
}
