package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		/**
		 * Test 1 : StringBuilder (initialisation du chrono et du long)
		 */
		long debut1 = System.currentTimeMillis();
		long i = 1;
		
		/**
		 * Boucle pour mettre les nombres de 1 à 100 000 dans le StringBuilder
		 */
		StringBuilder builder = new StringBuilder();
		for (i = 1; i <= 100000; i++) {
			builder.append(i).append(" ; ");
		}
		
		/**
		 * Fin du chrono et affichage
		 */
		long fin1 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes (Test 1) : " + (fin1 - debut1)+ "ms"); //entre 7 et 8ms
		
		// -----------------------------------------------------------------------------------------------------
		
		/**
		 * Test 2 : String (initialisation du chrono et du String)
		 */
		long debut2 = System.currentTimeMillis();
		String nombres = "";
		
		/**
		 * Boucle pour mettre les nombres de 1 à 100 000 dans le String
		 */
		for (i = 1; i <= 100000; i++) {
			nombres = nombres + i + " ; ";
		}
				
		/**
		 * Fin du chrono et affichage
		 */
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes (Test 2) : " + (fin2 - debut2) + "ms"); //Entre 6600 et 7000ms environ
		
	}

}
