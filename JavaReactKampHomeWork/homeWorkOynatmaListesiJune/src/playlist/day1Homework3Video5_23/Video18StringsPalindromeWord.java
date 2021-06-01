package playlist.day1Homework3Video5_23;


import java.util.Objects;
import java.util.Scanner;

public class Video18StringsPalindromeWord {
    public static void main(String[] args) {
        String str1 = "hello";
        boolean b1 = Video18StringsPalindromeWord.isPalindrome(str1);
        System.out.println(str1 + " is a palindrome: " + b1);
        String str2 = "noon";
        boolean b2 = Video18StringsPalindromeWord.isPalindrome(str2);
        System.out.println(str2 + " is a palindrome: " + b2);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word you want : ");
        String str3 = scan.nextLine();
        boolean b3 = Video18StringsPalindromeWord.isPalindrome(str3);
        System.out.println(str3 + " is a palindrome: " + b3);
    }
    public static boolean isPalindrome(String inputString) {
        Objects.requireNonNull(inputString, "String cannot be null.");
        // Get the length of string
        int len = inputString.length();
        // In case of an empty string and one character strings, we do not need to
        // do any comparisons. They are always palindromes.
        if (len <= 1) {
            return true;
        }
        // Convert the string into uppercase, so we can make the comparisons case insensitive
        String newStr = inputString.toUpperCase();
        // Initialize the result variable to true
        boolean result = true;
        // Get the number of comparisons to be done
        int counter = len / 2;
        // Do the comparison
        for (int i = 0; i < counter; i++) {
            if (newStr.charAt(i) != newStr.charAt(len - 1 - i)) {
                // It is not a palindrome
                result = false;
                // Exit the loop
                break;
            }
        }
        return result;
    }
}
