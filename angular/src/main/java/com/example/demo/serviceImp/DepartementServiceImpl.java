package com.example.demo.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Departement;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.service.DepartementService;

@Service("DepartementServiceImpl")
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	DepartementRepository departementRepository;
	
	@Override
	public void saveDepartement(Departement dep) {
		departementRepository.save(dep);
	}
	@Override
	public void updateDepartement(Departement dep) {
		departementRepository.save(dep);
	}
	@Override
	public List<Departement> listDepartement(){
		return departementRepository.findAll();
	}
	@Override
	public Optional<Departement>findDepartement(long CodeDep ){
		return departementRepository.findById(CodeDep);
	}
	@Override
	public void removeDepartement(long CodeDep) {
		departementRepository.deleteById(CodeDep);
	}
}
