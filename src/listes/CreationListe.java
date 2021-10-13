package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {

		ArrayList<Integer> entiers = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			entiers.add(i+1);
			System.out.println(entiers.get(i));
		}
		
		System.out.println("La taille de la liste est de " + entiers.size());

	}

}
