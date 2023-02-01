package com.gestionReEvenement.GestionReservationEvenement.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestionReEvenement.GestionReservationEvenement.Models.Participant;
import com.gestionReEvenement.GestionReservationEvenement.Repositories.ParticipantRepository;
import com.gestionReEvenement.GestionReservationEvenement.Services.ParticipantService;
import org.springframework.stereotype.Service;

@Service
public class ParticipantServiceImpl implements ParticipantService{

	@Autowired
	public ParticipantRepository participantRepository;
	
	@Override
	public Participant saveParticipant(Participant participant) {
		// TODO Auto-generated method stub
		return this.participantRepository.save(participant);
	}

	@Override
	public Participant updateParticipant(Participant participant) {
		// TODO Auto-generated method stub
		return this.participantRepository.save(participant);
	}

	@Override
	public String deleteParticipantById(Long id) {
		// TODO Auto-generated method stub
		this.participantRepository.deleteById(id);
		return  "Participant Supprimé avec succes !";
	}

	@Override
	public String deleteParticipantByObject(Participant participant) {
		// TODO Auto-generated method stub
		this.participantRepository.deleteById(participant.getId());
		return "Participant Supprimé avec succes !";
	}

	@Override
	public List<Participant> getAllParticipant() {
		// TODO Auto-generated method stub
		return  this.participantRepository.findAll();
	}

	@Override
	public Participant findParticipantById(Long id) {
		// TODO Auto-generated method stub
		return this.participantRepository.findById(id).orElse(null);
	}

	@Override
	public Participant findParticipantByNom(String nom) {
		// TODO Auto-generated method stub
		return this.participantRepository.findBynom(nom);
	}

}
