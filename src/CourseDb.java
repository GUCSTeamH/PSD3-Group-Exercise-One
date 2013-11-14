import java.util.HashMap;
import java.util.LinkedList;


public class CourseDb {
	
	private static CourseDb courses=null;
	private HashMap<String,LinkedList<CourseStudent>> listOfCourses=new HashMap<String,LinkedList<CourseStudent>>();
	
	private CourseDb(){}
		
	public static CourseDb getStudentDb(){
		if(courses==null)
			courses=new CourseDb();
		return courses;	
	}
		
	public void addRecord(String s,LinkedList<CourseStudent> students){
		listOfCourses.put(s, students);
		
	}
	
	//when you get the record you can export it in a .csv file
	//or update it accordingly by adding/removing courses
	public LinkedList<CourseStudent> getCourseRecord(String course){
		return listOfCourses.get(course);
	}

}