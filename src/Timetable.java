import java.util.ArrayList;

// Singleton class cause there should only be one timetable
public class Timetable {
	
	private static Timetable timetable = null;
	// Lists to store weeks in each semester (has days which have sessions)
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
	}
	
	public static getTimetable(){
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
	
}