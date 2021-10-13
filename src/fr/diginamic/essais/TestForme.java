package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {

		Cercle cercle = new Cercle(8.4);
		Carre carre = new Carre(4.2);
		Rectangle rectangle = new Rectangle(7.9, 12.5);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(carre);
		AffichageForme.afficher(rectangle);
	}

}
