package day3Homework1InheritanceKodlamaIO;

public class StudentManager {
	public void addJavaCourse(Student student) {
		student.setCourseTaken("Java & React");
		System.out.println("Java kursuna yeni kayit eklendi");
	}
	public void addFlutterCourse(Student student ) {
		student.setCourseTaken("Flutter");
		System.out.println("Flutter kursuna yeni kayit eklendi");
	}
	public void dropCourse(Student student) {
		student.setCourseTaken(null);
		System.out.println(student.getFirstName() + " kurstan ayrildi");
	}
	public void dropJavaCourse(Student student) {
		String course = student.getCourseTaken();
		if(course=="Java & React") {
			student.setCourseTaken(null);
			System.out.println(student.getFirstName() + " java kursunu tamamladi");
		}
	}
	public void dropFlutterCourse(Student student) {
		String course = student.getCourseTaken();
		if(course=="Flutter") {
			student.setCourseTaken(null);
			System.out.println(student.getFirstName() + " flutter kursunu tamamladi");
		}
	}
	public void list(Student[] students) {
		System.out.println("Sistemdeki Ogrenciler");
		System.out.println("User ID Student ID First Name  User Type     Course Taken");
		for (Student student : students) {
			System.out.println( "     " + student.getId() + "       " +
					student.getStudentId() + "        " 
					+ student.getFirstName() + "     " + 
					student.getUserType() + "       " + 
					student.getCourseTaken());
		} 
	}
	

}