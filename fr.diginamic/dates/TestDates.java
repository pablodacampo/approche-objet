package dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

		public static void main(String[] args) {
			
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println(format.format(date));
		
			date = new Date(116,4,19,23,59,30);
			
			format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			System.out.println(format.format(date));
			
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
			System.out.println(format1.format(new Date()));



	}

}
