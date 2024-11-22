package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Local;
import com.tutatoo.tutatooartif.reporitorio.LocalRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealidadAumentadaService {
    @Autowired
    RealidadRepos realidadRepos;

    public List<Realidad> getRealidad() {return realidadRepos.findAll();}

    public Optional<Realidad> getRealidad(long id) {return realidadRepos.findById(id);}

    public void safeOrUpdate (Realidad realidad){realidadRepos.save(realidad);}

    public void delete (Long id) {realidadRepos.deleteById(id);}
}