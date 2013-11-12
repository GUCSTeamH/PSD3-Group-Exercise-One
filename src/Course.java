import java.util.LinkedList;


public class Course {
	
	public String name;
	private LinkedList<CourseStudent> students;
	
	public Course(String n){
		name=n;
		students=new LinkedList<CourseStudent>();
		
	}

	public void addStudent(CourseStudent s){
		students.add(s);
	}
	
	public LinkedList<CourseStudent> getStudents(){
		return students;
	}
}
