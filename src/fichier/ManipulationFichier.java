package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	 public static void main(String[] args) throws IOException {
	        
		 	/**
		 	* Copier/coller du fichier recensement.csv dans le m�me r�pertoire (autre nom)
		  	*/
		 	Path pathOrigine = Paths.get("C:\\Users\\Trigaltz\\Documents\\COURS\\2021-2023 - CDA\\02 - Java\\6 - Java objet\\J5_J6 - Cours\\TP\\recensement.csv");
		 	Path pathDestination = Paths.get("C:\\Users\\Trigaltz\\Documents\\COURS\\2021-2023 - CDA\\02 - Java\\6 - Java objet\\J5_J6 - Cours\\TP\\recensement2.csv");
		 	Files.copy(pathOrigine, pathDestination);
		 	
		 	/**
		 	 * Lecture du fichier
		 	 */
		 	List<String> lecture = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);
		 	
		 	/**
		 	 * R�cup�ration du fichier et cr�ation d'un nouveau ne comportant que :
		 	 * - Les villes de plus de 25000 habitants
		 	 * - Uniquement les informations de nom de ville, de code d�partement et de population 
		 	 */
	        Path pathFile = Paths.get("C:\\Users\\Trigaltz\\Documents\\COURS\\2021-2023 - CDA\\02 - Java\\6 - Java objet\\J5_J6 - Cours\\TP\\recensement.csv");
	        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
	        List<String> listD = new ArrayList<String>();
	        
	        Path pathD = Paths.get("C:\\Users\\Trigaltz\\Documents\\COURS\\2021-2023 - CDA\\02 - Java\\6 - Java objet\\J5_J6 - Cours\\TP\\\\grandes_villes.csv");
	        for (int i = 1; i < lines.size(); i++) {
	            String line = lines.get(i);
	            String[] tab = line.split(";");
	            
	            int pop = Integer.parseInt(tab[tab.length-1].replaceAll(" ", ""));
	            String nomV = tab[6];
	            int postale = Integer.parseInt(tab[0]);
	            String newLine = nomV + ";" + postale + ";" + pop;
	            
	            if (pop > 25000) {
	                System.out.println(line);
	                listD.add(newLine);
	            }
	        }
	        Files.write(pathD, listD);
	    }
}
