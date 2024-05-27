package com.pegmatita.LocadoraDeCarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarro.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Long>{

}
