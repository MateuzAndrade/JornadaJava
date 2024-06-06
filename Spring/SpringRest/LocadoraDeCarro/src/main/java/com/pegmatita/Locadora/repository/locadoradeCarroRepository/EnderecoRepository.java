package com.pegmatita.Locadora.repository.locadoradeCarroRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.Locadora.model.locadoraDeCarroModel.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {

}
