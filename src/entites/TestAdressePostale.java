package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numRue = 24;
		adresse1.libelleRue = "Rue Denfert Rochereau";
		adresse1.codePostal = 72400;
		adresse1.ville = "La Ferté-Bernard";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse1.numRue = 43;
		adresse1.libelleRue = "Rue de Stalingrad";
		adresse1.codePostal = 44000;
		adresse1.ville = "Nantes";
	
	}

}
