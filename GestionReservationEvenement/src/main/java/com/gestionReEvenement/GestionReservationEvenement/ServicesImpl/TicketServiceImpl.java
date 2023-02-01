package com.gestionReEvenement.GestionReservationEvenement.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionReEvenement.GestionReservationEvenement.Models.Ticket;
import com.gestionReEvenement.GestionReservationEvenement.Repositories.TicketRepository;
import com.gestionReEvenement.GestionReservationEvenement.Services.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	
	@Autowired
	public TicketRepository ticketRepository;

	@Override
	public Ticket saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return this.ticketRepository.save(ticket);
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return this.ticketRepository.save(ticket);
	}

	@Override
	public String deleteTicketById(Long id) {
		// TODO Auto-generated method stub
		this.ticketRepository.deleteById(id);
		return  "Ticket Supprimé avec succes !";
	}

	@Override
	public String deleteTicketByObject(Ticket ticket) {
		// TODO Auto-generated method stub
		this.ticketRepository.deleteById(ticket.getIdticket());
		return "Ticket Supprimé avec succes !";
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return this.ticketRepository.findAll();
	}

	@Override
	public Ticket findTicketById(Long id) {
		// TODO Auto-generated method stub
		return this.ticketRepository.findById(id).orElse(null);
	}

	@Override
	public Ticket findBylibelleTicket(String libelleTicket) {
		// TODO Auto-generated method stub
		return this.ticketRepository.findBylibelleTicket(libelleTicket);
	}

	@Override
	public Ticket ActiverTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticket.setStatutTicket(true);
		return ticket;
	}

	@Override
	public Ticket DesactiverTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticket.setStatutTicket(false);
		return ticket;
	}

	@Override
	public String EtatTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		if(ticket.isStatutTicket()==true){
			return "Le Ticket est disponible";
		}
		return "Le ticket n'est plus disponible";
	}

}
