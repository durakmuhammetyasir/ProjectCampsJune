package day2Homework1SinifKodlamaIO;

public class Student {


/**
 * The student class models a student having courses and percentCompleted.
 */
// The private instance variables
   private String name;
   private String address;
   // The courses taken and percentCompleted for the courses are kept in 2 parallel arrays
   private String[] courses;
   private int[] percentCompleted;     // valid range is [0, 100]
   private int numCourses;   // Number of courses taken so far
   private static final int MAX_COURSES = 3;  // Maximum number of courses taken by student
 
   /** Constructs a Student instance with the given input */
   public Student(String name, String address) {
      this.name = name;
      this.address = address;
      courses = new String[MAX_COURSES];  // allocate arrays
      percentCompleted = new int[MAX_COURSES];
      numCourses = 0;                     // no courses so far
   }
 
  
// The public getters and setters.
   // No setter for name as it is not designed to be changed.
   /** Returns the name */
   public String getName() {
      return this.name;
   }
   /** Returns the address */
   public String getAddress() {
      return this.address;
   }
   /** Sets the address */
   public void setAddress(String address) {
      this.address = address;
   }
 
   /** Returns a self-descriptive String */
	   public String toString() {
	      return name + "(" + address + ")";
	   }
	
	
	public String[] getCourses() {
		return courses;
	}
	
	
	public int[] getPercentCompleted() {
		return percentCompleted;
	}
	
	
	public int getNumCourses() {
		return numCourses;
	}
	
	
	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}


	public static int getMaxCourses() {
		return MAX_COURSES;
}   
}