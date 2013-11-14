import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws IOException {
		System.out.println("Welcome dear user. Please enter your username and password");
		System.out.println("username: ");
		Scanner scanner = new Scanner(System.in);
		String username=scanner.next();
		System.out.println("password: ");
		String password=scanner.next();
		System.out.println(username+" "+ password);

		Lecturer user= new Lecturer(username, "Harry", "Potter");
		while (!user.authenticate(username, password)){
				System.out.println("invalid login");
				System.out.println("username: ");
				scanner = new Scanner(System.in);
				username=scanner.next();
				System.out.println("password: ");
				password=scanner.next();
		}
		System.out.println("authentication successful");
		Exporter x1=null;
		Exporter x2=null;
		try{
		x1=new Exporter("file1.csv","Course,ID number, Coursework, Exam, Total",false);
		x2=new Exporter("file2.csv","First Name,Surname, ID number, Assignment: Lab1, Assignment: Lab2",false);

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

	}
}
