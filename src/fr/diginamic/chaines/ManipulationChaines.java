package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaines {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);

		System.out.println(chaine.length()); //21
		
		System.out.println(chaine.indexOf(';')); //6 
		
		System.out.println(chaine.substring(0, chaine.indexOf(';'))); //Durand
		
		System.out.println(chaine.substring(0, chaine.indexOf(';')).toUpperCase()); //DURAND
		
		System.out.println(chaine.substring(0, chaine.indexOf(';')).toLowerCase()); //durand
		
        String[] chaineToTab = chaine.split(";");
        
        for (int i = 0; i < chaineToTab.length; i++) {
        	System.out.println(chaineToTab[i]);
        }
        
        Salarie mDurand = new Salarie(chaineToTab[0], chaineToTab[1], Double.parseDouble(chaineToTab[2].replace(" ", "")));
		System.out.println(mDurand.salaire);
		
	}

}
