package com.mateuserp.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "obra")

public class Obra implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "obra_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long id;
	
	@Column(nullable = false)
	private @Getter @Setter String nome;
	@Column(nullable = false)
	private @Getter @Setter String endereco;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private @Getter @Setter String dataInicio;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obra other = (Obra) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Obra [id=" + id + "]";
	}
	

}
