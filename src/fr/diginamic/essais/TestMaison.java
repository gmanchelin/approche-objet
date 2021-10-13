package fr.diginamic.essais;

import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Piece[] piece = new Piece[9];
		Maison maison = new Maison(piece);
		WC wc = new WC(6.0, 0);

	}

}
