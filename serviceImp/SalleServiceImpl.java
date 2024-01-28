package com.example.demo.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Salle;
import com.example.demo.repository.SalleRepository;
import com.example.demo.service.SalleService;

@Service("SalleServiceImpl")
public class SalleServiceImpl implements SalleService {

	@Autowired
	SalleRepository salleRepository;
	
	@Override
	public void saveSalle(Salle salle) {
		salleRepository.save(salle);
	}
	
	@Override
	public void updateSalle(Salle salle) {
		salleRepository.save(salle);
	}
	
	@Override
	public List<Salle>listSalle(){
		return salleRepository.findAll();
	}
	
	@Override
	public Optional<Salle>findSalle(long numSalle){
		return salleRepository.findById(numSalle);
	}
	
	@Override
	public void removeSalle(long numSalle) {
		salleRepository.deleteById(numSalle);
	}
}
