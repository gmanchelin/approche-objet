package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		/**
		 * Affichage du HashSet
		 */
		System.out.println(set);
		
		/**
		 * Affichage de la plus grande valeur 
		 */
		double maxValue = Double.MIN_VALUE; // marche aussi avec maxValue = 0
		for (Double element : set) {
			if (element > maxValue) {
				maxValue = element;
			}
		}
		System.out.println("Plus grande valeur : " + maxValue);
		
		/**
		 * Suppression du plus petit élément 
		 */
		double minValue = Double.MAX_VALUE; // marche aussi avec minValue = 0
		for (Double element : set) {
			if (element < minValue) {
				minValue = element;
			}
		}
		set.remove(minValue);
		
		/**
		 * Réaffichage du HashSet modifié
		 */
		System.out.println(set);
	}

}
