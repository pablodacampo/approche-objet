package maps;

import java.util.HashMap;

public class CreationAndHandlingMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put (13, "Marseille" );
		mapVilles.put (34, "Montpellier" );
		mapVilles.put (44, "Nantes" );
		mapVilles.put (75, "Paris" );
		mapVilles.put (31, "Toulouse" );
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		for (Integer key : mapVilles.keySet()) {
			System.out.println("Map Keys : " + key);
		}
		
		System.out.println("\n");
		
		for (String value : mapVilles.values()) {
			System.out.println("Map Values : " + value);
		}
		
		System.out.println("\n");
		
		System.out.println("Map Size : " + mapVilles.size());

	}

}
