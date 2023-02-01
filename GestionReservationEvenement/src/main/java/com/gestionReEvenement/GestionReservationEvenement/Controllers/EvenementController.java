package com.gestionReEvenement.GestionReservationEvenement.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionReEvenement.GestionReservationEvenement.Models.Evenement;
import com.gestionReEvenement.GestionReservationEvenement.Services.EvenementService;


@RestController
@RequestMapping("/Evenement")
@CrossOrigin("*")
public class EvenementController {
	

	@Autowired
	public EvenementService evenementService;
	
	@RequestMapping(value="/ajouterEvenement",method= RequestMethod.POST,headers="accept=Application/json")
	public Evenement save(@RequestBody Evenement evenement) {
		try {
			evenement=this.evenementService.saveEvenement(evenement);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return evenement;
		
	}
	
	@RequestMapping(value="/getAllEvenements",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Evenement> getAll() {
		List<Evenement> evenements=new ArrayList<>();
		try {
			evenements=this.evenementService.getAllEvenement();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return evenements;
		
	}
	
	@RequestMapping(value="/updateEvenement",method= RequestMethod.PUT,headers="accept=Application/json")
	public Evenement update(@RequestBody Evenement evenement) {
		try {
			evenement=this.evenementService.updateEvenement(evenement);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return evenement;
		
	}
	
	@RequestMapping(value = "/deleteEvenement", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Evenement evenement){
		 return this.evenementService.deleteEvenementByObject(evenement);
	}

	
	@RequestMapping(value = "/deleteEvenement/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.evenementService.deleteEvenementById(id);
	}
	
	
	
	@RequestMapping(value = "/findEvenementById/{id}", method =RequestMethod.GET)
	public Evenement findById(@PathVariable("id") long id){
		 return this.evenementService.findEvenementById(id);
	}

	
	
	@RequestMapping(value = "/findEvenementByNomEvenement", method =RequestMethod.GET)
	public Evenement findByNomEvenement(@RequestBody String NomEvenement){
		 return this.evenementService.findByNomEvenement(NomEvenement);
	}
	
	
}
