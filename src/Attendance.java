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
		for (int i = 0; i < absent.size(); i++){
			if (absent.get(i).getuserID().equals(stud.getuserID())){
				if (attendance.equalsIgnoreCase("present")){
					present.add(absent.get(i));
					absent.remove(i);
				}
				else if (attendance.equalsIgnoreCase("mv")){
					mv.add(absent.get(i));
					absent.remove(i);
				}
				return;
			}
		}
		
		/*
		 * Will only reach this far in the method if the user has:
		 * 		(a) altered a students attendance that has previously been changed.
		 *		(b) entered an incorrect student
		 */
		for (int i = 0; i < present.size(); i++){
			if (present.get(i).getuserID().equals(stud.getuserID())){
				if (attendance.equalsIgnoreCase("absent")){
					absent.add(present.get(i));
					present.remove(i);
				}
				else if (attendance.equalsIgnoreCase("mv")){
					mv.add(absent.get(i));
					present.remove(i);
				}
				return;
			}
		}
		
		for (int i = 0; i < mv.size(); i++){
			if (mv.get(i).getuserID().equals(stud.getuserID())){
				if (attendance.equalsIgnoreCase("absent")){
					absent.add(present.get(i));
					mv.remove(i);
				}
				else if (attendance.equalsIgnoreCase("present")){
					present.add(mv.get(i));
					mv.remove(i);
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