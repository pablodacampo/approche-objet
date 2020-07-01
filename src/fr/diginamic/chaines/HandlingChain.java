package fr.diginamic.chaines;

// Manipulation is how things are Handled/Altered 'Manipulated' !

public class HandlingChain {
	
	public static void main(String[] args) {
	
	String chain = "Durand; Marcel; 2 523.5";
	
	System.out.println("First character of chain is : " + chain.charAt(0));
	
	System.out.println("Length of chain is : " + chain.length());
	
	System.out.println("First ';' in the chain is : " + chain.indexOf(';'));
	
	System.out.println("Last name is : " + chain.substring (0, chain.indexOf(';')));
	
	System.out.println("Last name in upper case is: " + chain.substring(0, chain.indexOf(';')).toUpperCase ());
	
	System.out.println("Last name in lower case is : " + chain.substring (0, chain.indexOf(';')).toLowerCase ());
	
	String[] strArr = chain.split(";");
	
		System.out.println(strArr);
		
	// Salarie ... TBC
	
	}

}
