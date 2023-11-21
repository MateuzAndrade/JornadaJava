package br.com.LocadoraCarros.bean;

import javax.faces.bean.ManagedBean;

import lombok.Getter;


@ManagedBean
@Getter
public class CarroBean {

	private Carro Carro = new Carro();

	public void gravar() {
		System.out.println("Gravando um novo carro!" + this.Carro.modelo);

	}

}
