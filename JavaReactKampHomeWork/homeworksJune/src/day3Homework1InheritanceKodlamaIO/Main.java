package day3Homework1InheritanceKodlamaIO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName ( "Aslan");
		instructor1.setLastName ( "Demir");
		instructor1.setAge( 25);
		instructor1.setEMail ( "example@gmail.com");
		instructor1.setInstructorId(1);
		instructor1.setCourseGiven ( "Java & React");
				
		Instructor instructor2 = new Instructor(2, "Kemal", " Faruk", 36, "kemalf@ffa.com", 2, "Flutter");				
		Instructor instructor3 = new Instructor(3, "Kemal", " Faruk", 36, "kemalf@ffa.com", 3, "Flutter");
		Student student1 = new Student(4, "Arda", "Önder", 22, "onder@gmail.com", 1, "Java & React");
		Student student2 = new Student(5, "Kaan", "Kara" ,28 ,"example2@gmail.com", 2, "Flutter");
		Student student3 = new Student(6, "Kaan", "Kara" ,28 ,"example2@gmail.com", 3, "Flutter");
		  
		User[] users = new User[] {instructor1, instructor2, student1, student2};
		Instructor[] instructors = new Instructor[] {instructor1, instructor2}; //,instructor3};
		Student[] students = new Student[] {student1, student2};
		UserManager userManager = new UserManager();
		userManager.list(users);
		InstructorManager insManager = new InstructorManager();
		insManager.list(instructors);
		StudentManager studManager = new StudentManager();
		studManager.list(students);
		
		insManager.dropCourse(instructor3);
		System.out.println(instructor3.getCourseGiven());
		insManager.addJavaCourse(instructor3);
		System.out.println("Yeni hocamiz " + instructor3.getFirstName() + " kursa basladi : " + instructor3.getCourseGiven());
		insManager.dropJavaCourse(instructor3);
		System.out.println(instructor3.getCourseGiven());
		insManager.addFlutterCourse(instructor3);
		System.out.println("Yeni hocamiz " + instructor3.getFirstName() + " kursa basladi : " + instructor3.getCourseGiven());
		insManager.dropFlutterCourse(instructor3);
		System.out.println(instructor3.getCourseGiven());
		insManager.addJavaCourse(instructor3);
		System.out.println("Yeni hocamiz " + instructor3.getFirstName() + " kursa basladi : " + instructor3.getCourseGiven());
		System.out.println(instructor3.getFirstName() + " su an " + instructor3.getCourseGiven() + " kursunda gorevli");
		
		studManager.dropCourse(student3);
		System.out.println(student3.getCourseTaken());
		studManager.addJavaCourse(student3);
		System.out.println("Yeni ogrencimiz " + student3.getFirstName() + " kursa hosgeldin : " + student3.getCourseTaken());
		studManager.dropJavaCourse(student3);
		System.out.println(student3.getCourseTaken());
		studManager.addFlutterCourse(student3);
		System.out.println("Yeni ogrencimiz " + student3.getFirstName() + " kursa hosgeldin : " + student3.getCourseTaken());
		studManager.dropFlutterCourse(student3);
		System.out.println(student3.getCourseTaken());
		studManager.addJavaCourse(student3);
		System.out.println("Yeni ogrencimiz " + student3.getFirstName() + " kursa hosgeldin : " + student3.getCourseTaken());
		System.out.println(student3.getFirstName() + " su an " + student3.getCourseTaken() + " kursuna basladi");

		
		
		  
		  
		  
		  
		  

	}
	
	

}
