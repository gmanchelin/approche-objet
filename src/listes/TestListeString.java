package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {

		List<String> villes = new ArrayList<String>();
		villes.add("Nice");
		villes.add("Carcassone");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		
		/**
		 * Ville ayant le plus grand nombre de lettres, 1ère méthode 
		 */
		String nomLePlusLong = "";
		
		for (int i = 0; i < villes.size(); i++) {
			   if (villes.get(i).length() > nomLePlusLong.length()) {
				   nomLePlusLong = villes.get(i);
			   }
			}
		System.out.println("Nom le plus long : " + nomLePlusLong);
		
		/**
		 * Ville ayant le plus grand nombre de lettres, 2ème méthode 
		 */
		String max = Collections.max(villes, Comparator.comparing(String::length));
		System.out.println("Nom le plus long : " + max);

		
		/**
		 * Villes en majuscules
		 */
		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		System.out.println(villes);
		
		/**
		 * Suppression des villes commençant par N
		 */
		Iterator<String> iterator = villes.iterator();
		
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if(ville.startsWith("N")) {
				iterator.remove();
			}
		}
		
		/**
		 * Réaffichage des villes après modifs (sans Nice et Narbonne)
		 */
		System.out.println(villes);
		
	}

}
