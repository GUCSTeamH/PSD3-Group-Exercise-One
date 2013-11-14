import java.util.LinkedList;


public class Student extends User {
	
	private String email;
	private int year;
	private LinkedList<LabSession> labGroups;
	public String guID;
	//no name, barcode of student card?
		//guid are for students, i assumed userid in userclass would be barcode as everyone has a card with a barcode number on it (Which is also what the attendance scanner uses)
	
	private LinkedList<StudentCourse> courseMarks;
	private LinkedList<Course> coursesTaken;
	
	
	public Student(String guID, String userID, String forename, String surname){
		super(userID, forename, surname);
		this.guID = guID;
		coursesTaken=new LinkedList<Course>();
		courseMarks=new LinkedList<StudentCourse>();
	}
	
	public Student (String guID, String id,String fn, String ln, String mail,int y, LinkedList<StudentCourse> sc, LinkedList<Course> c, LinkedList<LabSession> lab){
		super(id, fn, ln);
		this.guID=guID;
		year=y;
		email=mail;
		coursesTaken=c;
		labGroups=lab;
		courseMarks=sc;
	}
	
	public void setGUID(String guID){
		this.guID = guID;
	}
	
	public String getGUID(){
		return guID;
	}
	
	public void addCourseRecord(Course c){
		coursesTaken.add(c);
	}
	
	public LinkedList<Course> getCourses(){
		return coursesTaken;
	}


	public int getYear(){
		return year;
	}
	
	public void setYear(int y){
		year=y;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String mail){
		email=mail;
	}
	
	public LinkedList<LabSession> getLabSessions(){
		return labGroups;
	}
	
	public void setLabSession(LinkedList<LabSession> labs){
		labGroups=labs;
	}
	
	public void addLab(LabSession lab){
		labGroups.add(lab);
	}
	
	public LinkedList<StudentCourse> getCourseMarks(){
		return courseMarks;
	}
	
	
}
