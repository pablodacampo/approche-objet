package recensement;

public class Departement {

	/** code : String */
	private String code;

	/** population : int */
	private int population;

	/**
	 * Constructeur
	 * 
	 * @param code
	 *            code
	 */
	public Departement(String code) {
		super();
		this.code = code;
	}

	public String toString() {
		return "Departement n°"+code + " with a population of " + population + " inhabitants.";
	}

	/**
	 * Getter
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getter
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Setter
	 * 
	 * @param population
	 *            the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

}
