package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Enseignant;

public interface EnseignantService {

	void saveEnseignant(Enseignant enseignant);
	void updateEnseignant(Enseignant enseignant);
	void removeEnseignant(long matricule);
	List<Enseignant> listEnseignant();
	public Optional<Enseignant>findEnseignant(long matricule);
	
}
