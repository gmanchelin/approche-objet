package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte(1501, 5691.97);
	
		/*
		 * En red�finissant la m�thode toString dans la classe Compte, 
		 * je permets au System.out d'afficher les informations des objets
		 * plut�t que leur adresse de r�f�rence
		*/
		System.out.println(compte);
		
	}

}
