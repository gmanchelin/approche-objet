package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {

		/**
		 * Liste initiée avec des valeurs en int
		 */
		ArrayList<Integer> entiers = new ArrayList<>();
		entiers.add(-1);
		entiers.add(5);
		entiers.add(7);
		entiers.add(3);
		entiers.add(-2);
		entiers.add(4);
		entiers.add(8);
		entiers.add(5);
		
		/**
		 * Affichage des éléments de la liste, méthode 1
		 */
		for (int i = 0; i < entiers.size(); i++) {
			System.out.println(entiers.get(i));
		}
		
		/**
		 * Affichage des éléments de la liste, méthode 2
		 */
		System.out.println(entiers);
		
		/**
		 * Affichage de la taille de la liste
		 */
		System.out.println("Taille de la liste : " + entiers.size());

		/**
		 * Affichage du plus grand élément de la liste, 1ère méthode
		 */
		Object max = Collections.max(entiers);
		System.out.println("Plus grande valeur de la liste : " + max);
		
		
		/**
		 * Affichage du plus grand élément de la liste, 2ème méthode
		 */
		int maxValue = entiers.get(0);
		for (int element : entiers) {
			if (element > maxValue) {
				maxValue = element;
			}
		}
		System.out.println("Plus grande valeur de la liste : " + maxValue);
		
		/**
		 * Suppression du plus petit élément de la liste
		 */
		Object min = Collections.min(entiers);
		entiers.remove(min);
		
		/**
		 * Passage de tous les éléments négatifs en positifs
		 */
		for (int i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) < 0) {
				entiers.set(i, entiers.get(i) * -1);
			};
		}
		
		/**
		 * Réffichage des éléments de la liste après modifications
		 */
		for (int i = 0; i < entiers.size(); i++) {
			System.out.println(entiers.get(i));
		}
		
	}

}
