package com.gestionReEvenement.GestionReservationEvenement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Evenement;


@Service
public interface EvenementService {
	
	public Evenement saveEvenement(Evenement evenement);
	
	public Evenement updateEvenement(Evenement evenement);

	//Jack dev
	public Evenement updateAnEvenement(Long id, Evenement evenement);
	
	public String deleteEvenementById(Long id);
	
	public String deleteEvenementByObject(Evenement evenement);

	public List<Evenement> getAllEvenement();

	public Evenement findEvenementById(Long id) ;
	
	public Evenement findByNomEvenement(String NomEvenement);
	

}
