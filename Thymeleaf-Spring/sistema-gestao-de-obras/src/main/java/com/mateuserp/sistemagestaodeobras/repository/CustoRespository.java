package com.mateuserp.sistemagestaodeobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Custo;
import com.mateuserp.sistemagestaodeobras.model.Obra;

public interface CustoRespository extends JpaRepository<Custo, Long> {

    List<Custo> findByDescricaoContaining (String descricao);
    List<Custo> findByObra(Obra obra);

}
