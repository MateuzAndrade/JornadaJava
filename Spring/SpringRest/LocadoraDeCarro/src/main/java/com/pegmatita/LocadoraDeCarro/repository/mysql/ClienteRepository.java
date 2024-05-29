package com.pegmatita.LocadoraDeCarro.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarro.model.mysql.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
