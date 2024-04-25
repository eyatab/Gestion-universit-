package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant,Long>{

}
