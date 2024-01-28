package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Salle implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long numS;
	private String nomS;
	private int capacite;
	
	//Relation 1:1 Salle et Cours
	@OneToOne (mappedBy = "salleName",cascade = CascadeType.ALL)
	private Cours coursSalle;


	public Salle(long numS, String nomS, int capacite) {
		super();
		this.numS = numS;
		this.nomS = nomS;
		this.capacite = capacite;
	}

	public long getNumS() {
		return numS;
	}

	public void setNumS(long numS) {
		this.numS = numS;
	}

	public String getNomS() {
		return nomS;
	}

	public void setNomS(String nomS) {
		this.nomS = nomS;
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
