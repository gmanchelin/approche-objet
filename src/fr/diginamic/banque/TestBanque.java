package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte compteNormal = new Compte(1501, 5691.97);
		CompteTaux compteTaux = new CompteTaux(1502, 12604.23, 0.2);
	
		/*
		 * En red�finissant la m�thode toString dans la classe Compte, 
		 * je permets au System.out d'afficher les informations des objets
		 * plut�t que leur adresse de r�f�rence
		*/
		System.out.println(compteNormal);
		
		/* 
		 * Cr�ation d'un tableau ayant : 
		 * - En index 0 : une instance de Compte normale
		 * - En index 1 : une instance de CompteTaux
		 */
		Compte[] tableauCompte = new Compte[2];
		tableauCompte[0] = compteNormal;
		tableauCompte[1] = compteTaux;
		
		for (int i = 0; i < tableauCompte.length; i++) {
			System.out.println(tableauCompte[i]);
		}

	}

}
