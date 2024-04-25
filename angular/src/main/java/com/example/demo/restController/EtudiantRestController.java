package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Enseignant;
import com.example.demo.entity.Etudiant;
import com.example.demo.service.EtudiantService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/Etudiant",method= {RequestMethod.GET})
public class EtudiantRestController {
	
	@Autowired
	EtudiantService etudiantService;
	
	 @PostMapping("/CreateEtudiant")
	 public Etudiant createEtudiant(@Validated @RequestBody Etudiant etudiant) {
		 etudiantService.saveEtudiant(etudiant);
		 return etudiant;
	 }

	 @GetMapping("/getAllEtudiants")
	 public List<Etudiant> getAllEtudiants(){
		 return etudiantService.listEtudiant();
	 }
	 @GetMapping("/findEtudiant/{id}")
	 public Optional<Etudiant>findEtudiant(@PathVariable String id)
		{
			return etudiantService.findEtudiant(Long.parseLong(id));
			
		}

     @PutMapping("/UpdateEtudiant/{id}")
     public String UpdateEtudiant(@PathVariable Long id,@Validated @RequestBody Etudiant etudiant){
    	 etudiant.setNumInsc(id);
	 etudiantService.updateEtudiant(etudiant);
      return"La mise à jour a été faite avec succés";
      }

	 
	
	 @DeleteMapping(value="/deleteEtudiant/{id}")
		public String deleteEtudiant(@PathVariable String id)
		{
			etudiantService.removeEtudiant(Long.parseLong(id));
			return "ok!";
		}
	 
	
}
