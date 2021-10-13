package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		/**
		 * Instanciation des doubles � calculer et de l'op�rateur � utiliser
		 */
		double a = 7.5;
		double b = 10.0;
		char operateur = '+';
		
		System.out.println(Operations.calcul(a, b, operateur));
		
		/**
		 * 	Modification du caract�re operateur entre chaque Sysout pour tester la m�thode
		 */
		operateur = '-';
		System.out.println(Operations.calcul(a, b, operateur));
		operateur = '*';
		System.out.println(Operations.calcul(a, b, operateur));
		operateur = '/';
		System.out.println(Operations.calcul(a, b, operateur));
		
		
		
	}

}
