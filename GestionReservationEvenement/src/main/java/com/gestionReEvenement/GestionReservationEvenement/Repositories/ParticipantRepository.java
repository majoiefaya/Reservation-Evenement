package com.gestionReEvenement.GestionReservationEvenement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionReEvenement.GestionReservationEvenement.Models.Participant;


public interface ParticipantRepository extends JpaRepository<Participant, Long>{

	 public Participant findBynom(String nom);	
}