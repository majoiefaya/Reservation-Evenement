package com.gestionReEvenement.GestionReservationEvenement.Models;



import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
@DiscriminatorColumn(name="AdminType")

public class Admin extends Personne{
	
	 public Admin() {
	        super();
	    }


	@Override
	public String toString() {
		return "Admin [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", nationalite="
				+ nationalite + ", sexe=" + sexe + ", numtel=" + numtel + ", mail=" + mail + ", adresse=" + adresse
				+ ", MotDePasse=" + MotDePasse + ", getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", getAge()=" + getAge() + ", getNationalite()=" + getNationalite() + ", getSexe()="
				+ getSexe() + ", getNumtel()=" + getNumtel() + ", getMail()=" + getMail() + ", getAdresse()="
				+ getAdresse() + ", getMotDePasse()=" + getMotDePasse() + ", getTickets()=" + getTickets()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


}
