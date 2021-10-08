package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}
	
	public String getType() {
		return "CREDIT";
	}
	
	public String toString() {
		return dateOperation + " / +" + montantOperation + "€";
	}
	
}
