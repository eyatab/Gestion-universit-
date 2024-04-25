package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
@Entity
public class Cours implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long codeC;
	private String libelleC;

	//Relation 1:1 Salle et Cours
	//On a choisi Cours comme entité Maitre danc ce cas
	@OneToOne 
	@JoinColumn(name = "NumSalle")
	private Salle salleName;
	
	//Relation p:1 Cours et enseignant @joincolumns
	@ManyToOne
	private Enseignant enseignant;
	
	
	//Relation p:n entre Cours et Etudiants
	@ManyToMany
	@JoinTable(
			name="Cours_Etudiant",
			joinColumns = @JoinColumn (name="numInsc"),
			inverseJoinColumns = @JoinColumn (name="CodeC"))
	private List<Etudiant> ListEtudiant;

	public long getCodeC() {
		return codeC;
	}

	public void setCodeC(long codeC) {
		this.codeC = codeC;
	}

	public String getLibelleC() {
		return libelleC;
	}

	public void setLibelleC(String libelleC) {
		this.libelleC = libelleC;
	}

	public Cours(long codeC, String libelleC) {
		super();
		this.codeC = codeC;
		this.libelleC = libelleC;
	}

	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}


}
