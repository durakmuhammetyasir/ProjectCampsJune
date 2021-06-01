package playlist.day1Homework3Video5_23;

import java.util.Scanner;

import java.io.Console;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Video8BlocksIf {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("0 for male 1 for female: ");
        String title = "";
        int isMale = input.nextInt();
        // Ctrl+Alt+Shift+L code format
// Using an if-else statement
        if (isMale == 0) {
            title = "Mr.";
        } else if (isMale == 1) {
            title = "Ms.";
        } else {
            System.out.println("Error");
        }
        System.out.println(title);
// Using a ternary operator
        Scanner input2 = new Scanner(System.in);
        System.out.println("Are you female?: true false ");
        boolean isFemale = input2.nextBoolean();
        title = (isFemale ? "Ms." : "Mr.");
        System.out.println(title);
    }
}

