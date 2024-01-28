package com.example.demo.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Enseignant;
import com.example.demo.repository.EnseignantRepository;
import com.example.demo.service.EnseignantService;
@Service("EnseignantServiceImpl")
public class EnseignantServiceImpl implements EnseignantService{
	
	@Autowired
	EnseignantRepository enseignantRepository;
	
	@Override
	public void saveEnseignant(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
	}
	@Override
	public void updateEnseignant(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
	}
	@Override
	public List<Enseignant> listEnseignant(){
		return enseignantRepository.findAll();
	}
	public Optional<Enseignant>findEnseignant(long matricule){
		return enseignantRepository.findById(matricule);
	}
	@Override
	public void removeEnseignant(long matricule) {
		enseignantRepository.deleteById(matricule);
		
	}

}
