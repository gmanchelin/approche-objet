package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetObjets {

	public static void main(String[] args) {

		HashSet<Pays> set = new HashSet<>();
		Pays usa = new Pays("USA", 329500000, 63543.58);
		set.add(usa);
		Pays france = new Pays("France", 67390000, 38625.07);
		set.add(france);
		Pays allemagne = new Pays("Allemagne", 83240000, 45723.64);
		set.add(allemagne);
		Pays uk = new Pays("UK", 67220000, 40284.64);
		set.add(uk);
		Pays italie = new Pays("Italie", 59550000, 31676.20);
		set.add(italie);
		Pays japon = new Pays("Japon", 125800000, 40113.06);
		set.add(japon);
		Pays chine = new Pays("Chine", 1402000000, 10500.40);
		set.add(chine);
		Pays russie = new Pays("Russie", 144100000, 10126.72);
		set.add(russie);
		Pays inde = new Pays("Inde", 1380000000, 1900.71);
		set.add(inde);
		
		/**
		 * Pays ayant le plus haut PIB/habitant
		 */
		Pays maxPibHab = new Pays("test", 0, 0.0);
		Iterator<Pays> iterator1 = set.iterator();
		while (iterator1.hasNext()) {
			Pays pays = iterator1.next();
			if (pays.getPIBParHab() > maxPibHab.getPIBParHab()) {
				maxPibHab = pays;
			}
		}
		System.out.println("Plus haut PIB par habitant : " + maxPibHab);

		/**
		 * Pays ayant le plus haut PIB
		 */
		Pays maxPib = new Pays("test", 0, 0.0);
		Iterator<Pays> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			Pays pays = iterator2.next();
			if (pays.getPIBParHab() * pays.getNbHab() > maxPib.getPIBParHab() * maxPib.getNbHab()) {
				maxPib = pays;
			}
		}
		System.out.println("Plus haut PIB : " + maxPib);
		
		/**
		 * Pays ayant le PIB le plus faible (minPib)
		 */
		Pays minPib = new Pays("test", 1000000000, 100000000.0);
		Iterator<Pays> iterator3 = set.iterator();
		while (iterator3.hasNext()) {
			Pays pays = iterator3.next();
			if (pays.getPIBParHab() * pays.getNbHab() < minPib.getPIBParHab() * minPib.getNbHab()) {
				minPib = pays;
			}
		}
		
		minPib.setNom(minPib.getNom().toUpperCase());
		
		/**
		 * 
		 */
		System.out.println("Plus faible PIB : " + minPib);
		
		/**
		 * Suppression du pays ayant le plus faible PIB
		 * Pour cela, on retire du HashSet l'objet ayant pour valeurs 
		 * les mêmes que celles de l'objet minPib 
		 */
		set.remove(minPib);
		
		/**
		 * 
		 */
		for (Pays pays : set) {
			System.out.println(pays);
		}

	}

}
