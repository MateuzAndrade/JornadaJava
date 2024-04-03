package com.mateuserp.sistemagestaodeobras.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "obra")
public class Obra extends AbstractEntity<Long>{

    @Column(name = "nome" ,nullable = false, unique = true, length = 200)
    @Getter @Setter
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;




}
