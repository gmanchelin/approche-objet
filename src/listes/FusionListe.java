package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {

		/*
		 * Instanciation de 2 ArrayLists de Strings
		 * Avec ajout de contenu à l'intérieur
		 */
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		/**
		 * Mettre dans liste3 l'ensemble des 2 listes précédentes
		 */
		List<String> liste3 = new ArrayList<String>();
		liste3.addAll(liste1);
		liste3.addAll(liste2);
		
	}

}
