package com.gestionReEvenement.GestionReservationEvenement.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Evenement;
import com.gestionReEvenement.GestionReservationEvenement.Repositories.EvenementRepository;
import com.gestionReEvenement.GestionReservationEvenement.Services.EvenementService;

@Service
public class EvenementServiceImpl implements EvenementService{
	
	@Autowired
	public EvenementRepository evenementRepository;
	

	@Override
	public Evenement saveEvenement(Evenement evenement) {
		// TODO Auto-generated method stub
		return this.evenementRepository.save(evenement);
	}

	@Override
	public Evenement updateEvenement(Evenement evenement) {
		// TODO Auto-generated method stub
		return this.evenementRepository.save(evenement);
	}

	@Override
	public Evenement updateAnEvenement(Long id, Evenement evenement) {
		Evenement monEvenement = evenementRepository.findById(id).orElseThrow(()-> new RuntimeException(String
				.format("Evenement %s inexistant", id)));
		if (evenement.getDateEvenement()!=null) monEvenement.setDateEvenement(evenement.getDateEvenement());
		if (evenement.getLieuEvenement()!=null) monEvenement.setLieuEvenement(evenement.getLieuEvenement());
		if (evenement.getTypeEvenement()!=null) monEvenement.setTypeEvenement(evenement.getTypeEvenement());
		if (evenement.getDescriptionEvenement()!=null) monEvenement.setDescriptionEvenement(evenement.getDescriptionEvenement());
		if (evenement.getHeureDebut()!=null) monEvenement.setHeureDebut(evenement.getHeureDebut());
		if (evenement.getHeureFin()!=null) monEvenement.setHeureFin(evenement.getHeureFin());
		if (evenement.getNomEvenement()!=null) monEvenement.setNomEvenement(evenement.getNomEvenement());

		evenementRepository.save(monEvenement);
		return monEvenement;
	}

	@Override
	public String deleteEvenementById(Long id) {
		// TODO Auto-generated method stub
		this.evenementRepository.deleteById(id);
		return  "Evenement Supprimé avec succes !";
	}

	@Override
	public String deleteEvenementByObject(Evenement evenement) {
		// TODO Auto-generated method stub
		this.evenementRepository.deleteById(evenement.getIdEvenement());
		return "evenement Supprimé avec succes !";
	}

	@Override
	public List<Evenement> getAllEvenement() {
		// TODO Auto-generated method stub
		return  this.evenementRepository.findAll();
	}

	@Override
	public Evenement findEvenementById(Long id) {
		// TODO Auto-generated method stub
		return this.evenementRepository.findById(id).orElse(null);
	}

	@Override
	public Evenement findByNomEvenement(String nomEvenement) {
		// TODO Auto-generated method stub
		return this.evenementRepository.findBynomEvenement(nomEvenement);
	}

}
