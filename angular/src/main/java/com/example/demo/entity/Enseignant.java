package com.example.demo.entity;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Enseignant implements Serializable {
	

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private long matricule;
	public long getMatricule() {
		return matricule;
	}

	public void setMatricule(long matricule) {
		this.matricule = matricule;
	}

	private String nomEns;
	private String prenomEns;
	private String adresseEns;
	private String diplomeEns;
	private Date dateEntree;
	
	//Relation n:p entre Etudiants et Enseignants
	@ManyToMany	
	@JoinTable(
			  name = "Etudiant_Enseignant", 
			  joinColumns = @JoinColumn(name = "student_id"), 
			  inverseJoinColumns = @JoinColumn(name = "enseignant_id"))
			List<Etudiant> ListEtudiant;
	
	//Relation n:1 entre Enseignants et Departement
	@ManyToOne
	private Departement EnseignantsDepartement; //il faut ecrire le mm nom precisé dans le mapped by
	
	//relation 1:p Enseignat et cours 
	@OneToMany(mappedBy = "enseignant",cascade = CascadeType.ALL)
	private List<Cours> ListCours;

	

	public String getNomEns() {
		return nomEns;
	}

	public void setNomEns(String nomEns) {
		this.nomEns = nomEns;
	}

	public String getPrenomEns() {
		return prenomEns;
	}

	public void setPrenomEns(String prenomEns) {
		this.prenomEns = prenomEns;
	}

	public String getAdresseEns() {
		return adresseEns;
	}

	public void setAdresseEns(String adresseEns) {
		this.adresseEns = adresseEns;
	}

	public String getDiplomeEns() {
		return diplomeEns;
	}

	public void setDiplomeEns(String diplomeEns) {
		this.diplomeEns = diplomeEns;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(long matricule, String nomEns, String prenomEns, String adresseEns, String diplomeEns,
			Date dateEntree) {
		super();
		this.matricule = matricule;
		this.nomEns = nomEns;
		this.prenomEns = prenomEns;
		this.adresseEns = adresseEns;
		this.diplomeEns = diplomeEns;
		this.dateEntree = dateEntree;
	}
	
	

}
