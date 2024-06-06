package com.pegmatita.Locadora.repository.locadoraDeRoupaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegmatita.Locadora.model.locadoraDeRoupaModel.Camisa;

@Repository
public interface CamisaRepository extends JpaRepository<Camisa,Long>{

}
