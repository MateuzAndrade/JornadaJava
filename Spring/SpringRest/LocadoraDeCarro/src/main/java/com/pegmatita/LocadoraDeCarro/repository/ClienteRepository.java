package com.pegmatita.LocadoraDeCarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarro.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
