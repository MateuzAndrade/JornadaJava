package com.mateuserp.sistemagestaodeobras.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

    @Getter @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

}