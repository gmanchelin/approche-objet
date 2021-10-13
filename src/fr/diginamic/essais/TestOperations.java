package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		/**
		 * Instanciation des doubles à calculer et de l'opérateur à utiliser
		 */
		double a = 7.5;
		double b = 10.0;
		char operateur = '+';
		
		System.out.println(Operations.calcul(a, b, operateur));
		
		/**
		 * 	Modification du caractère operateur entre chaque Sysout pour tester la méthode
		 */
		operateur = '-';
		System.out.println(Operations.calcul(a, b, operateur));
		operateur = '*';
		System.out.println(Operations.calcul(a, b, operateur));
		operateur = '/';
		System.out.println(Operations.calcul(a, b, operateur));
		
		
		
	}

}
