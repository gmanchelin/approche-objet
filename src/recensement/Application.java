package recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {

		/**
		 * Code de lecture du fichier
		 */
		Path pathFile = Paths.get("C:\\Users\\Trigaltz\\Documents\\COURS\\2021-2023 - CDA\\02 - Java\\6 - Java objet\\J5_J6 - Cours\\TP\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);


		/**
		 * Création du fichier villes.csv qui comporte les infos du fichier recensement.csv
		 * Mais uniquement celles dont on a besoin pour créer une instance de Ville
		 */
        List<String> listD = new ArrayList<String>();
        
        /**
         * Pour l'étape 4 & 5 de l'exercice, j'initialise des int à 0 pour stocker 
         * la population totale de l'Hérault, et la ville ayant la plus faible population
         */
        int popHerault = 0;
        int petiteVilleHerault = 0;
        Ville objectPetiteVilleHerault = new Ville();
        
        Path pathD = Paths.get("C:\\Users\\Trigaltz\\Documents\\COURS\\2021-2023 - CDA\\02 - Java\\6 - Java objet\\J5_J6 - Cours\\TP\\\\villes.csv");
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] tab = line.split(";");
            
            String codeRegion = tab[0];
            String nomRegion = tab[1];
            String codeDpt = tab[2];
            String codeCommune = tab[5];
            String nomCommune = tab[6];
            int popTotale = Integer.parseInt(tab[tab.length-1].replaceAll(" ", ""));
            
            
            String newLine = codeRegion + ";" + 
            				 nomRegion + ";" +
            				 codeDpt + ";" +
            				 codeCommune + ";" +
            				 nomCommune + ";" +
            				 popTotale;
            listD.add(newLine);
            
            /**
             * Ville de Montpellier et affichage des infos la concernant
             */
            if (tab[6].equals("Montpellier")) {
            	Ville ville = new Ville(codeRegion, nomRegion, codeDpt, codeCommune, nomCommune, popTotale);
            	System.out.println(ville.toString());
            }
            
            /**
             * Population totale de l'Hérault
             */
            if (tab[2].equals("34")) {
            	popHerault = popHerault + Integer.parseInt(tab[tab.length-1].replaceAll(" ", ""));
            }
            
            /**
             * Premier if pour mettre dans petiteVilleHerault la population de la première ville
             */
            if(tab[2].equals("34") && petiteVilleHerault == 0) {
            	petiteVilleHerault = Integer.parseInt(tab[tab.length-1].replaceAll(" ", ""));
            } 
            
            /**
             * Second if pour tester si la valeur de la pop totale de la ville est inférieure à
             * celle de petiteVilleHerault, si oui, elle prend la valeur de la pop totale inférieure
             */
            if(tab[2].equals("34") && Integer.parseInt(tab[tab.length-1].replaceAll(" ", "")) < petiteVilleHerault) {
            	petiteVilleHerault = Integer.parseInt(tab[tab.length-1].replaceAll(" ", ""));
            	Ville ville = new Ville(codeRegion, nomRegion, codeDpt, codeCommune, nomCommune, popTotale);
            	objectPetiteVilleHerault = ville;
            }
 
        }
        
        /**
         * Affichage de la population totale de l'Hérault
         * et des infos de la plus petite ville de l'Hérault
         */
        System.out.println("Population totale de l'Hérault : " + popHerault);
        System.out.println(objectPetiteVilleHerault.toString());
        Files.write(pathD, listD);
        
	}

}


