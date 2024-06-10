package com.pegmatita.Locadora.model.locadoraDeRoupaModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="roupa")
public class Roupa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;

    @Column(nullable = false)
    private String tamanho;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="tipo_id",nullable=false)
    private Tipo tipo;

}
