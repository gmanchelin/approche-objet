package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationMap {

	public static void main(String[] args) {

		HashMap<String, Integer>mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);

		System.out.println("Taille de mapSalaires : " + mapSalaires.size());
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<String> iterator1 = mapVilles.values().iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		Iterator<Integer> iterator2 = mapVilles.keySet().iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("Taille de mapVilles : " + mapVilles.size());
		
	}

}
