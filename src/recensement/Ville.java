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



	public Ville(String codeRegion2, String nomRegion, String codeDpt2, String codeCommune2, String nomCommune, int popTotale) {
		this.codeRegion = codeRegion2;
		this.nomRegion = nomRegion;
		this.codeDpt = codeDpt2;
		this.codeCommune = codeCommune2;
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
	 * Redéfinition de la méthode toString()
	 */
	@Override
	public String toString() {
		return nomCommune + "(code " + codeCommune + ") : Région " + nomRegion + "(" + codeRegion + "), département " + codeDpt + ", " + popTotale + " habitants";
	}

	
	
}
