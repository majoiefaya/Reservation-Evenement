package com.gestionReEvenement.GestionReservationEvenement.Models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="PersonneType")
@Table(name = "Personne")
public class Personne {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name="nom",nullable = false)
    protected String nom;

    @Column(name="prenom",nullable = false)
    protected String prenom;

    @Column(name="age",nullable = false)
    protected int age;

    @Column(name="nationalite",nullable = false)
    protected String nationalite;
    
    @Column(name="sexe",nullable = false)
    protected String sexe;
    
    @Column(name="numtel",nullable = false)
    protected int numtel;
    
    @Column(name="mail",nullable = false)
    protected String mail;
    
    @Column(name="adresse",nullable = false)
    protected String adresse;
    
    @Column(name="MotDePasse",nullable = false)
    protected String MotDePasse;
    

    /*Ajout de la relation OneToMany entre Personne et Ticket*/
    @OneToMany(mappedBy = "personne", fetch = jakarta.persistence.FetchType.LAZY)
	@JsonManagedReference(value="personne-ticket")
    private Set<Ticket> tickets;


	public Personne(Long id, String nom, String prenom, int age, String nationalite, String sexe, int numtel,
			String mail, String adresse, String motDePasse, Set<Ticket> tickets) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.nationalite = nationalite;
		this.sexe = sexe;
		this.numtel = numtel;
		this.mail = mail;
		this.adresse = adresse;
		MotDePasse = motDePasse;
		this.tickets = tickets;
	}


	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public int getNumtel() {
		return numtel;
	}


	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getMotDePasse() {
		return MotDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		MotDePasse = motDePasse;
	}


	public Set<Ticket> getTickets() {
		return tickets;
	}


	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}


	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", nationalite="
				+ nationalite + ", sexe=" + sexe + ", numtel=" + numtel + ", mail=" + mail + ", adresse=" + adresse
				+ ", MotDePasse=" + MotDePasse + ", tickets=" + tickets + "]";
	}
    
    
    

}
