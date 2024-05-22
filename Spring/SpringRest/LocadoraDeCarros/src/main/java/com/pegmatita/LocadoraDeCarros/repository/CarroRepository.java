package com.pegmatita.LocadoraDeCarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarros.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Long> {

}
