package tri;

public class Ville implements Comparable<Ville>{

	String nom;
	int nbHab;
	
	public Ville(String nom, int nbHab) {
		this.nom = nom;
		this.nbHab = nbHab;
	}

	@Override
	public String toString() {
		return nom + " : " + nbHab + " habitants" ;
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
	
//	@Override
	// tri par ordre alphabétique du nom des villes
//	public int compareTo(Ville o) {
//		return this.nom.compareTo(o.nom);
//	}	
	
	@Override
	// tri par ordre croissant du nombre d'habitants
	public int compareTo(Ville o) {
		return this.nbHab - o.nbHab;
	}	

}
