package Assignment3_2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Util {
	public static String dateAsString(LocalDate d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}
	
}
