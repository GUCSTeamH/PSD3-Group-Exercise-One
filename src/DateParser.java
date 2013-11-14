import java.util.*;
import java.text.*;

class DateParser {
	
	public static getDay(int day, int month, int year){
		Date date= (new GregorianCalendar(year, month, dd)).getTime();
		SimpleDateFormat f = new SimpleDateFormat("u");
    	String day=f.format(date);
    	return u-1;
	}		
}