package playlist.day1Homework3Video5_23;

import java.util.Scanner;

public class Video10BlocksSwitch {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the placenumber of calendar month you want : ");
        int count = scan.nextInt();
        var month = "";
        switch (count) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(month);

        var season = "";
        switch (count) {
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(season);

    }
}
