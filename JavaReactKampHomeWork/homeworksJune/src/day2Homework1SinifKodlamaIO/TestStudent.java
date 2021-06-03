package day2Homework1SinifKodlamaIO;

public class TestStudent {

	public static void main(String[] args) {
		  StudentManager interm = new StudentManager("Yasir Onbasi", "45 Manisa");
	      System.out.println(interm);  // toString()
	      //Yasir Onbasi 45 Manisa
	
	      // Test Setters and Getters
	      interm.setAddress("17 Canakkale");
	      System.out.println(interm);
	      //Yasir Onbasi 17 Canakkale
	      System.out.println(interm.getName());
	      //Yasir Onbasi
	      System.out.println(interm.getAddress());
	      //17 Canakkale
	      
	      // Test addPercentCompleted(), printPercentCompleted(), getNumCourses() and getAverageCompleted()
	      interm.addPercentCompleted("Temel Kurs", 89);
	      interm.addPercentCompleted("CSharp Angular", 57);
	      interm.addPercentCompleted("Java React", 96);
	      System.out.println("Number of taken courses : " + interm.getNumCourses());
	      interm.printPercentCompleted();
	      //Yasir Onbasi Temel Kurs:89 CSharp Angular:57 Java React:96
	      System.out.printf("The overall completion ratio is %.2f%n", interm.getAverageCompleted());
	      //The overall completion is 80.67
	      

	}

}
