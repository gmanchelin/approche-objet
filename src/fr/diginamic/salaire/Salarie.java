package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	double salaireMensuel;	

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}



	@Override
	public String afficherDonnees() {
		return "Nom : " + nom +
			   "\nPr�nom : " + prenom +
			   "\nSalaire : " + getSalaire() + "�" +
			   "\nStatut : Salari�";
	}
	
	

}
