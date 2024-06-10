package com.pegmatita.Locadora.repository.locadoraDeRoupaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.Locadora.model.locadoraDeRoupaModel.Roupa;


@Repository
public interface RoupaRepository extends JpaRepository<Roupa,Long>{

    List<Roupa> findByMarca(String marca);

}
