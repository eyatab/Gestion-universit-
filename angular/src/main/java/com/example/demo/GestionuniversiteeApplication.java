package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Cours;
import com.example.demo.entity.Etudiant;
import com.example.demo.entity.Salle;
import com.example.demo.repository.CoursRepository;
import com.example.demo.repository.EtudiantRepository;
import com.example.demo.repository.SalleRepository;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class GestionuniversiteeApplication  {

	
	public static void main(String[] args) {
		SpringApplication.run(GestionuniversiteeApplication.class, args);
	}
	
	
}
