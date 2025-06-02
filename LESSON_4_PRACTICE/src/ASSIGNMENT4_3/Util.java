package ASSIGNMENT4_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
    public static final String DATE_PATTERN = "MM/dd/yyyy";
    public static String dateAsString(LocalDate d) {
        //DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
        return d.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }
}
