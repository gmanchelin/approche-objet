package utils;

public class ConversionNombre {
	
	public static void main(String[] args) {
	
	// D�clarer un nombre dans un String
	String chaine = "12";
	
	/* Mettre dans une variable la valeur du String pr�c�dent en int
	 * avec la classe Integer, m�thode parseInt : */
	int i = Integer.parseInt(chaine);
	
	// D�claration de 2 variables int : 
	int a = 19;
	int b = 12;

	/* Classe Integer et m�thode max pour comparer la plus haute valeur 
	 * entre les deux int : */
	System.out.println(Integer.max(a, b));

	}

}
