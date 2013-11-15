import java.io.IOException;
import java.util.Scanner;


public class Main {
public static void tutorlogin(){
	
	MenuHeader();
	System.out.println("Please select session: ");
	System.out.println("    (a) Mock Session");
	System.out.print("Enter : ");
	Scanner scanner = new Scanner(System.in);
	String option=scanner.next();
	while(option.compareTo("a")!=0){
		System.out.println("!!! Invalid option !!! Please try again.");
		MenuHeader();
		System.out.println("Please select session: ");
		System.out.println("    (a) Mock Session");
		scanner = new Scanner(System.in);
		option=scanner.next();
	}
	System.out.println("Students in session: ");
	System.out.println("1. Pikachu");
	System.out.println("2. Charmander");
	System.out.println("Enter (1 or 2):  ");
	 scanner = new Scanner(System.in);
	int opt=scanner.nextInt();
		while(opt!=1 && opt!=2){
			System.out.println("!!! Wrong option !!! Please try again.");
			System.out.println("");
			System.out.println("Students in session: ");
			System.out.println("1. Pikachu");
			System.out.println("2. Charmander");
			System.out.println("Enter (1 or 2):  ");
			scanner = new Scanner(System.in);
			opt=scanner.nextInt();}
	System.out.print("Would you like to enter attendance manualy or upload a csv file? (manual or csv): ");
	scanner = new Scanner(System.in);
	option=scanner.next();
	System.out.print("");
	if (option.compareTo("manual")==0){
	if (opt==1){
		System.out.println("Pikachu is present.");
	}
	else
		System.out.println("Charmander is absent");
	}
	else{
		System.out.println("Enter csv file : at1.csv");
		System.out.println("Attendance recorded");
		
	}
	System.out.println("Goodbye.");
	return;}
public static void adminlogin(){
	MenuHeader();
	System.out.println(" 1. Export attendance records for a course ");
	System.out.println(" 2. Export student information ");
	System.out.print("Enter (1 or 2):  ");
	Scanner scanner = new Scanner(System.in);
	int option=scanner.nextInt();
	System.out.println("");
	while(option!=1 && option!=2){
		System.out.println("!!! Wrong option !!! Please try again.");
		MenuHeader();
		System.out.println(" 1. Export attendance records for a course ");
		System.out.println(" 2. Export student information ");
		System.out.print("Enter (1 or 2):  ");
		scanner = new Scanner(System.in);
		option=scanner.nextInt();
		System.out.println("");}
	if (option==1){
		Exporter x1=null;
		try{
			x1=new Exporter("course.csv","Course,ID number, Coursework, Exam, Total",false);
			}
		catch(IOException e){
			System.out.println("Error writing to the specified file");
			System.exit(0);
		}
		StudentDb students=StudentDb.getStudentDb();
		Student s1=new Student("1234", "12345678536014", "john", "smith");
		StudentCourse sc1=new StudentCourse("PSD3", "1", 19, 70, 89);
		StudentCourse sc2=new StudentCourse("ADS3", "2", 19, 70, 89);
		StudentCourse sc3=new StudentCourse("PS3", "3", 19, 70, 89);
		Course c1=new Course("PSD3", "1");
		Course c2=new Course("ADS3", "2");
		Course c3=new Course("PS3", "3");
		s1.getCourseMarks().add(sc1);
		s1.getCourseMarks().add(sc2);
		s1.getCourseMarks().add(sc3);
		s1.addCourseRecord(c1);
		s1.addCourseRecord(c2);
		s1.addCourseRecord(c3);
		students.addRecord(s1.getGUID(), s1.getCourseMarks());
		for(StudentCourse c:students.getStudentRecord("1234")){
			x1.export(c.toString());
		}
		System.out.println("File exported.");
		System.out.println("Goodbye.");
	}
	else{
		Exporter x2=null;
		try{
		x2=new Exporter("student.csv","First Name,Surname, ID number, Assignment: Lab1, Assignment: Lab2",false);
		}
		catch(IOException e){
			System.out.println("Error writing to the specified file");
			System.exit(0);
		}


		

		CourseDb courses=CourseDb.getStudentDb();
		Course course1=new Course("PSD2");
		CourseStudent cs1=new CourseStudent("Terry","T","1234545",12,13);
		CourseStudent cs2=new CourseStudent("Merry","M","1234545",12,13);
		course1.addStudent(cs1);
		course1.addStudent(cs2);
		courses.addRecord(course1.name, course1.getStudents());
		for(CourseStudent cs:courses.getCourseRecord(course1.name)){
			x2.export(cs.toString());
		}
		if (option==1){System.out.println("Not yet implemented");}
		else{System.out.println("Not yet implemented");}
		System.out.println("File exported.");
		System.out.println("Goodbye.");
	
	}
		
		
		
		
	}
	
public static void header(){
	System.out.println("::::::::::::::::::::::::::::::");
for(int i=0;i<3;i++){
	System.out.println("::                          ::");
}
	System.out.println("::::    Group Exercise    ::::");
	for(int i=0;i<3;i++){
		System.out.println("::                          ::");
	}
	System.out.println("::::::::::::::::::::::::::::::");

}
public static void loginHeader(){
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println(">           Log In           >");
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("");
}
public static void MenuHeader(){
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println("<            Menu            <");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
}
public static void CustomHeader(String msg){
	System.out.println("------------------------------");
	System.out.println("-  "+msg);
	System.out.println("------------------------------");
	System.out.println("");
}
	public static void main(String args[]) throws IOException {
		header();
		loginHeader();
		
		System.out.println("Welcome. Please enter your log in details below.");
		System.out.println("");
		System.out.print("Username: ");
		Scanner scanner = new Scanner(System.in);
		String username=scanner.next();
		System.out.println("");
		System.out.print("Password: ");
		String password=scanner.next();
		System.out.println("");
		System.out.println(">>> Entered:"+username+" "+ password+" <<<");

		Lecturer user= new Lecturer(username, "Harry", "Potter");
		while (username.compareTo(password)!=0){
				System.out.println("invalid login");
				System.out.print("Username: ");
				scanner = new Scanner(System.in);
				username=scanner.next();
				System.out.println("");
				System.out.print("Password: ");
				password=scanner.next();
				System.out.println("");
		}
		System.out.println("                                 (authentication successful)");
		if(username.compareTo("tutor")==0){tutorlogin();}
		else if (username.compareTo("lecturer")==0){System.out.println("Coming soon");}
		else if(username.compareTo("admin")==0){adminlogin();}
		else if(username.compareTo("student")==0){ System.out.println("Coming soon");}
		else {System.out.println("invalid login");}
	
	

		
	}
}
