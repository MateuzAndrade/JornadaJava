package com.mateuserp.sistemagestaodeobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateuserp.sistemagestaodeobras.model.Cargo;

@Repository
public interface CargoRespository extends JpaRepository<Cargo, Long>{

}
