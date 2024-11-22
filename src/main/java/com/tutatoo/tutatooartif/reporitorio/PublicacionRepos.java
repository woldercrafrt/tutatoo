package com.tutatoo.tutatooartif.reporitorio;

import com.tutatoo.tutatooartif.entity.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRepos extends JpaRepository<Publicacion, Long> {
}
