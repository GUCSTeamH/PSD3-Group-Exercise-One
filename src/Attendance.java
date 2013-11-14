import java.util.ArrayList;

public class Attendance{
	
	private ArrayList<Student> absent;
	private ArrayList<Student> present;
	private ArrayList<Student> mv;
	
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