package com.mateuserp.sistemagestaodeobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateuserp.sistemagestaodeobras.model.Obra;
@Repository
public interface ObraRepository extends JpaRepository<Obra,Long>{

}
