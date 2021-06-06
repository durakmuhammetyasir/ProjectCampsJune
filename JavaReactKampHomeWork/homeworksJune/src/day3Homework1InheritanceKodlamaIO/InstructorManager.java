package day3Homework1InheritanceKodlamaIO;
public class InstructorManager {
	public void addJavaCourse(Instructor instructor) {
		instructor.setCourseGiven("Java & React");
		System.out.println("Java kursuna yeni ogretmen eklendi");
	}
	public void addFlutterCourse(Instructor instructor) {
		instructor.setCourseGiven("Flutter");
		System.out.println("Flutter kursuna yeni ogretmen eklendi");
	}
	public void dropCourse(Instructor instructor) {
		instructor.setCourseGiven(null);
		System.out.println("Kursun ogretmeni degisti");
	}
	public void dropJavaCourse(Instructor instructor) {
		String course = instructor.getCourseGiven();
		if(course=="Java & React") {
			instructor.setCourseGiven(null);
			System.out.println("Java kursunun ogretmeni degisti");
		}
	}
	public void dropFlutterCourse(Instructor instructor) {
		String course = instructor.getCourseGiven();
		if(course=="Flutter") {
			instructor.setCourseGiven(null);
			System.out.println("Flutter kursunun ogretmeni degisti");
		}
	}		
	public void list(Instructor[] instructors) {
		System.out.println("Sistemdeki Ogretmenler");
		System.out.println("User ID Instructor ID First Name  User Type     Course Given");
		for (Instructor instructor : instructors) {
			System.out.println( "     " + instructor.getId() + "       " +
					instructor.getInstructorId() + "        " 
					+ instructor.getFirstName() + "       " + 
					instructor.getUserType() + "   " + 
					instructor.getCourseGiven());
		} 
	}

}
