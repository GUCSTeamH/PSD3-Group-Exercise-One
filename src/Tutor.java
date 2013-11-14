import java.util.*;
import java.io.FileReader;

public class Tutor extends User {
	
	private ArrayList <Session> sessions;
	private boolean student;

	public Tutor(String id, String fname, String sname){
		super(id, fname, sname);
		sessions = new ArrayList<Session>();
		student = false;
	}
	
	public Tutor(String id, String fname, String sname, ArrayList<Session> sess){
		super(id, fname, sname);
		sessions = sess;
		student = false;
	}
	
	public ArrayList<Session> getSessions(){
		return sessions;
	}
	
	public boolean isStudent(){
		return student;
	}
	
	public void setStudent(boolean bool){
		student = bool;
	}
	
	// adds tutor if there is no conflict
	public void addTutorSession(Session s){
		if (checkConflict(s)){
			sessions.add(s);
		}
	}
	
	// Checks to see if tutor is available at time
	public boolean checkConflict(Session s){
		/*for (Session sess : sessions){
			//if there is a clash:
				//return false
		}
		if (student){
			// for Session in student timetable
				// if there is a clash
					// return false
		}*/
		return true;
	}
	
	
	public void markAttendanceCSV(String filename, Session s){
		try{
			FileReader reader = new FileReader(filename);
			Scanner in = new Scanner(reader);
			while(in.hasNext()){
				String line = in.nextLine();
				String[] data = line.split(",");
				for(Student stud: s.getListStudents()){
					if (stud.getuserID()==data[0]){
						s.getAttendanceList().changeAttendance(stud, "present");
						break;
					}
				}
			}
		}
		catch (Exception e){
			System.out.println("file read failed");
			return;
		}

	}
	
	public void markAttendanceManually(Session s){
		Scanner scan;
		
		for (Student stud : s.getListStudents()){
			System.out.print(stud.getuserID() + ":/t");
			scan = new Scanner(System.in);
			s.getAttendanceList().changeAttendance(stud, scan.next());
			System.out.print("/n");
		}
		
	}
	
	public void changeSingleAttendance(Session s, Student stud){
		Scanner scan = new Scanner(System.in);
		s.getAttendanceList().changeAttendance(stud, scan.next());
	}

}