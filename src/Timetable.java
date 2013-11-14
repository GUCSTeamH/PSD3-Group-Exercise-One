import java.util.ArrayList;

public class Timetable {
	private ArrayList<Week> weeks;
	
	public Timetable(){
		weeks = new ArrayList<Week>();
	}
	
	
	public Week getWeek(int week){
		return weeks.get(week);
	}
	//TODO
	//you never set/add a week to weeks.
	
}