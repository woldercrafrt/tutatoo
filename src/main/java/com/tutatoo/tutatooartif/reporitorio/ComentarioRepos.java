package com.tutatoo.tutatooartif.reporitorio;

import com.tutatoo.tutatooartif.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepos extends JpaRepository<Comentario, Long> {
}
