import java.util.*;
import java.text.*;

class DateParser {
	
	public static int getDay(int day, int month, int year){
		Date date= (new GregorianCalendar(year, month, day)).getTime();
		SimpleDateFormat f = new SimpleDateFormat("u");
    	String d=f.format(date);
    	return Integer.parseInt(d)-1;
	}
	
	public static int getWeek(int day, int month, int year){
		Date date= (new GregorianCalendar(year, month, day)).getTime();
		SimpleDateFormat f = new SimpleDateFormat("w");
    	String week=f.format(date);
    	return Integer.parseInt(week);
	}
}