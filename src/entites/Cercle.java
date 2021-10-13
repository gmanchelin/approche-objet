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
	 * Méthode calculant le périmètre de l'objet Cercle créé 
	 * @return (rayon * 2 * PI)
	 */
	public double getPerimetre() {
		return rayon * 2 * Math.PI;
	}
	
	/**
	 * Méthode calculant la surface de l'objet Cercle créé 
	 * @return (rayon^2 * PI)
	 */
	public double getSurface() {
		return rayon * rayon * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Rayon : " + rayon 
				+ "cm \nPérimètre : " + rayon * 2 * Math.PI 
				+ "cm\nSurface : " + rayon * rayon * Math.PI+"cm²";
	}
	
}
