import java.util.LinkedList;


public class Course {
	
	public String courseID;
	public String name;
	private LinkedList<CourseStudent> students;
	
	public Course(String n, String id){
		name = n;
		courseID = id;
		students=new LinkedList<CourseStudent>();
		
	}

	public Course(String n){
		name = n;
		students=new LinkedList<CourseStudent>();
		name = "";
	}
	public void addStudent(CourseStudent s){
		students.add(s);
	}
	
	public LinkedList<CourseStudent> getStudents(){
		return students;
	}
	
	public void setCourseID(String courseID){
		this.courseID = courseID;
	}
	
	public String getCourseID(){
		return courseID;
	}
	
	public String getCourseName(){
		return name;
	}
	
	public void setCourseName(String n){
		this.name = n;
	}
}
