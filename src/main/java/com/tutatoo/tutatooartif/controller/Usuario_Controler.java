package com.tutatoo.tutatooartif.controller;

import com.tutatoo.tutatooartif.entity.Usuario;
import com.tutatoo.tutatooartif.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class Usuario_Controler {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll (){
        return usuarioService.getUsuario();

    }
    @GetMapping("/{usuarioId}")
    public Optional<Usuario> getBId (@PathVariable("usuarioId") Long usuarioId){
        return usuarioService.getUsuario(usuarioId);

    }
    @PostMapping
    public void saaveUpdate (@RequestBody Usuario usuario){
         usuarioService.saveOrUpdate(usuario);

    }
    @DeleteMapping("/{usuarioId}")
    public void saaveUpdate (@PathVariable("usuarioId") Long usuarioId){
        usuarioService.delete(usuarioId);

    }

}
