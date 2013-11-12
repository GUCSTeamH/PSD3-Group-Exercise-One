
import java.util.Scanner;

import com.googlecode.jcsv.writer.CSVEntryConverter;
public class FileEntryConverter implements CSVEntryConverter<String>{

    /**
     * @param s the string to be converted in the proper format for outputting them to a .csv file.
     */
 

	@Override
	public String[] convertEntry(String s) {
		String[] columns=new String[s.length()];
//		Scanner scan=new Scanner(s);
//		int i=0;
//		while(scan.hasNext()){
//			columns[i++]=scan.next();
//			
//		}
//		scan.close();
		return columns;
	}
}
