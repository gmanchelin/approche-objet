package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		nom = this.nom;
		prenom = this.prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		nom = this.nom;
		prenom = this.prenom;
		adresse = this.adresse;
	}
	
}
