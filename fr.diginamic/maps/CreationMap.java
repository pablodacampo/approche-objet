package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String args[]) {

		HashMap<String, Integer> mapSalaries = new HashMap<String, Integer>();

		mapSalaries.put("Paul", 1750);
		mapSalaries.put("Hicham", 1825);
		mapSalaries.put("Yu", 2250);
		mapSalaries.put("Ingrid", 2015);
		mapSalaries.put("Chantal", 2418);

		System.out.println(mapSalaries);
		System.out.println(mapSalaries.size());

	}

}
