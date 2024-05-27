package com.mateuserp.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Getter;

@Named
@RequestScoped
public class GestaoObrasBean {
	
	private static @Getter Integer Numero = 0;
	
	public GestaoObrasBean() {
		Numero++;
	}
	
	@
	public Integer getNumero() {
		return Numero;
	}
}
