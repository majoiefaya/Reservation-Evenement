package com.gestionReEvenement.GestionReservationEvenement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionReEvenement.GestionReservationEvenement.Models.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long>{

	 public Evenement findBynomEvenement(String nomEvenement);	
	 
}