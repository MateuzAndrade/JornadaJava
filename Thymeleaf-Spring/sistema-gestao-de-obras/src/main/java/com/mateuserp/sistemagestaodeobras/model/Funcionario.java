package com.mateuserp.sistemagestaodeobras.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 200)
    @Getter @Setter
    private String nome;

}
