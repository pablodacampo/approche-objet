package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {

		// Map1 Creation
		
		HashMap <Integer, String> map1 = new HashMap <Integer, String>();
		map1.put(1,"Red");
		map1.put(2,"Green");
		map1.put(3,"Orange");
		
		//Map2 Creation
		
		HashMap <Integer, String> map2 = new HashMap <Integer, String>();
		map2.put(4,"White");
		map2.put(5,"Blue");
		map2.put(6,"Orange");
		
		//Map3 Creation
		HashMap <Integer, String> map3 = new HashMap <Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println(map3);

		
	}
}


