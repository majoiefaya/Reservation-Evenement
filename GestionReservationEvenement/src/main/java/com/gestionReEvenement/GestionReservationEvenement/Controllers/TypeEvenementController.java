package com.gestionReEvenement.GestionReservationEvenement.Controllers;

import java.util.ArrayList;
import java.util.List;

import com.gestionReEvenement.GestionReservationEvenement.Models.TypeEvenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionReEvenement.GestionReservationEvenement.Services.TypeEvenementService;

@RestController
@RequestMapping("/TypeEvenement")
@CrossOrigin("*")
public class TypeEvenementController {

	@Autowired
	public TypeEvenementService typeEvenementService;

	@RequestMapping(value="/ajouterTypeEvenement",method= RequestMethod.POST,headers="accept=Application/json")
	public TypeEvenement save(@RequestBody TypeEvenement typeEvenement) {
		try {
			typeEvenement=this.typeEvenementService.saveTypeEvenement(typeEvenement);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return typeEvenement;

	}

	@RequestMapping(value="/getAllTypeEvenements",method= RequestMethod.GET,headers="accept=Application/json")
	public List<TypeEvenement> getAll() {
		List<TypeEvenement> typeEvenements=new ArrayList<>();
		try {
			typeEvenements=this.typeEvenementService.getAllTypeEvenement();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return typeEvenements;

	}

	@RequestMapping(value="/updateTypeEvenement",method= RequestMethod.PUT,headers="accept=Application/json")
	public TypeEvenement update(@RequestBody TypeEvenement typeEvenement) {
		try {
			typeEvenement=this.typeEvenementService.updateTypeEvenement(typeEvenement);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return typeEvenement;

	}

	@RequestMapping(value = "/deleteTypeEvenement", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody TypeEvenement typeEvenement){
		return this.typeEvenementService.deleteTypeEvenementByObject(typeEvenement);
	}


	@RequestMapping(value = "/deleteTypeEvenement/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		return this.typeEvenementService.deleteTypeEvenementById(id);
	}



	@RequestMapping(value = "/findTypeEvenementById/{id}", method =RequestMethod.GET)
	public TypeEvenement findById(@PathVariable("id") long id){
		return this.typeEvenementService.findTypeEvenementById(id);
	}



	@RequestMapping(value = "/findTypeEvenementBylibelle", method =RequestMethod.GET)
	public TypeEvenement findByNomTypeEvenement(@RequestBody String libelleTypeEvenement){
		return this.typeEvenementService.findBylibelleType(libelleTypeEvenement);
	}


}
