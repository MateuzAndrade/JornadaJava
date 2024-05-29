package com.pegmatita.LocadoraDeCarro.repository.mariadb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarro.model.mariadb.Camisa;

@Repository
public interface CamisaRepository extends JpaRepository<Camisa,Long>{

}
