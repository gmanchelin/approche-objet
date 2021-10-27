package recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;



public class Application {

	public static void main(String[] args) throws IOException {

		/**
		 * Etape 1 : Code de lecture du fichier
		 */
		Path pathFile = Paths.get("C:\\Users\\Trigaltz\\Documents\\COURS\\2021-2023 - CDA\\02 - Java\\6 - Java objet\\J5_J6 - Cours\\TP\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		List<Ville> villes = new ArrayList<Ville>();
		Integer pop = null;
		
		for (String line : lines) {
			String[] file = line.split(";");
			if (pop == null) {
				pop = 0;
				continue;
			}
			Ville ville = new Ville(file[0], file[1], file[2], file[5], file[6], Integer.parseInt(file[9].replace(" ", "")));
			villes.add(ville);
		}
		
		/**
	     * Etape 3 : Ville de Montpellier et affichage des infos la concernant
	     */
		for (Ville ville : villes) {
			if (ville.getNomCommune().equals("Montpellier")) {
				System.out.println(ville);
			}
		}
		
		/**
		 * Etape 4 : Population de l'Hérault
		 */
		int popHerault = 0;
		for (Ville ville : villes) {
			if (ville.getCodeDpt().equals("34")) {
				popHerault = popHerault + ville.getPopTotale();
			}
		}
		System.out.println("L'Hérault comporte "+popHerault+" habitants.");
		
		/**
		 * Etape 5 : Plus petite ville du département
		 * Pour cela j'initialise une variable petiteVilleHerault à 0
		 * Et un objectPetiteVilleHerault vide pour le moment
		 */
	      int petiteVilleHerault = 0;
	      Ville objectPetiteVilleHerault = new Ville();  
	      for (Ville ville : villes) {
	    	  /**
	    	   * Premier if pour que petiteVilleHerault prenne la valeur de la population d'une ville
	    	   */
	    	  if (ville.getCodeDpt().equals("34") && petiteVilleHerault == 0){
	    		  petiteVilleHerault = ville.getPopTotale();
	    	  }
	    	  /**
	    	   * Second if comparatif qui vient mettre dans objectPetiteVilleHerault la valeur d'une ville
	    	   * si sa population est inférieure à celle de petiteVilleHerault
	    	   */
	    	  if (ville.getCodeDpt().equals("34") && ville.getPopTotale() < petiteVilleHerault) {
	    		  petiteVilleHerault = ville.getPopTotale();
	    		  objectPetiteVilleHerault = ville;
	    	  }
	      }
	      System.out.println("La plus petite ville de l'Hérault est "+objectPetiteVilleHerault.toString()+"\n");
	      
        /**
         * Etape 6 : Affichage des 10 plus grandes et petites villes de l'Hérault
         * Dans un premier temps, je récupère toutes les villes de l'Hérault
         */
	      List<Ville> villesHerault = new ArrayList<Ville>();
	      for (Ville ville : villes) {
				if (ville.getCodeDpt().equals("34")) {
					villesHerault.add(ville);
				}
			}
	      /**
	       * Puis je trie la liste par taille de population et affiche avec Sysout dans une boucle 
	       * for les 10 premières pour avoir les 10 villes les moins peuplées de l'Hérault
	       */
	      System.out.println("Les 10 villes les moins peuplées de l'Hérault sont : ");
	      Collections.sort(villesHerault);
	      for (int i = 0; i < 10; i++) {
	    	  System.out.println(i+1+" : "+villesHerault.get(i));
	      }
	      System.out.println(" ");
	      /**
	       * Enfin, je trie la liste par ordre décroissant de population pour afficher les plus grandes
	       */
	      System.out.println("Les 10 villes les plus peuplées de l'Hérault sont : ");
	      Collections.sort(villesHerault, Collections.reverseOrder());
	      for (int i = 0; i < 10; i++) {
	    	  System.out.println(i+1+" : "+villesHerault.get(i));
	      }
	      
        /**
         * Etape 7 : Population de la région Occitanie
         */
	      int popOccitanie = 0;
	      List<Ville> villesOccitanie = new ArrayList<Ville>(); // Pour l'étape 8
	      for (Ville ville : villes) {
				if (ville.getNomRegion().equals("Occitanie")) {
					popOccitanie = popOccitanie + ville.getPopTotale();
					villesOccitanie.add(ville);
				}
			}
	      System.out.println("");
	      System.out.println("La population totale de la région Occitanie est de "+popOccitanie+"\n");
        
	      /**
	       * Etape 8 : Affichage des 10 villes les plus importantes de la région Occitanie 
	       */
	      System.out.println(" ");
	      System.out.println("Les 10 villes les plus peuplées de l'Occitanie sont : ");
	      Collections.sort(villesOccitanie, Collections.reverseOrder());
	      for (int i = 0; i < 10; i++) {
	    	  System.out.println(i+1+" : "+villesOccitanie.get(i));
	      }
	      
	      /**
	       * Etape 8 : Affichage du département le plus peuplé de l'Occitanie
	       */
	      Map<String, Integer> occitanieMap = new HashMap<>();
	      Collections.sort(villesOccitanie, Comparator.comparing(Ville::getCodeDpt));
	      String temp = "";
	      int tempInt = 0;
	      
	      for (Ville ville : villesOccitanie) {
	    	  if (!temp.equals(ville.getCodeDpt())){
	    		  tempInt = 0;
	    		  temp = ville.getCodeDpt();
	    	  }
	    	  tempInt += ville.getPopTotale();
	    	  occitanieMap.put(ville.getCodeDpt(), tempInt);
	      }
	      
	      int max = Integer.MIN_VALUE;
	      String dep = null;
	      Iterator iterator = occitanieMap.entrySet().iterator();
	      while(iterator.hasNext()) {
	    	  Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();
	    	  if (entry.getValue() > max) {
	    		  max = entry.getValue();
	    		  dep = entry.getKey();
	    	  }
	      }
	      
	      System.out.println("Départements de l'Occitanie et leur total d'habitants : "+occitanieMap);
	      System.out.println("Le département le plus peuplé d'Occitanie est le "+dep+" avec "+max+" habitants.");
	      
	      /**
	       * Etape 9 : affichage des 10 régions les plus peuplées de France
	       */
	      Map<String, Integer> regionsMap = new HashMap<>();
	      Collections.sort(villes, Comparator.comparing(Ville::getNomRegion));
	      
	      for (Ville ville : villes) {
	    	  if (!temp.equals(ville.getNomRegion())){
	    		  tempInt = 0;
	    		  temp = ville.getNomRegion();
	    	  }
	    	  tempInt += ville.getPopTotale();
	    	  regionsMap.put(ville.getNomRegion(), tempInt);
	      }

	      final Map<String, Integer> triRegion = regionsMap
	    		  .entrySet().stream()
	    		  .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
	    		  .limit(10)
	    		  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	      
    	  System.out.println("Les 10 régions de France les plus peuplées sont : "+triRegion+"\n");
    	 
    	  
	      /**
	       * Etape 9 : affichage des 10 départements les plus peuplées de France
	       */
    	  Map<String, Integer> departementsMap = new HashMap<>();
	      Collections.sort(villes, Comparator.comparing(Ville::getCodeDpt));
	      
	      for (Ville ville : villes) {
	    	  if (!temp.equals(ville.getCodeDpt())){
	    		  tempInt = 0;
	    		  temp = ville.getCodeDpt();
	    	  }
	    	  tempInt += ville.getPopTotale();
	    	  departementsMap.put(ville.getCodeDpt(), tempInt);
	      }

	      final Map<String, Integer> triDepartement = departementsMap
	    		  .entrySet().stream()
	    		  .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
	    		  .limit(10)
	    		  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	      
    	  System.out.println("Les 10 départements de France les plus peuplées sont : "+triDepartement+"\n");
    	  
	      /**
	       * Etape 9 : affichage des 10 villes les plus peuplées de France
	       */
	      System.out.println("Les 10 villes les plus peuplées de France sont : ");
	      Collections.sort(villes, Collections.reverseOrder());
	      for (int i = 0; i < 10; i++) {
	    	  System.out.println(i+1+" : "+villes.get(i));
	      }
	      
	      
        /**
         * TP méthode equals 
         */
	    System.out.println("");
        Ville testVille1 = new Ville("Nantes");
        Ville testVille2 = new Ville("Nantes");
        System.out.println(testVille1.equals(testVille2)); //retourne true (voir Override equals dans Ville)
        testVille1.nomCommune = "Angers";
        System.out.println(testVille1.equals(testVille2)); //retourne false, car les valeurs sont maintenant différentes
        testVille1.nomCommune = "Nantes";
        System.out.println(testVille1 == testVille2); //retourne false, car == compare les adresses, et que celles-ci sont différentes 
        
        /**
         * Pour que le == retourne true, je dois faire en sorte que
         * si les valeurs sont les mêmes, mais que les adresses mémoires diffèrent,
         * alors la première valeur devient égale à la seconde.
         */
        if(testVille1.equals(testVille2) && testVille1 != testVille2) {
        	testVille1 = testVille2;
        }
        System.out.println(testVille1 == testVille2); //retourne true
        
	}

}


