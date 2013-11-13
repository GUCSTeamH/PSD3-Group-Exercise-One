import java.util.*;

public class Lecturer extends User {
	
		ArrayList<Course> courses = new ArrayList<Course>();
		/* dont need this array, its repeated data */

		
		public Lecturer(String id,String fname,String lname){
			super(id,fname, lname);
		}
		
		public Lecturer(String id,String fname,String lname, ArrayList<Course> c){
			super(id,fname, lname);
			courses = c;
		}
		
		public void addCourse(Course c){
			courses.add(c);
			studentsPerCourse.add(c.getStudents());
		}
		
		public ArrayList<Course> getCourses() {
			return courses;
		}
		
		/*only admins can define sessions, not needed*/
}
