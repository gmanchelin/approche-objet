package sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {

		/**
		 * Instanciation du HashSet 
		 */
		HashSet<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		/**
		 * Affichage du HashSet
		 */
		System.out.println(set);
		
		/**
		 * Nom le plus long du HashSet
		 */
		String max = Collections.max(set, Comparator.comparing(String::length));
		System.out.println("Nom le plus long : " + max);
		
		/**
		 * Nom le plus long du HashSet, autre méthode
		 */
		String villeMax = "";
		for (String nom: set) {
			if (nom.length() > villeMax.length()) {
				villeMax = nom;
			}
		}
		System.out.println("Nom le plus long : " + villeMax);
		
		/**
		 * Suppression du nom le plus long et réaffichage
		 */
		set.remove(max);
		System.out.println(set);

	}

}
