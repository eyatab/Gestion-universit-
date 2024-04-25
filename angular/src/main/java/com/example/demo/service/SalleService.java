package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Salle;

public interface SalleService {
	
	void saveSalle(Salle salle);
	void updateSalle(Salle salle);
	List<Salle>listSalle();
	public Optional<Salle>findSalle(long numSalle);
	void removeSalle(long id);

}
