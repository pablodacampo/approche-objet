package sets;

import java.util.Set;

public class Country {
	
	private String nomCountry;
	private int nbHabitant;
	private double pibHab;
	
	// CONSTRUCTOR
	
	public Country(String nomCountry, int nbHabitant, double pibHab){
		super();
		this.nomCountry = nomCountry;
		this.nbHabitant = nbHabitant;
		this.pibHab = pibHab;
	}

	public String nomCountryPop (int nb) {
		if (nb == nbHabitant)
			return nomCountry;
		return null;
	}
	
	public String nomCountryPIB (double nb) {
		if (nb == pibHab)
			return nomCountry;
		return null;
	}
	
	public String toString () {
		
		return (nomCountry + " has " + nbHabitant + " inhabitants, & $" + pibHab + " is the average wage.");
	}
	
	public static void afficher (Set <Country> s) {
	
		for (Country nb : s)
			System.out.println(nb + ", ");		
	}

	// GETTERS & SETTERS
	
	public String getNomCountry() {
		return nomCountry;
	}

	public void setNomCountry(String nomCountry) {
		this.nomCountry = nomCountry;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public double getPibHab() {
		return pibHab;
	}

	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}
}