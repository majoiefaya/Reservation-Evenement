package com.gestionReEvenement.GestionReservationEvenement.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionReEvenement.GestionReservationEvenement.Models.Ticket;
import com.gestionReEvenement.GestionReservationEvenement.Services.TicketService;

@RestController
@RequestMapping("/Ticket")
@CrossOrigin("*")
public class TicketController {

	@Autowired
	public TicketService ticketService;
	
	@RequestMapping(value="/ajouterTicket",method= RequestMethod.POST,headers="accept=Application/json")
	public Ticket save(@RequestBody Ticket ticket) {
		try {
			ticket=this.ticketService.saveTicket(ticket);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return ticket;
		
	}
	
	@RequestMapping(value="/getAllTickets",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Ticket> getAll() {
		List<Ticket> tickets=new ArrayList<>();
		try {
			tickets=this.ticketService.getAllTicket();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return tickets;
		
	}
	
	@RequestMapping(value="/updateTicket",method= RequestMethod.PUT,headers="accept=Application/json")
	public Ticket update(@RequestBody Ticket ticket) {
		try {
			ticket=this.ticketService.updateTicket(ticket);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return ticket;
		
	}
	
	@RequestMapping(value = "/deleteTicket", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Ticket ticket){
		 return this.ticketService.deleteTicketByObject(ticket);
	}

	
	@RequestMapping(value = "/deleteTicket/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.ticketService.deleteTicketById(id);
	}
	
	
	
	@RequestMapping(value = "/findTicketById/{id}", method =RequestMethod.GET)
	public Ticket findById(@PathVariable("id") long id){
		 return this.ticketService.findTicketById(id);
	}

	
	
	@RequestMapping(value = "/findTicketByLibelleTicket", method =RequestMethod.GET)
	public Ticket findByNomTicket(@RequestBody String LibelleTicket){
		 return this.ticketService.findBylibelleTicket(LibelleTicket);
	}
}
