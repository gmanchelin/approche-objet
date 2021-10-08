package fr.diginamic.banque.entites;

public abstract class Operation {
	protected String dateOperation;
	protected double montantOperation;
	
	public Operation(String dateOperation, double montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	public abstract String getType();
	
	public abstract String toString();
	
}
