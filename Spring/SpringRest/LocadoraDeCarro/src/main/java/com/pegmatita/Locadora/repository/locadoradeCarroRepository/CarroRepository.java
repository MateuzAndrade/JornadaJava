package com.pegmatita.Locadora.repository.locadoradeCarroRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.Locadora.model.locadoraDeCarroModel.Carro;


@Repository
public interface CarroRepository extends JpaRepository<Carro,Long>{

    List<Carro> findByMarcaContaining(String marca);


}
