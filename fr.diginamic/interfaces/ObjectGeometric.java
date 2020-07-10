package interfaces;

	/** List the compulsory methods that a geometric object must have
	* @author DIGINAMIC
	*/

	// CONSTRUTOR
	public interface ObjectGeometric {
	
		
	/** Returns the perimeter of a geometric shape
	* @return double
	*/
	double perimeter();
	
	
	/** Returns the surface
	* @return double
	*/
	double surface();
	
	String getType();
	
	}
	

