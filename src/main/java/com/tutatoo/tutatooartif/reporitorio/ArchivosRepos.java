package com.tutatoo.tutatooartif.reporitorio;

import com.tutatoo.tutatooartif.entity.Archivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivosRepos extends JpaRepository<Archivos, Long> {
}