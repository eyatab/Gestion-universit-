package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Universite;

public interface UniversiteService {
	public void saveUniversite(Universite uni);
	public void updateUniversite(Universite uni);
	public List<Universite>listUniversite();
	public Optional<Universite>findUniversite(long id);
	public void removeUniversite(Long id);
}
