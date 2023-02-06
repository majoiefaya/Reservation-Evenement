package com.gestionReEvenement.GestionReservationEvenement.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idticket;

	@Column(nullable = false)
	@Basic(optional = false)
	private String libelleTicket;

	@Basic(optional = false)
	@Column(unique=true)
	private String codeTicket;

	@Basic(optional = false)
	@Column(nullable = false)
	private int nombreTicket;

	@Basic(optional = false)
	@Column(nullable=false)
	private String typeTicket;

	@Column(nullable = false)
	@Basic(optional = false)
	private boolean statutTicket;

	@Column(nullable = false)
	@Basic(optional = false)
	private int PrixTicket;

	@Column(nullable = false)
	@Basic()
	private String descriptionTicket;
	
	
    @ManyToOne()
	@JsonBackReference(value="personne-ticket")
     @JoinColumn(name = "personne_id")
     private Personne personne;


    @ManyToOne()
	@JsonBackReference(value="evenement-ticket")
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;



	
}

