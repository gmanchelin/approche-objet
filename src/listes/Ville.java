package listes;

public class Ville {
	String nom;
	int nbHab;
	
	public Ville(String nom, int nbHab) {
		this.nom = nom;
		this.nbHab = nbHab;
	}

	@Override
	public String toString() {
		return "Nom : " + nom + " - Nb d'habitants : " + nbHab ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}	
	
	

}
