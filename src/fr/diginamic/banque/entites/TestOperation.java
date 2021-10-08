package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		// Déclaration d'instances d'Operations (Credit et Debit)
		Credit operation1 = new Credit("19/09/2021", 120.70);
		Debit operation2 = new Debit("21/09/2021", 91.02);
		Credit operation3 = new Credit("01/10/2021", 926.17);
		Debit operation4 = new Debit("04/10/2021", 680.98);	
		
		// Tableau avec les instances d'Operation mises à chaque index : 
		Operation[] tableauOp = new Operation[4];
		tableauOp[0] = operation1;
		tableauOp[1] = operation2;
		tableauOp[2] = operation3;
		tableauOp[3] = operation4;
		
		// Syso pour afficher les opérations :
		for (int i = 0; i < tableauOp.length; i++) {
			System.out.println(tableauOp[i].getType() + " : " + tableauOp[i].toString());
		}
		System.out.println("\n");
		
		// Initialisation d'une variable montant et i pour les boucles de calcul :
		double montant = 0.0;
		int i;
		
		/* Le programme exécute la boucle de calcul suivante : 
		 * - addition du montantOperation de l'opération à la variable montant si getType = "CREDIT"
		 * - soustraction du montantOperation de l'opération à la variable montant si getType = "CREDIT"
		 */
		do {
			for (i = 0; i < tableauOp.length; i++) {
				if (tableauOp[i].getType() == "CREDIT") {
					montant = montant + tableauOp[i].montantOperation;	
				} else {
					montant = montant - tableauOp[i].montantOperation;	
				}
			}
		} while (i != tableauOp.length);
		System.out.println("Le montant global des opérations est de " + montant + "€");

	}

}
