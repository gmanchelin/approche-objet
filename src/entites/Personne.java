package entites;

import java.util.Scanner;


public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;		
	}
	
	// Getters & Setters :
	String getNom() {
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

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

	
	//Méthodes :
	public void identiteEnMajuscules() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	
	public void changeNom(String nvNom) {
		this.nom = nvNom;
	}
	
	public void changePrenom(String nvPrenom) {
		this.prenom = nvPrenom;
	}
	
	public void changeAdresse(AdressePostale nvAdresse) {
		this.adresse = nvAdresse;
	}
	
	public String afficherNom() {
		return this.nom;
	}
	
	public String afficherPrenom() {
		return this.prenom;
	}
	
	public AdressePostale afficherAdresse() {
		return this.adresse;
	}
	
}
