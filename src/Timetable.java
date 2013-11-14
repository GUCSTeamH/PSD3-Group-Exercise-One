import java.util.ArrayList;

// Singleton class cause there should only be one timetable
public class Timetable {
	
	private static Timetable timetable = null;
	// Lists to store weeks in each semester (has days which have sessions)
	private int semOneStartWeek;
	private int semTwoStartWeek;
	private ArrayList<Week> semesterOne;
	private ArrayList<Week> semesterTwo;
	
	private Timetable(){
		// Each semester has 12 weeks I think?
		semesterOne = new ArrayList<Week>(12);
		semesterTwo = new ArrayList<Week>(12);
		// add all the empty weeks for the timetable
		for (int i=0;i<12;i++){
			semesterOne.add(new Week());
			semesterTwo.add(new Week());
		}
		// if semester start weeks are given, assume sem one starts in the 29th week of the year and sem 2 starts in the 2nd week
		semOneStartWeek = 39;
		semTwoStartWeek = 2;
	}
	
	// constructor for if semester start dates are given
	private Timetable(String semOne, String semTwo){
		// Each semester has 12 weeks I think?
		semesterOne = new ArrayList<Week>(12);
		semesterTwo = new ArrayList<Week>(12);
		// add all the empty weeks for the timetable
		for (int i=0;i<12;i++){
			semesterOne.add(new Week());
			semesterTwo.add(new Week());
		}
		// if semester start weeks are given, assume sem one starts in the 29th week of the year and sem 2 starts in the 2nd week
		String[] one = semOne.split("/");
		String[] two = semTwo.split("/");
		semOneStartWeek = DateParser.getWeek(Integer.parseInt(one[0]), Integer.parseInt(one[1]), Integer.parseInt(one[2]));
		semTwoStartWeek = DateParser.getWeek(Integer.parseInt(two[0]), Integer.parseInt(two[1]), Integer.parseInt(two[2]));
	}
	
	public static Timetable getTimetable(){
		if (timetable == null){
			timetable = new Timetable();
		}
		return timetable;
	}
	
	public ArrayList<Week> getSemester(int semester){
		return (semester==1 ? semesterOne : semesterTwo);
	}
	
	public Week getWeek(int semester, int week){
		return (semester==1 ? semesterOne.get(week) : semesterTwo.get(week));
	}
	
	public int getSemOneWeek(){
		return semOneStartWeek;
	}
	
	public int getSemTwoWeek(){
		return semTwoStartWeek;
	}
}