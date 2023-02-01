package com.gestionReEvenement.GestionReservationEvenement.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.TypeEvenement;
import com.gestionReEvenement.GestionReservationEvenement.Repositories.TypeEvenementRepository;
import com.gestionReEvenement.GestionReservationEvenement.Services.TypeEvenementService;

@Service
public class TypeEvenementServiceImpl implements TypeEvenementService{
	
	@Autowired
	public TypeEvenementRepository typeEvenementRepository;

	@Override
	public TypeEvenement saveTypeEvenement(TypeEvenement typeEvenement) {
		// TODO Auto-generated method stub
		return this.typeEvenementRepository.save(typeEvenement);
	}

	@Override
	public TypeEvenement updateTypeEvenement(TypeEvenement typeEvenement) {
		// TODO Auto-generated method stub
		return this.typeEvenementRepository.save(typeEvenement);
	}

	@Override
	public String deleteTypeEvenementById(Long id) {
		// TODO Auto-generated method stub
		this.typeEvenementRepository.deleteById(id);
		return  "Type Evenement Supprimé avec succes !";
	}

	@Override
	public String deleteTypeEvenementByObject(TypeEvenement typeEvenement) {
		// TODO Auto-generated method stub
		this.typeEvenementRepository.deleteById(typeEvenement.getIdtype());
		return " Type evenement Supprimé avec succes !";
	}

	@Override
	public List<TypeEvenement> getAllTypeEvenement() {
		return this.typeEvenementRepository.findAll();
	}

	@Override
	public TypeEvenement findTypeEvenementById(Long id) {
		// TODO Auto-generated method stub
		return this.typeEvenementRepository.findById(id).orElse(null);
	}

	@Override
	public TypeEvenement findBylibelleType(String libelleType) {
		// TODO Auto-generated method stub
		return this.findBylibelleType(libelleType);
	}
	
	
}