package fr.diginamic.banque.entites;

/**
 * Cette classe enfant de Compte pr�cise le taux de r�mun�ration
 * @author Gmanchelin
 *
 */
public class CompteTaux extends Compte {
	
	/** Taux de r�mun�ration */
	double tauxRemuneration;

	/**
	 * Constructeur 
	 * @param numCompte num�ro de compte
	 * @param solde solde dispo du compte
	 * @param tauxRemuneration taux de r�mun�ration du compte
	 */
	public CompteTaux(int numCompte, double solde, double tauxRemuneration) {
		super(numCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString() {
		return "N� de compte : " + getNumCompte() + "; Solde : " + getSolde() + "�; Taux de r�mun�ration : " + tauxRemuneration;
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
