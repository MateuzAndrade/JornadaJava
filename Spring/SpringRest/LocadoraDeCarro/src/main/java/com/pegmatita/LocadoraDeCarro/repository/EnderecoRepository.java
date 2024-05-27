package com.pegmatita.LocadoraDeCarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.LocadoraDeCarro.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {

}
