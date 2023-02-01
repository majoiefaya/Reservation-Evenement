package com.gestionReEvenement.GestionReservationEvenement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.TypeEvenement;

@Service
public interface TypeEvenementService {

	public TypeEvenement saveTypeEvenement(TypeEvenement typeEvenement);
	
	public TypeEvenement updateTypeEvenement(TypeEvenement  typeEvenement);
	
	public String deleteTypeEvenementById(Long id);
	
	public String deleteTypeEvenementByObject(TypeEvenement typeEvenement);

	public List<TypeEvenement> getAllTypeEvenement();

	public TypeEvenement findTypeEvenementById(Long id) ;
	
	public TypeEvenement findBylibelleType(String libelleType);

}
