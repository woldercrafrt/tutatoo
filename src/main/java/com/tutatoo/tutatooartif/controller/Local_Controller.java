package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Local;
import com.tutatoo.tutatooartif.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/local")
public class Local_Controller {
    @Autowired
    private LocalService localService;

    @GetMapping
    public List<Local> getAll(){
        return localService.getLocal();
    }

    @GetMapping("/{localId}")
    public Optional<Local> getById(@PathVariable("localId") Long localId){
        return localService.getLocal(localId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Local local){
        localService.saveOrUpdate(local);
    }

    @DeleteMapping("/{localId}")
    public void delete(@PathVariable("localId") Long localId){
        localService.delete(localId);
    }
}
