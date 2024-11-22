package com.tutatoo.tutatooartif.reporitorio;

import com.tutatoo.tutatooartif.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepos extends JpaRepository<Usuario, Long> {
}
