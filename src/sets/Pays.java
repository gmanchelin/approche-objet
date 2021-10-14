package sets;

public class Pays {
	String nom;
	int nbHab;
	double PIBParHab;
	
	public Pays(String nom, int nbHab, double pIBParHab) {
		this.nom = nom;
		this.nbHab = nbHab;
		PIBParHab = pIBParHab;
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

	public double getPIBParHab() {
		return PIBParHab;
	}

	public void setPIBParHab(double pIBParHab) {
		PIBParHab = pIBParHab;
	}

	@Override
	public String toString() {
		return "Pays : " + nom + " - Nombre d'habitants : " + nbHab + " - PIB/habitant : " + PIBParHab;
	}
	
	

}
