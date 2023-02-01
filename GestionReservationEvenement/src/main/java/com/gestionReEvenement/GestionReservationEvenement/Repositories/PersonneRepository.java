package com.gestionReEvenement.GestionReservationEvenement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionReEvenement.GestionReservationEvenement.Models.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

	 public Personne findBynom(String nom);	
	 
}