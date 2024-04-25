package com.example.demo.entity;
import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Etudiant  implements Serializable{
	
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	
	private long numInsc;
	private String nomEtu;
	private String prenomEtu;
	private Date dateEntree;
	
	//Relation n:p entre Etudiants et Enseignants
	@ManyToMany(mappedBy = "ListEtudiant")
	private List<Enseignant> ListEnseignant;
	
	//Reltation n:p entre Etuidants et Cours
	@ManyToMany(mappedBy = "ListEtudiant")
	private List<Cours> ListCours;

	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(long numInsc, String nomEtu, String prenomEtu, Date dateEntree) {
		super();
		this.numInsc = numInsc;
		this.nomEtu = nomEtu;
		this.prenomEtu = prenomEtu;
		this.dateEntree = dateEntree;
	}

	public long getNumInsc() {
		return numInsc;
	}

	public void setNumInsc(long numInsc) {
		this.numInsc = numInsc;
	}

	public String getNomEtu() {
		return nomEtu;
	}

	public void setNumEtu(String numEtu) {
		this.nomEtu = nomEtu;
	}

	public String getPrenomEtu() {
		return prenomEtu;
	}

	public void setPrenomEtu(String prenomEtu) {
		this.prenomEtu = prenomEtu;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}
	
	
	

}
