package com.eni.TP.bean;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//@Entity //Géré par JPA /Hibernate
public class Superhero {
	/*
	@Id // Clé primaire
	@GeneratedValue(strategy = 	GenerationType.AUTO) // Auto incrémenté
*/

	private int id;
	private String pseudonyme;
	private String prenom;
	private String nom;
	private Category categorie;
	//@DateTimeFormat(pattern = "yyyy/MM/dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;
	

	public Superhero() {

	}

	public Superhero(String pseudonyme, String prenom, String nom, Category categorie, LocalDate birthday) {
		super();
		this.pseudonyme = pseudonyme;
		this.prenom = prenom;
		this.nom = nom;
		this.categorie = categorie;
		this.birthday = birthday;
	}


	public Superhero(int id, String pseudonyme, String prenom, String nom, Category categorie, LocalDate birthday) {
		super();
		this.id = id;
		this.pseudonyme = pseudonyme;
		this.prenom = prenom;
		this.nom = nom;
		this.categorie = categorie;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Category getCategorie() {
		return categorie;
	}

	public void setCategorie(Category categorie) {
		this.categorie = categorie;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Superhero [id=" + id + ", pseudonyme=" + pseudonyme + ", prenom=" + prenom + ", nom=" + nom
				+ ", categorie=" + categorie + ", birthday=" + birthday + "]";
	}






}
