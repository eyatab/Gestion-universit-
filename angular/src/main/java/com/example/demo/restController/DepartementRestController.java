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

import com.example.demo.service.DepartementService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/Departement",method= {RequestMethod.GET})
public class DepartementRestController {
	@Autowired
	DepartementService departementService;
	
	 @PostMapping("/CreateDepartement")
	 public Departement createdepartement(@Validated @RequestBody Departement dept) {
		 departementService.saveDepartement(dept);
		 return dept;
	 }

	 @GetMapping("/getAllDepartements")
	 public List<Departement> getAlldepartements(){
		 return departementService.listDepartement();
	 }
	 
	 @GetMapping("/findDepartement/{id}")
	 public Optional<Departement>findDepartement(@PathVariable String id)
		{
			return departementService.findDepartement(Long.parseLong(id));
			
		}
	 
	 @PutMapping("/UpdateDepartement/{id}")
     public String UpdateDepartement(@PathVariable Long id,@Validated @RequestBody  Departement dept){
      dept.setCodeDep(id);
      departementService.updateDepartement(dept);
 return"La mise à jour a été faite avec succés";
}
	
	 @DeleteMapping(value="/deleteDepartement/{id}")
		public String deleteDepartement(@PathVariable String id)
		{
		  departementService.removeDepartement(Long.parseLong(id));
			 return "ok!";
		}

}
