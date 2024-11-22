package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Publicacion;
import com.tutatoo.tutatooartif.reporitorio.PublicacionRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacionService {
    @Autowired
    PublicacionRepos publicacionRepos;

    public List<Publicacion> getPublicaciones(){
        return publicacionRepos.findAll();
    }

    public Optional<Publicacion> getPublicacion(long id){
        return publicacionRepos.findById(id);
    }

    public void saveOrUpdate(Publicacion publicacion){
        publicacionRepos.save(publicacion);
    }

    public void delete(Long id){
        publicacionRepos.deleteById(id);
    }
}
