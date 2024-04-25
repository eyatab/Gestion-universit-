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

import com.example.demo.entity.Etudiant;
import com.example.demo.entity.Salle;

import com.example.demo.service.SalleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/Salle",method= {RequestMethod.GET})
public class SalleRestController {
	@Autowired
	SalleService salleService;
	
	 @PostMapping("/CreateSalle")
	 public Salle createsalle(@Validated @RequestBody Salle salle) {
		salleService.saveSalle(salle);
		 return salle;
	 }

	 @GetMapping("/getAllSalles")
	 public List<Salle> getAllsalles(){
		 return salleService.listSalle();
	 }
	 
	 @GetMapping("/findSalle/{id}")
	 public Optional<Salle>findSalle(@PathVariable String id)
		{
			return salleService.findSalle(Long.parseLong(id));
			
		}
	 @PutMapping("/UpdateSalle/{id}")
     public String UpdateSalle(@PathVariable Long id,@Validated @RequestBody Salle salle){
		 salle.setNumS(id);
    	 salleService.updateSalle(salle);
      return"La mise à jour a été faite avec succés";
      }
	 
	 
	 @DeleteMapping(value="/deleteSalle/{id}")
		public String deleteSalle(@PathVariable String id)
		{
			salleService.removeSalle(Long.parseLong(id));
			return "ok!";
		}

}
