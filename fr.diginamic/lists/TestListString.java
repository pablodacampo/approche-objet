package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListString {

	public static void main(String[] args) {

		ArrayList<String>cityList = new ArrayList<>();
		
		cityList.add("Nice");
		cityList.add("Carcassonne");
		cityList.add("Narbonne");
		cityList.add("Lyon");
		cityList.add("Foix");
		cityList.add("Pau");
		cityList.add("Marseille");
		cityList.add("Tarbes");		
        
        String ref = cityList.get(0);
        
        for(int i = 0; i < cityList.size(); i++) {
        	String city = cityList.get(i);
        	if(city.length() > ref.length()) {
        		ref = city;
        	}
        }
        
        System.out.println(ref);
        
        for(int i = 0; i < cityList.size(); i++) {
        	cityList.set(i,cityList.get(i).toUpperCase());
        }
        
        System.out.println(cityList);

		Iterator <String> iteratorString = cityList.iterator();
		while (iteratorString.hasNext())
		{
			String temp = iteratorString.next();
			if (temp.charAt(0) == 'N')
				iteratorString.remove();
		}
        
		System.out.println(cityList);
	}

}
