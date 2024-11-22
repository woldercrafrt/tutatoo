package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Usuario;
import com.tutatoo.tutatooartif.reporitorio.UsuarioRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {
    @Autowired
    UsuarioRepos UsuarioRepos;

    public List<Usuario> getUsuario(){
        return UsuarioRepos.findAll();
    }

    public Optional<Usuario> getUsuario(long id){
        return UsuarioRepos.findById(id);
    }

    public void saveOrUpdate(Usuario usuario){
        UsuarioRepos.save(usuario);

    }
    public void delete(Long id){
        UsuarioRepos.deleteById(id);

    }




}
