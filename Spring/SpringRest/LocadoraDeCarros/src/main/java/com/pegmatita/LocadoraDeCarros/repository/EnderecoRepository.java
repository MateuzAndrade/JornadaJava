package com.pegmatita.LocadoraDeCarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarros.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long>{

}
