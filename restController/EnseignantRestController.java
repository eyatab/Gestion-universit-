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

import com.example.demo.entity.Cours;
import com.example.demo.entity.Departement;
import com.example.demo.entity.Enseignant;
import com.example.demo.entity.Etudiant;
import com.example.demo.service.CoursService;
import com.example.demo.service.EnseignantService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/Enseignant",method= {RequestMethod.GET})
public class EnseignantRestController {
	@Autowired
	EnseignantService enseignantService;
	
	 @PostMapping("/CreateEnseignant")
	 public Enseignant createEnseignant(@Validated @RequestBody Enseignant enseignant) {
		 enseignantService.saveEnseignant(enseignant);
		 return enseignant;
	 }

	 @GetMapping("/getAllEnseignant")
	 public List<Enseignant> getAllEnseignant(){
		 return enseignantService.listEnseignant();
	 }
	 @GetMapping("/findEnseignant/{id}")
	 public Optional<Enseignant>findEnseignant(@PathVariable String id)
		{
			return enseignantService.findEnseignant(Long.parseLong(id));
			
		}
	

	 @PutMapping("/UpdateEnseignant/{id}")
     public String UpdateEnseignant(@PathVariable Long id,@Validated @RequestBody Enseignant enseignant){
    	 enseignant.setMatricule(id);
	 enseignantService.updateEnseignant(enseignant);
      return"La mise à jour a été faite avec succés";
      }
	 
	 @DeleteMapping(value="/deleteEnseignant/{id}")
		public String deleteEnseignant(@PathVariable long id)
		{
			enseignantService.removeEnseignant(id);
			return "ok!";
		}
		

}
