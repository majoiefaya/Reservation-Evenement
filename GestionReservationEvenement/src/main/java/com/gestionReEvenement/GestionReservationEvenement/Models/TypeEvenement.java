package com.gestionReEvenement.GestionReservationEvenement.Models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TypeEvenement")
public class TypeEvenement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idtype;
	
	@Column(name="libelleType",nullable=false)
	private String libelleType;
	
	@Column(name="descriptionType",nullable=false)
	private String descriptionType;
	
    @OneToMany(mappedBy = "typeEvenement", fetch = jakarta.persistence.FetchType.LAZY)
	@JsonManagedReference(value="evenement-typeEvenement")
    private Set<Evenement> evenements;


	public TypeEvenement() {
		
	}
	
	public TypeEvenement(Long idtype, String libelleType, String descriptionType, Set<Evenement> evenements) {
		super();
		this.idtype = idtype;
		this.libelleType = libelleType;
		this.descriptionType = descriptionType;
		this.evenements = evenements;
	}

	public Long getIdtype() {
		return idtype;
	}

	public void setIdtype(Long idtype) {
		this.idtype = idtype;
	}

	public String getLibelleType() {
		return libelleType;
	}

	public void setLibelleType(String libelleType) {
		this.libelleType = libelleType;
	}

	public String getDescriptionType() {
		return descriptionType;
	}

	public void setDescriptionType(String descriptionType) {
		this.descriptionType = descriptionType;
	}

	public Set<Evenement> getEvenements() {
		return evenements;
	}

	public void setEvenements(Set<Evenement> evenements) {
		this.evenements = evenements;
	}
    
	

}
