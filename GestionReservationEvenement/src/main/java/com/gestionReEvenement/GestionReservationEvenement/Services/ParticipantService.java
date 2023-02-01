package com.gestionReEvenement.GestionReservationEvenement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Participant;

@Service
public interface ParticipantService {
	
	public Participant saveParticipant(Participant participant);
	
	public Participant updateParticipant(Participant  participant);
	
	public String deleteParticipantById(Long id);
	
	public String deleteParticipantByObject(Participant participant);

	public List<Participant> getAllParticipant();

	public Participant findParticipantById(Long id) ;
	
	public Participant findParticipantByNom(String nom);
}
