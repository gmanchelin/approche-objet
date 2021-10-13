package fr.diginamic.maison;

public class Maison {
	
	Piece[] tabPiece;
	
	public Maison(Piece[] tabPiece) {
		super();
		this.tabPiece = tabPiece;
	}

	public void ajouterPiece(Piece piece, int i) {
		i = tabPiece.length;
		switch(piece.getClass().toString()) {
		case "Cuisine" : break;
		case "Chambre" : break;
		case "Salon" : break;
		case "SalleDeBain" : break;
		case "WC" : break;
		}

	}
	
	public double getSuperficieTotale() {
		return 1;
	}
	
	public double getSuperficieParEtage() {
		return 1;
	}
	
	public double getSuperficieParTypePiece() {
		return 1;
	}
	
	public int getNbPiecesParTypePiece() {
		return 1;
	}

}
