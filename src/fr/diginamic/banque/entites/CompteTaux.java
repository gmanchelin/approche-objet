package fr.diginamic.banque.entites;

/**
 * Cette classe enfant de Compte précise le taux de rémunération
 * @author Gmanchelin
 *
 */
public class CompteTaux extends Compte {
	
	/** Taux de rémunération */
	double tauxRemuneration;

	/**
	 * Constructeur 
	 * @param numCompte numéro de compte
	 * @param solde solde dispo du compte
	 * @param tauxRemuneration taux de rémunération du compte
	 */
	public CompteTaux(int numCompte, double solde, double tauxRemuneration) {
		super(numCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString() {
		return "N° de compte : " + getNumCompte() + "; Solde : " + getSolde() + "€; Taux de rémunération : " + tauxRemuneration;
	}

	/** Getter
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * 
	 * @param tauxRemuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
	
	
}
