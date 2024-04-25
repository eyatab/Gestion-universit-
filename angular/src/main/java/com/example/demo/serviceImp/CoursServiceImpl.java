package com.example.demo.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cours;
import com.example.demo.repository.CoursRepository;
import com.example.demo.service.CoursService;


@Service("CoursServiceImpl")
public class CoursServiceImpl implements CoursService {

	@Autowired
	CoursRepository coursRepository;
	
	@Override
	public void saveCours(Cours cours) {
		coursRepository.save(cours);
	}
	@Override
	public void updateCours(Cours cours) {
		coursRepository.save(cours);
	}
	@Override
	public List<Cours> listCours(){
		return coursRepository.findAll();
	}
	@Override
	public void removeCours(long CodeC) {
		coursRepository.deleteById(CodeC);
	}
	@Override
	public Optional<Cours> findCours(long CodeC){
		return coursRepository.findById(CodeC);
	}
}
