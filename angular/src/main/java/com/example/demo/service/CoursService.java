package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Cours;


public interface CoursService {
	
	void saveCours(Cours cours);
	void updateCours(Cours cours);
	List<Cours> listCours();
	void removeCours(long CodeC);
	public Optional<Cours>findCours(long CodeC);

}
