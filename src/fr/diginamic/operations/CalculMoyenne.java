package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	double[] tableau = new double[0];
	
	public void ajout(double newDouble) {
		double[] temp = new double[tableau.length+1];
		for (int i = 0; i < tableau.length; i++) {
			temp[i] = tableau[i];
		}	
		temp[temp.length-1] = newDouble;
		tableau = temp;
	}
	
	public double calcul() {
		double total = 0.0;
		for(int i = 0; i < tableau.length; i++) {
			total = total + tableau[i];
		}
		return total / tableau.length;
	}

	@Override
	public String toString() {
		return "CalculMoyenne [tableau=" + Arrays.toString(tableau) + "]";
	}
	
	

}
