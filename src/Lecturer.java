import java.util.*;
public class Lecturer extends User {
		ArrayList<Course> courses;
		ArrayList<ArrayList<Student>> studentsPerCourse;
		public Lecturer(String name,String id){
		super(name,id);
		courses=new ArrayList<Course>();
		studentsPerCourse=new ArrayList<ArrayList<Student>>();
		}
		public ArrayList<Course> getCourses() {
			return courses;
		}
		public void defineSession(){
			return;
		}
}
