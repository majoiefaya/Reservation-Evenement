package com.gestionReEvenement.GestionReservationEvenement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Ticket;


@Service
public interface TicketService {
	
	public Ticket saveTicket(Ticket ticket);
	
	public Ticket updateTicket(Ticket ticket);
	
	public String deleteTicketById(Long id);
	
	public String deleteTicketByObject(Ticket ticket);

	public List<Ticket> getAllTicket();

	public Ticket findTicketById(Long id) ;
	
	public Ticket findBylibelleTicket(String libelleTicket);
	
	public Ticket ActiverTicket(Ticket ticket);
	
	public Ticket DesactiverTicket(Ticket ticket);
	
	public String EtatTicket(Ticket ticket);
	
}
