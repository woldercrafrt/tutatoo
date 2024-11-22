package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Local;
import com.tutatoo.tutatooartif.reporitorio.LocalRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalService {
    @Autowired
    LocalRepos localRepos;

    public List<Local> getLocal(){
        return localRepos.findAll();
    }

    public Optional<Local> getLocal(long id){
        return localRepos.findById(id);
    }

    public void saveOrUpdate(Local local){
        localRepos.save(local);
    }

    public void delete(Long id){
        localRepos.deleteById(id);
    }
}
