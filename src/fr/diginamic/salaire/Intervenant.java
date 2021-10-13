package fr.diginamic.salaire;

public abstract class Intervenant {

	String nom;
	String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public abstract double getSalaire();
	public abstract String afficherDonnees();
}
