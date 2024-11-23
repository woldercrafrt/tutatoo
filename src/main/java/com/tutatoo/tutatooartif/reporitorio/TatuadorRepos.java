package com.tutatoo.tutatooartif.reporitorio;

import com.tutatoo.tutatooartif.entity.Tatuador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TatuadorRepos extends JpaRepository<Tatuador, Long> {
}