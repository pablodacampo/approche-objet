package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Germany");
		set.add("UK");
		set.add("Italy");
		set.add("Japon");
		set.add("China");
		set.add("Russia");
		set.add("India");
		
		System.out.println("Exercise 2");
		
		System.out.println(set);
		
		String maxLetters = set.iterator().next();
		
		for (String name : set) {		
			if(name.length() > maxLetters.length()) {
				maxLetters = name;
			}			
		}	
		
		
		System.out.println(Collections.max(set));
		set.remove(Collections.max(set));
		System.out.println(set);

	}

}
