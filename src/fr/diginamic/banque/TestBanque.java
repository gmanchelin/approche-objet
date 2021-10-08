package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte(1501, 5691.97);
	
		/*
		 * En redéfinissant la méthode toString dans la classe Compte, 
		 * je permets au System.out d'afficher les informations des objets
		 * plutôt que leur adresse de référence
		*/
		System.out.println(compte);
		
	}

}
