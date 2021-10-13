package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie = new Salarie("Durand", "Michel", 1650.0);
		Pigiste pigiste = new Pigiste("Broussard", "Bertrand", 21, 92.7);
		
		System.out.println(salarie.getSalaire());
		System.out.println(pigiste.getSalaire());

		System.out.println(salarie.afficherDonnees());
		System.out.println(pigiste.afficherDonnees());
	}

}
