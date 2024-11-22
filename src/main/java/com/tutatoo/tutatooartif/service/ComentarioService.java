package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Comentario;
import com.tutatoo.tutatooartif.reporitorio.ComentarioRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {
    @Autowired
    ComentarioRepos comentarioRepos;

    public List<Comentario> getComentarios(){
        return comentarioRepos.findAll();
    }

    public Optional<Comentario> getComentario(long id){
        return comentarioRepos.findById(id);
    }

    public void saveOrUpdate(Comentario comentario){
        comentarioRepos.save(comentario);
    }

    public void delete(Long id){
        comentarioRepos.deleteById(id);
    }
}
