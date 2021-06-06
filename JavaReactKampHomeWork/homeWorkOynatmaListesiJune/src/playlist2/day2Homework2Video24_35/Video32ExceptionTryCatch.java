package playlist2.day2Homework2Video24_35;

public class Video32ExceptionTryCatch {
    public static void main(String[] args) {
        int x = 10, y = 0, z;
        //An exception in Java is an object that encapsulates the details of an error in the program
        try {
            z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException e) {
            // Get the description of the exception
            String msg = e.getMessage();
            // Print a custom error message
            System.out.println("An error has occurred. The error is: " + msg);
        }
        System.out.println("At the end of the program.");
    }
}

