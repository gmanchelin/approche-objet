package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		double[] tab = new double[3];
		CalculMoyenne resultat = new CalculMoyenne();
		resultat.ajout(9.4);
		resultat.ajout(14.5);
		System.out.println(resultat);
		System.out.println(resultat.calcul());
	}
}
