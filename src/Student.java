import java.util.LinkedList;


public class Student extends User {
	public String guID;
	//no name, barcode of student card?
		//guid are for students, i assumed userid in userclass would be barcode as everyone has a card with a barcode number on it (Which is also what the attendance scanner uses)
	
	private LinkedList<StudentCourse> coursesTaken;
	
	
	public Student(String guID, String, userID, String forename, String surname){
		super(userID, forename, surname);
		this.guID = guID;
		coursesTaken=new LinkedList<StudentCourse>();
	}
	
	public void setGUID(String guID){
		this.guID = guID;
	}
	
	public String getGUID(){
		return guID;
	}
	
	public void addCourseRecord(StudentCourse c){
		coursesTaken.add(c);
	}
	
	public LinkedList<StudentCourse> getCourses(){
		return coursesTaken;
	}

}
