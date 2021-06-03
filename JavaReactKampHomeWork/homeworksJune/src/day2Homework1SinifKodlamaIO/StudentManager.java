package day2Homework1SinifKodlamaIO;

public class StudentManager extends Student{


	public StudentManager(String name, String address) {
		super(name, address);
	}

	/** Adds a course and percentage completed */
	public void addPercentCompleted(String course, int percentageCompleted) {
	   getCourses()[getNumCourses()] = course;
	   getPercentCompleted()[getNumCourses()] = percentageCompleted;
	   setNumCourses(1+getNumCourses());
	}
	
	/** Prints all courses and their respective PercentCompleted */
	public void printPercentCompleted() {
	   System.out.print(getName());
	   for (int i = 0; i < getNumCourses(); ++i) {
	      System.out.print(" " + getCourses()[i] + ":" + getPercentCompleted()[i]);
	   }
	   System.out.println();
	}
	
	/** Computes the overall completion ratio */
	public double getAverageCompleted() {
	   int sum = 0;
	   for (int i = 0; i < getNumCourses(); ++i) {
	      sum += getPercentCompleted()[i];
	   }
	   return (double)sum/getNumCourses();
	}
}