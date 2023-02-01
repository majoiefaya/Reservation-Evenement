package com.gestionReEvenement.GestionReservationEvenement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionReEvenement.GestionReservationEvenement.Models.Ticket;


public interface TicketRepository extends JpaRepository<Ticket, Long>{

	 public Ticket findBylibelleTicket(String libelleTicket);	
	 
}