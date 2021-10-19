package recensement;

public class Ville {

	String codeRegion;
	String nomRegion;
	String codeDpt;
	String codeCommune;
	String nomCommune;
	int popTotale;
	
	public Ville() {

	}

	public Ville(String nomCommune) {
		this.nomCommune = nomCommune;
	}


	public Ville(String codeRegion, String nomRegion, String codeDpt, String codeCommune, String nomCommune, int popTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDpt = codeDpt;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTotale = popTotale;
	}

	
	
	public String getCodeRegion() {
		return codeRegion;
	}



	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}



	public String getNomRegion() {
		return nomRegion;
	}



	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}



	public String getCodeDpt() {
		return codeDpt;
	}



	public void setCodeDpt(String codeDpt) {
		this.codeDpt = codeDpt;
	}



	public String getCodeCommune() {
		return codeCommune;
	}



	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}



	public String getNomCommune() {
		return nomCommune;
	}



	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}



	public int getPopTotale() {
		return popTotale;
	}



	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}



	/**
	 * Redéfinition de la méthode toString(), TP méthode equals
	 */
	@Override
	public String toString() {
		return nomCommune + "(code " + codeCommune + ") : Région " + nomRegion + "(" + codeRegion + "), département " + codeDpt + ", " + popTotale + " habitants";
	}
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) object;
		return nomCommune.equals(other.getNomCommune());
	}

}
