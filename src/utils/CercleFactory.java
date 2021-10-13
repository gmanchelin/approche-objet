package utils;

import entites.Cercle;

public class CercleFactory {
	public double newCercle;
	
	public static Cercle createCercle(double newCercle) {
		
		return new Cercle(newCercle);
	}


	
	
	
}
