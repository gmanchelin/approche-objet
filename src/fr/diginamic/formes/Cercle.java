package fr.diginamic.formes;

public class Cercle extends Forme {
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * @Override
	 */
	public double calculerSurface() {
		return rayon * rayon * Math.PI;
	}
	
	/**
	 * @Override
	 */
	public double calculerPerimetre() {
		return rayon * 2 * Math.PI;
	}
	
}


