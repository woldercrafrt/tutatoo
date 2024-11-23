package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Tatuador;
import com.tutatoo.tutatooartif.reporitorio.TatuadorRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TatuadorService {

    @Autowired
    TatuadorRepos tatuadorRepos;

    public List<Tatuador> getTatuador(){
        return TatuadorRepos.findAll();
    }

    public Optional<Tatuador> getTatuador(long id){
        return TatuadorRepos.findById(id);
    }

    public void saveOrUpdate(Tatuador tatuador){
        TatuadorRepos.save(tatuador);
    }

    public void delete(Long id){
        TatuadorRepos.deleteById(id);
    }
}