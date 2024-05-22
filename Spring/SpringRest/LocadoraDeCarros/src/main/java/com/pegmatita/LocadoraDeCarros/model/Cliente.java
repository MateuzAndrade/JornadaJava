package com.pegmatita.LocadoraDeCarros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {
	
	@Id
	private Long Id;
	
	private String nome;
	
	private String CPF;
	
	@ManyToOne
	private Endereco endereco;

}
