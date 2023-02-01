package com.gestionReEvenement.GestionReservationEvenement.Models;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;


@Entity
@Table(name="Evenement")
public class Evenement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEvenement;
	
	
	@Column(name="nomEvenement",nullable=false)
	private String nomEvenement;
	
	
	@Column(name="DateEvenement",nullable=false)
	private Date DateEvenement;
	
	
	@Column(name="HeureDebut",nullable=false)
	private Time HeureDebut;
	

	@Column(name="HeureFin",nullable=false)
	private Time HeureFin;
	
	
	@Column(name="LieuEvenement",nullable=false)
	private String LieuEvenement;
	
	@Column(name="DescriptionEvenement",nullable=false)
	private String DescriptionEvenement;


    /*Ajout de la relation OneToMany entre Personne et Ticket*/
    @OneToMany(mappedBy = "evenement", fetch =  FetchType.LAZY)
    @JsonManagedReference(value="evenement-ticket")
    private Set<Ticket> tickets;
    
    @ManyToOne()
    @JoinColumn(name = "typeEvenement_id")
	@JsonBackReference(value="evenement-typeEvenement")
	private TypeEvenement typeEvenement;

	public Long getIdEvenement() {
		return idEvenement;
	}

	public void setIdEvenement(Long idEvenement) {
		this.idEvenement = idEvenement;
	}

	public String getNomEvenement() {
		return nomEvenement;
	}

	public void setNomEvenement(String nomEvenement) {
		this.nomEvenement = nomEvenement;
	}

	public Date getDateEvenement() {
		return DateEvenement;
	}

	public void setDateEvenement(Date dateEvenement) {
		DateEvenement = dateEvenement;
	}

	public Time getHeureDebut() {
		return HeureDebut;
	}

	public void setHeureDebut(Time heureDebut) {
		HeureDebut = heureDebut;
	}

	public Time getHeureFin() {
		return HeureFin;
	}

	public void setHeureFin(Time heureFin) {
		HeureFin = heureFin;
	}

	public String getLieuEvenement() {
		return LieuEvenement;
	}

	public void setLieuEvenement(String lieuEvenement) {
		LieuEvenement = lieuEvenement;
	}

	public String getDescriptionEvenement() {
		return DescriptionEvenement;
	}

	public void setDescriptionEvenement(String descriptionEvenement) {
		DescriptionEvenement = descriptionEvenement;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public TypeEvenement getTypeEvenement() {
		return typeEvenement;
	}

	public void setTypeEvenement(TypeEvenement typeEvenement) {
		this.typeEvenement=typeEvenement;
	}

	@Override
	public String toString() {
		return "Evenement [idEvenement=" + idEvenement + ", nomEvenement=" + nomEvenement + ", DateEvenement="
				+ DateEvenement + ", HeureDebut=" + HeureDebut + ", HeureFin=" + HeureFin + ", LieuEvenement="
				+ LieuEvenement + ", DescriptionEvenement=" + DescriptionEvenement + ", tickets=" + tickets
				+ ", TypeEvenement=" + typeEvenement + "]";
	}

	

	public Evenement(Long idEvenement, String nomEvenement, Date dateEvenement, Time heureDebut, Time heureFin,
			String lieuEvenement, String descriptionEvenement, Set<Ticket> tickets, TypeEvenement typeEvenement) {
		super();
		this.idEvenement = idEvenement;
		this.nomEvenement = nomEvenement;
		DateEvenement = dateEvenement;
		HeureDebut = heureDebut;
		HeureFin = heureFin;
		LieuEvenement = lieuEvenement;
		DescriptionEvenement = descriptionEvenement;
		this.tickets = tickets;
		this.typeEvenement = typeEvenement;
	}

	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
