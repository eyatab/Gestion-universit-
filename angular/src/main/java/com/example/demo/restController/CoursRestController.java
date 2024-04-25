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
import com.example.demo.entity.Etudiant;
import com.example.demo.service.CoursService;
import com.example.demo.service.EtudiantService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/Cours",method= {RequestMethod.GET})
public class CoursRestController {
	@Autowired
	CoursService coursService;
	
	 @PostMapping("/CreateCours")
	 public Cours createCours(@Validated @RequestBody Cours cours) {
		 coursService.saveCours(cours);
		 return cours;
	 }

	 @GetMapping("/getAllCours")
	 public List<Cours> getAllCours(){
		 return coursService.listCours();
	 }
	 @GetMapping("/findCours/{id}")
	 public Optional<Cours>findCours(@PathVariable String id)
		{
			return coursService.findCours(Long.parseLong(id));
			
		}
	 @PutMapping("/UpdateCours/{id}")
     public String UpdateCours(@PathVariable Long id,@Validated @RequestBody Cours cours){
       coursService.updateCours(cours);
 return"La mise à jour a été faite avec succés";
}
	 @CrossOrigin(origins = "*")
	 @DeleteMapping(value="/deleteCours/{id}")
		public String deleteCours(@PathVariable long id)
		{
			coursService.removeCours(id);
			return "ok!";
		}
}
