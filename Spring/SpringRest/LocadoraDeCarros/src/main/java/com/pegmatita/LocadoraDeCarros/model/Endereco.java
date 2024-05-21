package com.pegmatita.LocadoraDeCarros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	private String rua;
	
	private String bairro;
	
	private String cidade;
	
	private Estato estado;
	
	private String cep;

}
