package lists;

public class Ville {

	String nomVille;
	int nbHabitant;

	// CONSTRUCTOR
	
	public Ville(String nomVille, int nbHabitant)
	{
		super();
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
	}

	public String toString() {
		return (nomVille + ", has " + nbHabitant + " inhabitants");
	}

	// GETTERS & SETTERS

	public String nomVille(int nb) {
		if (nb == nbHabitant)
			return nomVille;

		return null;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
}
