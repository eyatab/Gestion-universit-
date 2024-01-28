package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Etudiant;

public interface EtudiantService {
	
	void saveEtudiant(Etudiant etudiant);
	void updateEtudiant(Etudiant etudiant);
	List<Etudiant>listEtudiant();
	public Optional<Etudiant>findEtudiant(long numInsc);
	void removeEtudiant(long numInsc);

}
