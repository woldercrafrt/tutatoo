package com.tutatoo.tutatooartif.reporitorio;

import com.tutatoo.tutatooartif.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepos extends JpaRepository<Local, Long> {
}
