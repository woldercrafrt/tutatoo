package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Archivos;
import com.tutatoo.tutatooartif.service.ArchivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequesMapping(path = )
public class Archivos_Controller {

    @Autowired
    private ArchivosService ArchivosService;

    @GetMapping
    public List<Archivos> getAll(){
        return ArchivosService.getArchivos();
    }

    @GetMapping("/{archivosId}")
    public Optional<Archivos> getById(@PathVariable("archivosId") Long archivosId){
        return ArchivosService.getArchivos(archivosId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Archivos archivos){
        ArchivosService.saveOrUpdate(archivos);
    }

    @DeleteMapping("/{archivosId}")
    public void delete(@PathVariable("archivosId") Long archivosId){
        ArchivosService.delete(archivosId);
    }
}