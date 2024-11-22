package com.tutatoo.tutatooartif.service;

import com.tutatoo.tutatooartif.entity.Local;
import com.tutatoo.tutatooartif.reporitorio.LocalRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendarCitasService {
    @Autowired
    AgendarRepos agendarRepos;

    public List<Agendar> getAgendar() {return agendarRepos.findAll();}

    public Optional<Agendar> getAgendar(long id) {return agendarRepos.findById(id);}

    public void safeOrUpdate (Agendar agendar){agendarRepos.save(agendar);}

    public void delete (Long id) {agendarRepos.deleteById(id);}
}