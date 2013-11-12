
public class StudentCourse {
	
	private String course;
	private String courseID;
	private int coursework, exam, total;
	
	
	public StudentCourse(String c,String id, int cw,int e,int t){
		course=c;
		courseID=id;
		coursework=cw;
		exam=e;
		total=t;
	}
	
	public String toString(){
		return course+", "+courseID+", "+coursework+", "+exam+", "+total;
	}

}
