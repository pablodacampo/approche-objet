package sets;

import java.util.HashSet;
import java.util.Set;


public class TestCountry {
	
	public static Set <Country> set = new HashSet <> ();
	
	public static void main(String[] args) {
		
		set.add(new Country("USA", 327167434, 55805.204 ));
		set.add(new Country("France", 67795000, 38476.7));
		set.add(new Country("Germany", 82979100, 47589.972));
		set.add(new Country("UK", 65105246, 43770.688));
		set.add(new Country("Italy", 60483973, 29866));
		set.add(new Country("Japan", 126168156, 39058.5));
		set.add(new Country("China", 1417913092, 7989.72));
		set.add(new Country("Russia", 146880400, 11099.20));
		set.add(new Country("India", 1296834042, 1626.982));
		
		int max = 0;
		
		for (Country country : set)
			if (country.getNbHabitant() > max)
				max = country.getNbHabitant();
		
		for (Country country : set)
			if (country.nomCountryPop(max) != null)
				System.out.println("Most Inhabitats : " + country.nomCountryPop(max));
		
		double maxD = 0;
		for (Country country : set)
			if (country.getPibHab() > maxD)
				maxD = country.getPibHab ();
		
		for (Country country : set)
			if (country.nomCountryPIB(maxD) != null)
				System.out.println("Highest average wage : " + country.nomCountryPIB(maxD));
		
		double min = Double.MAX_VALUE;
		for (Country country : set)
			if (country.getPibHab() < min)
				min = country.getPibHab ();
		
		Set <Country> set2 = new HashSet <> ();
		for (Country country : set)
			if (country.nomCountryPIB (min) != null)
				set2.add(new Country (country.getNomCountry().toUpperCase(), country.getNbHabitant(), country.getPibHab()));
			else
				set2.add(country);
		set = set2;
		
		Country.afficher(set);
		
	}
}