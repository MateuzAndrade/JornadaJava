package com.mateuserp.sistemagestaodeobras.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ENDERECO")
public class Endereco extends AbstractEntity<Long> {

    @Getter @Setter
    @Column(name = "rua", nullable = false, unique = true, length = 60)
    private String rua;

    @Getter @Setter
    @Column(name = "bairo", nullable = false, unique = true, length = 60)
    private String bairro;
    
    @Getter @Setter
    @Column(name = "numero", nullable = false, unique = true, length = 60)
    private Integer numero;

}
