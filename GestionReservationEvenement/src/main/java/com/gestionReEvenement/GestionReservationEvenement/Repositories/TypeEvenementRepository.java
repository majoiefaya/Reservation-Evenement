package com.gestionReEvenement.GestionReservationEvenement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionReEvenement.GestionReservationEvenement.Models.TypeEvenement;

public interface TypeEvenementRepository extends JpaRepository<TypeEvenement, Long>{

	 public TypeEvenement findBylibelleType(String libelleType);	
	 
}