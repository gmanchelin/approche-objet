package fr.diginamic.testenumeration;

public enum Saison {
	
	ETE("Eté", 1), AUTOMNE("Automne", 2), HIVER("Hiver", 3), PRINTEMPS("Printemps", 4);
	
	private String libelle;
	private int ordre;

	/**
	 * Constructeur
	 * @param libelle
	 * @param ordre
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	
	/**
	 * Getters et setters
	 * @return
	 */
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
		
	/**
	 * Recherche d'une saison à partir de son libellé
	 * @param libelle
	 * @return saison
	 */
	public static Saison getSaisonByLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (libelle.equals(saison.getLibelle())) {
				return saison;
			}
		}
		return null;
	
	}
	
}
