package com.gestionReEvenement.GestionReservationEvenement.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Personne;
import com.gestionReEvenement.GestionReservationEvenement.Repositories.PersonneRepository;
import com.gestionReEvenement.GestionReservationEvenement.Services.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService{
	
	
	@Autowired
	public PersonneRepository personneRepository;
	

	@Override
	public Personne savePersonne(Personne personne) {
		// TODO Auto-generated method stub
		return this.personneRepository.save(personne);
	}

	@Override
	public Personne updatePersonne(Personne personne) {
		// TODO Auto-generated method stub
		return this.personneRepository.save(personne);
	}

	@Override
	public String deletePersonneById(Long id) {
		// TODO Auto-generated method stub
		this.personneRepository.deleteById(id);
		return  "Personne Supprimée avec succes !";
	}

	@Override
	public String deletePersonneByObject(Personne personne) {
		// TODO Auto-generated method stub
		this.personneRepository.deleteById(personne.getId());
		return "Personne Supprimée avec succes !";
	}

	@Override
	public List<Personne> getAllPersonne() {
		// TODO Auto-generated method stub
		return this.personneRepository.findAll();
	}

	@Override
	public Personne findPersonneById(Long id) {
		// TODO Auto-generated method stub
		return this.personneRepository.findById(id).orElse(null);
	}

	@Override
	public Personne findPersonneByNom(String nom) {
		// TODO Auto-generated method stub
		return this.personneRepository.findBynom(nom);
	}

}
