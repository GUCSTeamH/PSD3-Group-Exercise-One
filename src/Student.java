import java.util.LinkedList;


public class Student {
	//no name, barcode of student card?
	public String studentID;
	private LinkedList<StudentCourse> coursesTaken;
	
	
	public Student(String id){
		studentID=id;
		coursesTaken=new LinkedList<StudentCourse>();
	}
	
	public void addCourseRecord(StudentCourse c){
		coursesTaken.add(c);
	}
	
	public LinkedList<StudentCourse> getCourses(){
		return coursesTaken;
	}

}
