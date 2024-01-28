package com.example.demo.entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Departement implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codeDep;
	private String nomDep;
	
	//Relation 1:n entre Departement et Enseignants
	@OneToMany(mappedBy="EnseignantsDepartement",cascade=CascadeType.ALL)
	private List <Enseignant>Enseignants;
	
	//Relation n:1 entre Departements et Universite
	@ManyToOne
	private Universite Universite;
	
	
	//Constructeur
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getCodeDep() {
		return codeDep;
	}


	public void setCodeDep(long codeDep) {
		this.codeDep = codeDep;
	}


	public String getNomDep() {
		return nomDep;
	}


	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}


	public Departement(long codeDep, String nomDep) {
		super();
		this.codeDep = codeDep;
		this.nomDep = nomDep;
	}
	

}
