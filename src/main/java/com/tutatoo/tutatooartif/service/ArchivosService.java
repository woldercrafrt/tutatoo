package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Archivos;
import com.tutatoo.tutatooartif.reporitorio.ArchivosRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivosService {

    @Autowired
    ArchivosRepos archivosRepos;

    public List<Archivos> getArchivos(){
        return ArchivosRepos.findAll();
    }

    public Optional<Archivos> getArchivos(long id){
        return ArchivosRepos.findById(id);
    }

    public void saveOrUpdate(Archivos archivos){
        ArchivosRepos.save(archivos);
    }

    public void delete(Long id){
        ArchivosRepos.deleteById(id);
    }
}