package com.pegmatita.LocadoraDeCarro.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarro.model.mysql.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Long>{

}
