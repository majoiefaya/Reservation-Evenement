package com.gestionReEvenement.GestionReservationEvenement.Models;

import java.util.Set;

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
@Table(name="TypeEvenement")
public class TypeEvenement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idtype;

	@Column(nullable = false)
	@Basic(optional = false)
	private String libelleType;

	@Column(nullable = false)
	@Basic(optional = false)
	private String descriptionType;
	
    @OneToMany(mappedBy = "typeEvenement", fetch = javax.persistence.FetchType.LAZY)
	@JsonManagedReference(value="evenement-typeEvenement")
    private Set<Evenement> evenements;

	

}
