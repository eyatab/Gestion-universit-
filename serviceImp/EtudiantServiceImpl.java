package com.example.demo.serviceImp;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Etudiant;
import com.example.demo.repository.EtudiantRepository;
import com.example.demo.service.EtudiantService;

@Service("EtudiantServiceImpl")
public class EtudiantServiceImpl implements EtudiantService {
	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Override
	public void saveEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
	}
	
	@Override
	public void updateEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
	}
	
	@Override
	public List<Etudiant>listEtudiant(){
		return etudiantRepository.findAll();
	}
	
	@Override
	public Optional<Etudiant>findEtudiant(long numInsc){
		return etudiantRepository.findById(numInsc);
	}
	
	@Override
	public void removeEtudiant(long numInsc) {
		etudiantRepository.deleteById(numInsc);
	}

}
