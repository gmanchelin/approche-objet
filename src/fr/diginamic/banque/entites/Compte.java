package fr.diginamic.banque.entites;


/**
 * Cette classe représente le concept de compte bancaire dans l'appli
 * @author Gmanchelin
 *
 */
public class Compte {
	
	/** Numéro de compte */
	private int numCompte;
	
	/** Solde du compte */
	private double solde;
	
	/**
	 * Constructeur 
	 * @param numCompte numéro de compte
	 * @param solde solde dispo du compte
	 */
	public Compte(int numCompte, double solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "N° de compte : " + numCompte + "; Solde : " + solde + "€";
	}

	/**
	 * Getters et setters
	 */
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

}
