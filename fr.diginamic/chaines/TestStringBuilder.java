package chaines;

public class TestStringBuilder {

	public static void main(String[] args) {		
		
		long debutA = System.currentTimeMillis();
		
        // Part 1: create a new StringBuilder.
        StringBuilder builder = new StringBuilder();
        // ... Loop and append values.
        for (int i = 0; i <= 100000; i++) {
            builder.append(i);
        }
        
        String result = builder.toString();
        // ... Print result.
        System.out.println(result);

		long finA = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (finA - debutA));

        // Part 2: create a new Concatenation.
		String str = "";

		long debutB = System.currentTimeMillis();
        // ... Loop and append values.
        for (int i = 0; i <= 100000; i++) {
            str = str + i;
        }

		long finB = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (finB - debutB));


	}

}
