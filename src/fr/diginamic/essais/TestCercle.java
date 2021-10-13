package fr.diginamic.essais;

import entites.Cercle;
import utils.CercleFactory;



public class TestCercle {

	public static void main(String[] args) {

		/**
		 * Instanciation de deux objets Cercle
		 */
		Cercle cercle1 = new Cercle(6.0);
		Cercle cercle2 = new Cercle(7.4);
		
		/**
		 * Sysout des m�thodes de Cercle sur les deux objets cr��s
		 */
		System.out.println(cercle1.getPerimetre());
		System.out.println(cercle1.getSurface());
		System.out.println(cercle2.getPerimetre());
		System.out.println(cercle2.getSurface());
		
		/**
		 * Sysout du Cercle par le CercleFactory
		 */
		System.out.println(CercleFactory.createCercle(12.9));
	}

	
}
