package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numRue = 24;
		adresse1.libelleRue = "Rue Denfert Rochereau";
		adresse1.codePostal = 72400;
		adresse1.ville = "La Ferté-Bernard";
		
		Personne personne1 = new Personne();
		personne1.nom = "Broussard";
		personne1.prenom = "Jean";
		personne1.adresse = adresse1;
		
		Personne personne2 = new Personne();
		personne2.nom = "Devaud";
		personne2.nom = "Gérard";
		personne2.adresse = adresse1;

	}

}
