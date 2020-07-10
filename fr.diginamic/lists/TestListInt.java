package lists;

import java.util.ArrayList;
import java.util.Collections;

public class TestListInt {

	public static void main(String[] args) {

		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(-1);
		testList.add(5);
		testList.add(7);
		testList.add(-2);
		testList.add(4);
		testList.add(8);
		testList.add(5);

		System.out.println(testList);
		System.out.println(testList.size());
		System.out.println(Collections.max(testList));

		testList.remove(Collections.min(testList));

		System.out.println(Collections.min(testList));

		for (int i = 0; i < testList.size(); i++) {

			int num = testList.get(i);

			if (num < 0) {

				num = num * -1;
				testList.set(i, num);

			}
		}

		for (Integer num : testList) {
			System.out.println(num);
		}

	}

}
