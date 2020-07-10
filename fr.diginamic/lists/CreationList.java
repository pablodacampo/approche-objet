package lists;

import java.util.ArrayList;

public class CreationList {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>(100);
		for (int i = 1; i <= 100; i++) {
		numList.add(i);
	    System.out.print(numList.get(i - 1) + " ");
		}
		
        System.out.println("\n");

        // print the size using size() method 
        System.out.println("Size of list = " + numList.size()); 
	}

}
