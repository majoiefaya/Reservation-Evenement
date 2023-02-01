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

import com.gestionReEvenement.GestionReservationEvenement.Models.Participant;
import com.gestionReEvenement.GestionReservationEvenement.Services.ParticipantService;


@RestController
@RequestMapping("/Participant")
@CrossOrigin("*")
public class ParticipantController {

	@Autowired
	public ParticipantService participantService;

	@RequestMapping(value="/ajouterParticipant",method= RequestMethod.POST,headers="accept=Application/json")
	public Participant save(@RequestBody Participant participant) {
		try {
			participant=this.participantService.saveParticipant(participant);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return participant;

	}

	@RequestMapping(value="/getAllParticipants",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Participant> getAll() {
		List<Participant> participants=new ArrayList<>();
		try {
			participants=this.participantService.getAllParticipant();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return participants;

	}

	@RequestMapping(value="/updateParticipant",method= RequestMethod.PUT,headers="accept=Application/json")
	public Participant update(@RequestBody Participant participant) {
		try {
			participant=this.participantService.updateParticipant(participant);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return participant;

	}

	@RequestMapping(value = "/deleteParticipant", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Participant participant){
		return this.participantService.deleteParticipantByObject(participant);
	}


	@RequestMapping(value = "/deleteParticipant/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		return this.participantService.deleteParticipantById(id);
	}



	@RequestMapping(value = "/findParticipantById/{id}", method =RequestMethod.GET)
	public Participant findById(@PathVariable("id") long id){
		return this.participantService.findParticipantById(id);
	}



	@RequestMapping(value = "/findParticipantByNomParticipant", method =RequestMethod.GET)
	public Participant findByNomParticipant(@RequestBody String NomParticipant){
		return this.participantService.findParticipantByNom(NomParticipant);
	}

}
