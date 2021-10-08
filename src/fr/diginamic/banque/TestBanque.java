package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte(1501, 5691.97);
		
		System.out.println(compte);

	}

}
