package com.gestionReEvenement.GestionReservationEvenement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionReEvenement.GestionReservationEvenement.Models.Admin;

public interface AdminRepository  extends JpaRepository<Admin, Long>{

	 public Admin findBynom(String nom);	
}