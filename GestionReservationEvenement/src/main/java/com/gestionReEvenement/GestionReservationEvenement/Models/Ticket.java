package com.gestionReEvenement.GestionReservationEvenement.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idticket;
	
	
	@Column(name="libelleTicket",nullable=false)
	private String libelleTicket;
	
	
	@Column(name="codeTicket",nullable=false,unique=true)
	private String codeTicket;
	
	
	@Column(name="nombreTicket",nullable=false)
	private int nombreTicket;
	
	
	@Column(name="typeTicket",nullable=false)
	private String typeTicket;
	
	
	@Column(name="statutTicket",nullable=false)
	private boolean statutTicket;
	
	@Column(name="PrixTicket",nullable=false)
	private int PrixTicket;
	
	
	@Column(name="descriptionTicket",nullable=false)
	private String descriptionTicket;
	
	
    @ManyToOne()
	@JsonBackReference(value="personne-ticket")
     @JoinColumn(name = "personne_id")
     private Personne personne;
    
    
    @ManyToOne()
	@JsonBackReference(value="evenement-ticket")
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;


	public Ticket(Long idticket, String libelleTicket, String codeTicket, int nombreTicket, String typeTicket,
			boolean statutTicket, int prixTicket, String descriptionTicket, Personne personne, Evenement evenement) {
		super();
		this.idticket = idticket;
		this.libelleTicket = libelleTicket;
		this.codeTicket = codeTicket;
		this.nombreTicket = nombreTicket;
		this.typeTicket = typeTicket;
		this.statutTicket = statutTicket;
		PrixTicket = prixTicket;
		this.descriptionTicket = descriptionTicket;
		this.personne = personne;
		this.evenement = evenement;
	}


//	public Ticket() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Ticket(){

	}


	public Long getIdticket() {
		return idticket;
	}


	public void setIdticket(Long idticket) {
		this.idticket = idticket;
	}


	public String getLibelleTicket() {
		return libelleTicket;
	}


	public void setLibelleTicket(String libelleTicket) {
		this.libelleTicket = libelleTicket;
	}


	public String getCodeTicket() {
		return codeTicket;
	}


	public void setCodeTicket(String codeTicket) {
		this.codeTicket = codeTicket;
	}


	public int getNombreTicket() {
		return nombreTicket;
	}


	public void setNombreTicket(int nombreTicket) {
		this.nombreTicket = nombreTicket;
	}


	public String getTypeTicket() {
		return typeTicket;
	}


	public void setTypeTicket(String typeTicket) {
		this.typeTicket = typeTicket;
	}


	public boolean isStatutTicket() {
		return statutTicket;
	}


	public void setStatutTicket(boolean statutTicket) {
		this.statutTicket = statutTicket;
	}


	public int getPrixTicket() {
		return PrixTicket;
	}


	public void setPrixTicket(int prixTicket) {
		PrixTicket = prixTicket;
	}


	public String getDescriptionTicket() {
		return descriptionTicket;
	}


	public void setDescriptionTicket(String descriptionTicket) {
		this.descriptionTicket = descriptionTicket;
	}


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	public Evenement getEvenement() {
		return evenement;
	}


	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}



	
}

