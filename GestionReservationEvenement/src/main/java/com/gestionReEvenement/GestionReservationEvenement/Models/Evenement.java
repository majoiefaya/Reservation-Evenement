package com.gestionReEvenement.GestionReservationEvenement.Models;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name="Evenement")
public class Evenement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEvenement;

	@Column(nullable = false)
	@Basic(optional = false)
	private String nomEvenement;

	@Column(nullable = false)
	@Basic(optional = false)
	private Date DateEvenement;

	@Column(nullable = false)
	@Basic(optional = false)
	private Time HeureDebut;

	@Column(nullable = false)
	@Basic(optional = false)
	private Time HeureFin;

	@Column(nullable = false)
	@Basic(optional = false)
	private String LieuEvenement;

	@Column(nullable = false)
	@Basic(optional = false)
	private String DescriptionEvenement;

    /*Ajout de la relation OneToMany entre Personne et Ticket*/
    @OneToMany(mappedBy = "evenement", fetch =  FetchType.LAZY)
    @JsonManagedReference(value="evenement-ticket")
    private Set<Ticket> tickets;
    
    @ManyToOne()
    @JoinColumn(name = "typeEvenement_id")
	@JsonBackReference(value="evenement-typeEvenement")
	private TypeEvenement typeEvenement;


	
	
}
