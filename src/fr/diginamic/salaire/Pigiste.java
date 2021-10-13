package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	int joursTravail;
	double montantJournalier;

	public Pigiste(String nom, String prenom, int joursTravail, double montantJournalier) {
		super(nom, prenom);
		this.joursTravail = joursTravail;
		this.montantJournalier = montantJournalier;
	}

	@Override
	public double getSalaire() {
		return joursTravail * montantJournalier;
	}

	@Override
	public String afficherDonnees() {
		return "Nom : " + nom +
			   "\nPrénom : " + prenom +
			   "\nSalaire : " + getSalaire() + "€" +
			   "\nStatut : Pigiste";
	}

}
