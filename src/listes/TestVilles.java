package listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		
		/*
		 * Ville la plus peuplée
		 */
		Ville max = villes.get(0);
		
		for(Ville ville: villes) {
			if (ville.getNbHab() > max.getNbHab()) {
				max = ville;
			}
		}
		System.out.println("La plus grande ville = " + max);
		
		
		/*
		 * Ville la moins peuplée
		 */
		Ville min = villes.get(0);
		
		for(Ville ville: villes) {
			if (ville.getNbHab() < min.getNbHab()) {
				min = ville;
			}
		}
		System.out.println("La plus petite ville = " + min);
		
		/**
		 * Mettre en majuscules les villes de plus de 100 000 habitants
		 */
		for (Ville ville: villes) {
			if(ville.getNbHab() > 100000) {
				String villesEnMaj = ville.getNom().toUpperCase();
				ville.setNom(villesEnMaj);
			}
		}
		
		/**
		 * Affichage final
		 */
		for (Ville ville: villes) {
			System.out.println(ville);
		}
		
	}

}
