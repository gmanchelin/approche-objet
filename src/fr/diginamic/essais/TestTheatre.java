package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		/**
		 * Instanciation d'un objet Theatre
		 */
		Theatre leGrandTheatre = new Theatre("Le Grand Théâtre", 800, 450, 9000.0);
		
		/** 
		 * Tests d'inscription de nouveaux utilisateurs :
		 * - 1er test : toujours en-dessous de la capa max
		 * - 2ème test : capa max atteinte pile-poil
		 * - 3ème test : dépassement de 1 de la capa max : message d'erreur
		 */
		leGrandTheatre.inscrire(200, 20.0);
		leGrandTheatre.inscrire(150, 15.0);
		leGrandTheatre.inscrire(1, 20.0);
		
		
	}	
}
