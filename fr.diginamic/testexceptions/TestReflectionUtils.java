package testexceptions;

import sets.Country;

public class TestReflectionUtils {

	public static void main(String[] args) {

		Country country = new Country("France", 66, 43500);
		try {
			ReflectionUtils.afficherAttributs(country);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}

	}

}
