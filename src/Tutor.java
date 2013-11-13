import java.util.ArrayList;

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

}