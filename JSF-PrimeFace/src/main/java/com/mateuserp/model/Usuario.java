package com.mateuserp.model;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Data;

@ManagedBean()
@SessionScoped
@Data
public class Usuario implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Date dataLogin;
	

}
