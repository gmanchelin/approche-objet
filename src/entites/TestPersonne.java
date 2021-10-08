package entites;

public class TestPersonne {

	public static void main(String[] args) {

		
		AdressePostale adresse1 = new AdressePostale(24, "Rue Denfert Rochereau",72400, "La Ferté-Bernard");
		AdressePostale adresse2 = new AdressePostale(43, "Rue de Stalingrad", 44000, "Nantes");
		
		Personne personne1 = new Personne("Broussard", "Jean", adresse1);
		Personne personne2 = new Personne("Devaud", "Gérard", adresse1);

		personne1.identiteEnMajuscules();
		
		personne1.afficherNom();
		
		personne1.changeAdresse(adresse2);
		
		if(personne1.equals(personne2)) {
			
		}
		
	}

}
