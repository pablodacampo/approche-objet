package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal= Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date= cal.getTime();	

		String str = format.format(date);
		System.out.println(str);
		
		format = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
		System.out.println(format.format(date));
		
		format = new SimpleDateFormat("EEEEE dd MMMMM yyyy", new Locale("ru","RU"));
		System.out.println(format.format(date));
		
		format = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINESE);
		System.out.println(format.format(date));
		
		format = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.GERMAN);
		System.out.println(format.format(date));
		


	}

}
