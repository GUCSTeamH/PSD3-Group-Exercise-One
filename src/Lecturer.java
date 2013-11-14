import java.util.*;
public class Lecturer extends User {
		//should be done in the constructor
	    //TODO
		ArrayList<Course> courses=new ArrayList<Course>();
//		ArrayList<LinkedList<CourseStudent>> studentsPerCourse=new ArrayList<LinkedList<CourseStudent>>();

		
		public Lecturer(String id,String fname,String lname){
		super(id,fname, lname);
		}
		
		public Lecturer(String id,String fname,String lname, ArrayList<Course> c){
			super(id,fname, lname);
			courses=c;
			//you take all the students that a lecturer teaches- you never address the issue
			//if two or more students are in two courses taught by the same lecturer
			//we don't need to kee this list. we can access students via the list of courses
//			for(int i=0;i<courses.size();i++){
//				studentsPerCourse.add(courses.get(i).getStudents());
//			}
			}
		
		public void addCourse(Course c){
			courses.add(c);
	//		studentsPerCourse.add(c.getStudents());
		}
		public ArrayList<Course> getCourses() {
			return courses;
		}
		public void defineSession(){
			//code for defining session
			return;
		}
}
