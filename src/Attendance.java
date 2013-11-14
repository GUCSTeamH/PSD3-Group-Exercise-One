import java.util.ArrayList;

public class Attendance{
	
	private ArrayList<Student> absent;
	private ArrayList<Student> present;
	private ArrayList<Student> mv;
	
	// Initially assumed to be absent
	public Attendance(Session s){
		absent = s.getListStudents();
		present = new ArrayList<Student>();
		mv = new ArrayList<Student>();
	}
	
	public ArrayList<Student> getAbsent(){
		return absent;
	}
	
	public ArrayList<Student> getPresent(){
		return present;
	}
	
	public ArrayList<Student> getMV(){
		return mv;
	}
	
	// Moves students from absent list if attendance changes.
	public void changeAttendance(Student stud, String attendance){
		// Checks in the absent list first. (Most likely scenario)
		for (int i = 0; i < getAbsent().size(); i++){
			if (getAbsent().get(i).getuserID().equals(stud.getuserID())){
				if (attendance.equalsIgnoreCase("present")){
					getPresent().add(getAbsent().get(i));
					getAbsent().remove(i);
				}
				else if (attendance.equalsIgnoreCase("mv")){
					getMV().add(getAbsent().get(i));
					getAbsent().remove(i);
				}
				return;
			}
		}
		
		/*
		 * Will only reach this far in the method if the user has:
		 * 		(a) altered a students attendance that has previously been changed.
		 *		(b) entered an incorrect student
		 */
		for (int i = 0; i < getPresent().size(); i++){
			if (getPresent().get(i).getuserID().equals(stud.getuserID())){
				if (attendance.equalsIgnoreCase("absent")){
					getAbsent().add(getPresent().get(i));
					getPresent().remove(i);
				}
				else if (attendance.equalsIgnoreCase("mv")){
					getMV().add(getAbsent().get(i));
					getPresent().remove(i);
				}
				return;
			}
		}
		
		for (int i = 0; i < getMV().size(); i++){
			if (getMV().get(i).getuserID().equals(stud.getuserID())){
				if (attendance.equalsIgnoreCase("absent")){
					getAbsent().add(getPresent().get(i));
					getMV().remove(i);
				}
				else if (attendance.equalsIgnoreCase("present")){
					getPresent().add(getMV().get(i));
					getMV().remove(i);
				}
				return;
			}
		}
	}
	
	public String toString(){
		String result = "";
		for (Student s : absent){
			result += (s.getuserID() + " absent/n");
		}
		
		for (Student s : present){
			result += (s.getuserID() + " present/n");
		}
		
		for (Student s : mv){
			result += (s.getuserID() + " mv/n");
		}
		
		return result;
	}
	
}