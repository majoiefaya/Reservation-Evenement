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

import com.gestionReEvenement.GestionReservationEvenement.Models.Personne;
import com.gestionReEvenement.GestionReservationEvenement.Services.PersonneService;


@RestController
@RequestMapping("/Personne")
@CrossOrigin("*")
public class PersonneController {

	@Autowired
	public PersonneService personneService;

	@RequestMapping(value="/ajouterPersonne",method= RequestMethod.POST,headers="accept=Application/json")
	public Personne save(@RequestBody Personne personne) {
		try {
			personne=this.personneService.savePersonne(personne);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return personne;

	}

	@RequestMapping(value="/getAllPersonnes",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Personne> getAll() {
		List<Personne> personnes=new ArrayList<>();
		try {
			personnes=this.personneService.getAllPersonne();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return personnes;

	}

	@RequestMapping(value="/updatePersonne",method= RequestMethod.PUT,headers="accept=Application/json")
	public Personne update(@RequestBody Personne personne) {
		try {
			personne=this.personneService.updatePersonne(personne);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return personne;

	}

	@RequestMapping(value = "/deletePersonne", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Personne personne){
		return this.personneService.deletePersonneByObject(personne);
	}


	@RequestMapping(value = "/deletePersonne/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		return this.personneService.deletePersonneById(id);
	}



	@RequestMapping(value = "/findPersonneById/{id}", method =RequestMethod.GET)
	public Personne findById(@PathVariable("id") long id){
		return this.personneService.findPersonneById(id);
	}



	@RequestMapping(value = "/findPersonneByNomPersonne", method =RequestMethod.GET)
	public Personne findByNomPersonne(@RequestBody String NomPersonne){
		return this.personneService.findPersonneByNom(NomPersonne);
	}

}
