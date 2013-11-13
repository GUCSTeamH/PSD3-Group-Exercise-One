import java.util.*;
public class Lecturer extends User {
	
		ArrayList<Course> courses=new ArrayList<Course>();
		ArrayList<LinkedList<CourseStudent>> studentsPerCourse=new ArrayList<LinkedList<CourseStudent>>();

		
		public Lecturer(String id,String fname,String lname){
		super(id,fname, lname);
		}
		
		public Lecturer(String id,String fname,String lname, ArrayList<Course> c){
			super(id,fname, lname);
			courses=c;
			for(int i=0;i<courses.size();i++){
				studentsPerCourse.add(courses.get(i).getStudents());
			}
			}
		
		public void addCourse(Course c){
			courses.add(c);
			studentsPerCourse.add(c.getStudents());
		}
		public ArrayList<Course> getCourses() {
			return courses;
		}
		public void defineSession(){
			//code for defining session
			return;
		}
}
