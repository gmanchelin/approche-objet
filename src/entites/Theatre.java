package entites;

public class Theatre {
	String nom;
	int maxCapa;
	int totalInscrits;
	double recette;
	
	public Theatre(String nom, int maxCapa, int totalInscrits, double recette) {
		this.nom = nom;
		this.maxCapa = maxCapa;
		this.totalInscrits = totalInscrits;
		this.recette = recette;
	}



	public void inscrire(int nbClients, double prix) {
		if((totalInscrits + nbClients) <= maxCapa) {
			totalInscrits = totalInscrits + nbClients;
			recette = recette + prix * nbClients;
			System.out.println("Inscription prise en compte."
					+ "\nNombre de clients : " + totalInscrits + "/" + maxCapa
					+ "\nRecette totale : " + recette + "€"
					+ "\n");
		} else {
			System.out.println("La capacité maximale du théâtre est déjà atteinte, inscription impossible.");
		}
	}

}
