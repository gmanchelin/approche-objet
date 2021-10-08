package utils;

public class ConversionNombre {
	
	public static void main(String[] args) {
	
	// Déclarer un nombre dans un String
	String chaine = "12";
	
	/* Mettre dans une variable la valeur du String précédent en int
	 * avec la classe Integer, méthode parseInt : */
	int i = Integer.parseInt(chaine);
	
	// Déclaration de 2 variables int : 
	int a = 19;
	int b = 12;

	/* Classe Integer et méthode max pour comparer la plus haute valeur 
	 * entre les deux int : */
	System.out.println(Integer.max(a, b));

	}

}
