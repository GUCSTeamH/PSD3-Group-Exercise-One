
public class Admin extends User {
	
	public Admin(String userID, String forename, String surname){
		super(userID, forename, surname);
	}
	
	/*
	 * Method to add a session to the timetable
	 */
	public void addSession(int semester, int day, boolean r,boolean c,String l, String crs, int bh, int bm, int eh, int em, int[] y, int cap){
		Session s = new Session(boolean r,boolean c,String l, String crs, int bh, int bm, int eh, int em, int[] y, int cap);
		if (r){
			ArrayList<Week> sem = Timetable.getTimetable().getSemester();
			for (Week w: sem){
				w..getDay(day).addSession(s);
			}
		}// ignore non repeating sessions right now. can add in later
	}
}