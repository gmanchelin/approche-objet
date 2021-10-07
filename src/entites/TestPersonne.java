package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		
		AdressePostale adresse1 = new AdressePostale(24, "Rue Denfert Rochereau",72400, "La Ferté-Bernard");
		
		Personne personne1 = new Personne("Broussard", "Jean", adresse1);
		
		Personne personne2 = new Personne("Devaud", "Gérard", adresse1);

	}

}
