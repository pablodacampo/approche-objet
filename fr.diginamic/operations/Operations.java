package operations;

public class Operations {
	
	public static double calculate(double a, double b, char c) {
	  	if( c=='+' ) return a+b;
	  	else if( c=='-' ) return a-b;
	  	else if( c=='/' ) return a/b;
	  	else if( c=='*' ) return a*b;
	  	return(0);		  
	  }
}
