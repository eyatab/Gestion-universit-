package com.example.demo.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Enseignant;
import com.example.demo.entity.Universite;
import com.example.demo.repository.UniversiteRepository;
import com.example.demo.service.UniversiteService;

@Service("UniversiteServiceImpl")
public class UniversiteServiceImpl implements UniversiteService{
	
	@Autowired
	UniversiteRepository universiteRepository;
	@Override
	public void saveUniversite(Universite enseignant) {
		universiteRepository.save(enseignant);
	}
	@Override
	public void updateUniversite(Universite uni) {
		universiteRepository.save(uni);
	}
	@Override
	public List<Universite>listUniversite(){
		return universiteRepository.findAll();
	}
	public Optional<Universite>findUniversite(long matricule){
		return universiteRepository.findById(matricule);	}

	@Override
	public void removeUniversite(Long id) {
		universiteRepository.deleteById(id);
	}

}
