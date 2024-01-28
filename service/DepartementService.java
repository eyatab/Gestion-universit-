package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Departement;

public interface DepartementService {
	
	void saveDepartement(Departement dep);
	void updateDepartement(Departement dep);
	List<Departement> listDepartement();
	public Optional<Departement>findDepartement(long CodeDep );
	void removeDepartement(long CodeDep);

}
