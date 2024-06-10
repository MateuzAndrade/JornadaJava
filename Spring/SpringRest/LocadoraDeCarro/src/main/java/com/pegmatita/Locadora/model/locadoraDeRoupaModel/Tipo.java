package com.pegmatita.Locadora.model.locadoraDeRoupaModel;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tipoRoupa")
public class Tipo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    private String nome;

    @OneToMany(mappedBy="tipo")
    @JsonIgnore
    private List<Roupa> roupa= new ArrayList<>();

}
