package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}

	public String getType() {
		return "DEBIT";
	}
	
	public String toString() {
		return dateOperation + " / -" + montantOperation + "€";
	}
	
}
