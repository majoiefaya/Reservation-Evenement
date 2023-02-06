package com.gestionReEvenement.GestionReservationEvenement.Models;

import javax.persistence.*;

@Entity
@Table(name = "Participant")
@DiscriminatorColumn(name="ParticipantType")
public class Participant extends Personne{
	

	public Participant() {
        super();
    }

}
