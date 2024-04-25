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


import com.example.demo.entity.Salle;
import com.example.demo.entity.Universite;
import com.example.demo.service.SalleService;
import com.example.demo.service.UniversiteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/Universite",method= {RequestMethod.GET})
public class UniversiteRestController {
	@Autowired
	UniversiteService uniService;
	
	 @PostMapping("/CreateUniversite")
	 public Universite createuniversite(@Validated @RequestBody Universite uni) {
		uniService.saveUniversite(uni);
		 return uni;
	 }

	 @GetMapping("/getAllUniversites")
	 public List<Universite> getAlluniversites(){
		 return uniService.listUniversite();
	 }
	 
	 @GetMapping("/findUniversite/{id}")
	 public Optional<Universite>findUniversite(@PathVariable String id)
		{
			return uniService.findUniversite(Long.parseLong(id));
			
		}
	 
	 @PutMapping("/UpdateUniversite/{id}")
     public String updateUniversite(@PathVariable Long id,@Validated @RequestBody Universite uni){
		 uni.setCodeUNV(id);
		 uniService.updateUniversite(uni);
      return"La mise à jour a été faite avec succés";
      }
	 
	
	 @DeleteMapping(value="/deleteUniversite/{id}")
		public String deleteUniversite(@PathVariable String id)
		{
		 uniService.removeUniversite(Long.parseLong(id));
			return "ok!";
		}

}
