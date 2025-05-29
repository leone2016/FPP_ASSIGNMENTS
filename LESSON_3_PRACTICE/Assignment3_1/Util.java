package Assignment3_1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Util {
    public static final String DATE_PATTERN = "MM/dd/yyyy";
    public static String dateAsString(LocalDate d) {
        //DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
        return d.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }
}
