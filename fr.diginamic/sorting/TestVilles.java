package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class TestVilles {

	public static void main(String[] args) {
		
		List<Ville> liste = new ArrayList<>();
		
		liste.add(new Ville("Nice", 343_000, "06"));
		liste.add(new Ville("Carcassonne", 47_800, "66"));
		liste.add(new Ville("Narbonne", 53_400, "66"));
		liste.add(new Ville("Lyon", 484_000, "69"));
		liste.add(new Ville("Foix", 9_700, "09"));
		liste.add(new Ville("Pau", 77_200, "64"));
		liste.add(new Ville("Marseille", 850_700, "13"));
		liste.add(new Ville("Tarbes", 40_600, "64"));

		// Count the number of cities by department.

		// Step 1: creation of a HashMap which stores:
		// - in key: the department (type String)
		// - in value: the counter (type Integer)
		HashMap <String, Integer> map = new HashMap <> ();

		// Step 2: browse the list of cities
		for (Ville v: liste) {

		// Step 3: we check if there is a counter for the city department
		Integer compteur = map.get (v.getDepartement ());

		// Step 4: if it does not exist, create the counter with the value 1
		if (compteur == null) {
		map.put (v.getDepartement (), 1);
		}
		// Step 5: if it exists we increment it and we store it in the map with its new value
			else {
				compteur++;
				map.put(v.getDepartement(), compteur);
			}
		}

	}

}