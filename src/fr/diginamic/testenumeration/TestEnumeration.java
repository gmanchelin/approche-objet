package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		Saison[] saisons = Saison.values();
		for (Saison listingSaisons : saisons) {
			System.out.println(listingSaisons.getOrdre() + ". " + listingSaisons.getLibelle());
		}
		

		String libelle = "Automne";
		System.out.println(Saison.getSaisonByLibelle(libelle));
		
		
		
	}

}
