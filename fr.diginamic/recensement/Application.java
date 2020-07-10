package recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {

		List<Ville> villes = new ArrayList<Ville>();
		
		List<String> lignes = null;
		try {
			File file = new File("C:/Users/PabTemp/Projects/Diginamic/04. Java/Object Oriented/recensement population 2016.csv");
			lignes = FileUtils.readLines(file, "UTF-8");
			
			lignes.remove(0);
			
			for (String ligne: lignes){
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				int populationTotale = Integer.parseInt(morceaux[7].replace(" ", "").trim());
				
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
				
				villes.add(ville);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		// Search and display of Montpellier
		System.out.println("---------------------------------------------------");
		for (int i=0; i<villes.size(); i++){
			if (villes.get(i).getNomRegion().equals("Montpellier")){
				System.out.println(villes.get(i));
				break;
			}
			
		}
		
		// Search and display of the population of Hérault
		System.out.println("---------------------------------------------------");
		int popDept = 0;
		for (int i=0; i<villes.size(); i++){
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34")){
				popDept += v.getPopulation();
			}
		}
		System.out.println("The population of Hérault is :"+popDept);
		
		// Search and display of the smallest town in Hérault
		System.out.println("---------------------------------------------------");
		int popMin = Integer.MAX_VALUE;
		Ville villeMin = null;
		for (int i=0; i<villes.size(); i++){
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34") && v.getPopulation() < popMin){
				popMin = v.getPopulation();
				villeMin = v;
			}
		}
		System.out.println("The smallest town in the department is :"+villeMin);
		
		// Supply of a list containing only the cities of the department 34
		List<Ville> villesDept = new ArrayList<>();
		for (int i=0; i<villes.size(); i++){
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34")){
				villesDept.add(v);
			}
		}
		
		// Display the 10 largest cities of the department
		System.out.println("---------------------------------------------------");
		System.out.println("The 10 largest cities of the department are : ");
		Collections.sort(villesDept, new PlusGrandeVilleComparator());
		for (int i=0; i<10; i++){
			System.out.println(villesDept.get(i));
		}
		
		// Display the 10 smallest cities of the department
		System.out.println("----------------------------------------------------");
		System.out.println("The 10 smallest cities of the department are : ");
		Collections.sort(villesDept, new PlusPetiteVilleComparator());
		for (int i=0; i<10; i++){
			System.out.println(villesDept.get(i));
		}
		
		// Display the population of the Occitanie region (code 76)
		System.out.println("---------------------------------------------------");
		int popRegion = 0;
		for (int i=0; i<villes.size(); i++){
			Ville v = villes.get(i);
			if (v.getCodeRegion().equals("76")){
				popRegion += v.getPopulation();
			}
		}
		System.out.println("The population of the Occitanie region is :"+popRegion);
		
		// Display the 10 most populous cities in the Occitanie region (code 76)
		// Supply of a list containing only the cities of the Occitanie region
		List<Ville> villesRegionsOcc = new ArrayList<>();
		for (int i=0; i<villes.size(); i++){
			Ville v = villes.get(i);
			if (v.getCodeRegion().equals("76")){
				villesRegionsOcc.add(v);
			}
		}
				
		// Display the 10 largest cities of the region
		System.out.println("---------------------------------------------------");
		System.out.println("The 10 largest cities of the region are : ");
		Collections.sort(villesRegionsOcc, new PlusGrandeVilleComparator());
		for (int i=0; i<10; i++){
			System.out.println(villesRegionsOcc.get(i));
		}
		
		// Display the most populated department of the Occitanie region
		System.out.println("---------------------------------------------------");
		// System.out.println("The most populated department of the Occitanie region is : ");
		
		HashMap<String, Departement> mapDepts = new HashMap<>();
		for (int i=0; i<villes.size(); i++){
			Ville v = villes.get(i);
			
			// We are looking for all cities in the region
			if (v.getCodeRegion().equals("76")){
				
				// As soon as we find a city in the region, we recover its department
				String codeDept = v.getCodeDepartement();
				
				// Then we search for the department stored in the HashMap with this code
				Departement dept = mapDepts.get(codeDept);
				
				// If the previous department does not exist, we create and store it in the map
				if (dept==null){
					dept = new Departement(v.getCodeDepartement());
					mapDepts.put(v.getCodeDepartement(), dept);
				}
				
				// Then we add the population of the city to the population of the department
				dept.setPopulation(dept.getPopulation()+v.getPopulation());
				
			}
		}
		
		// Once the creation of the Map is complete, we retrieve all the departments and we sort them.
		ArrayList<Departement> listeDepts = new ArrayList<>();
		listeDepts.addAll(mapDepts.values());
		
		Collections.sort(listeDepts, new DepartementComparateur(false));
		
		System.out.println("The most populated department of the Occitanie region is : "+ listeDepts.get(0));
		
	}
}