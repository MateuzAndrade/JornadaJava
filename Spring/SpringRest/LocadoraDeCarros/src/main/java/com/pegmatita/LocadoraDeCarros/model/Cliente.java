package com.pegmatita.LocadoraDeCarros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	private Long Id;
	
	private String nome;
	
	private String CPF;
	
	private Endereco endereco;

}
