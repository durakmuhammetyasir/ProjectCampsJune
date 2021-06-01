package playlist.day1Homework3Video5_23;

import java.util.Scanner;

public class Video20RecapHardSoftVowels {
    public static void main(String[ ] arg)
    {
        int i=0;
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        //char ch=sc.nextChar();
        switch(ch)
        {
            case 'a'  :
            case 'ı'  :
            case 'o'  :
            case 'u'  :
            case 'A'  :
            case 'I'  :
            case 'O'  :
            case 'U'  :
                i++;
        }
        switch (ch)
        {   case 'ö'  :
            case 'ü'  :
            case 'e'  :
            case 'i'  :
            case 'İ'  :
            case 'Ö'  :
            case 'Ü'  :
            case 'E'  :
            j++;
        }
        if(i!=1) {
            if (j==1){
                System.out.println("Entered character " + ch + " is a soft vowel");
            }
            else if (j != 1) {
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println("Entered character " + ch + " is a consonant");
                } else {
                    System.out.println("Not an alphabet");
                }
            }
        }else if(i ==1){
            System.out.println("Entered character " + ch + " is a hard vowel");
        }
    }
}
