package testexceptions;

import java.lang.reflect.Field;

public class ReflectionUtils {

			public static void afficherAttributs(Object obj) throws IllegalArgumentException, IllegalAccessException, ReflectionException {

				// We start by retrieving the class of the object passed as a parameter.
				// the class provides all the information on the structure of an object.

				Class<?> classe = obj.getClass();

				// On this class we get the array of instance variables

				Field[] fields = classe.getDeclaredFields();

				// We make a loop on this array

				for (Field field : fields) {

					// We force access to the attribute from an external class.
					// A bit like forcing the attribute into public readability.

					field.setAccessible(true);

					// Display

					System.out.println(
							"La valeur de l'attribut " + field.getName() + " est " + field.get(obj).toString());
				}
			}
		

	}

}
