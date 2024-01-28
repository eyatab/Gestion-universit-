package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Universite implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codeUNV;
	private String nomUniv;
	private String addresseSite;

	//Relation 1:n entre Universite et Departements
	@OneToMany(mappedBy = "Universite")
	private List<Departement> ListDepartement;
	
	public Universite() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Universite(Long codeUNV, String nomUniv, String addresseSite) {
		super();
		this.codeUNV = codeUNV;
		this.nomUniv = nomUniv;
		this.addresseSite = addresseSite;
	}


	public Long getCodeUNV() {
		return codeUNV;
	}


	public void setCodeUNV(Long codeUNV) {
		this.codeUNV = codeUNV;
	}


	public String getNomUniv() {
		return nomUniv;
	}


	public void setNomUniv(String nomUniv) {
		this.nomUniv = nomUniv;
	}


	public String getAddresseSite() {
		return addresseSite;
	}


	public void setAddresseSite(String addresseSite) {
		this.addresseSite = addresseSite;
	}

	
	
	
	
	

}
