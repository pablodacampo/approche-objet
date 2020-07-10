package lists;

import java.util.ArrayList;
import java.util.List;

public class FusionList {
	
	public static void main(String args[]) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
			
		List<String>list2 = new ArrayList<String>();
			list2.add("White");
			list2.add("Blue");
			list2.add("Orange");
			
		List<String>list3 = new ArrayList<String>();
			for (int i = 0; i < list1.size(); i++) {		
				String val1 = list1.get(i);
			list3.add(val1);
			}
			for (int i = 0; i < list2.size(); i++) {		
				String val2 = list2.get(i);
			list3.add(val2);
			}
			
	        System.out.println(list3);
	}

} 
