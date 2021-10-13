package entites;

/**
 * @author gmanchelin
 *
 */
public class Cercle {
	double rayon;

	/** 
	 * Constructeur
	 * @param rayon
	 */

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	
	/**
	 * M�thode calculant le p�rim�tre de l'objet Cercle cr�� 
	 * @return (rayon * 2 * PI)
	 */
	public double getPerimetre() {
		return rayon * 2 * Math.PI;
	}
	
	/**
	 * M�thode calculant la surface de l'objet Cercle cr�� 
	 * @return (rayon^2 * PI)
	 */
	public double getSurface() {
		return rayon * rayon * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Rayon : " + rayon 
				+ "cm \nP�rim�tre : " + rayon * 2 * Math.PI 
				+ "cm\nSurface : " + rayon * rayon * Math.PI+"cm�";
	}
	
}
