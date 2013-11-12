
public class CourseStudent {
	private String firstName, surname, idNumber;
	private int assignment1,assignment2;
	
	
	public CourseStudent(String fn, String sn, String id, int a1, int a2){
		firstName=fn;
		surname=sn;
		idNumber=id;
		assignment1=a1;
		assignment2=a2;
	}

	
	public String toString(){
		return firstName+", "+surname+", "+idNumber+", "+assignment1+", "+assignment2;
	}
}
