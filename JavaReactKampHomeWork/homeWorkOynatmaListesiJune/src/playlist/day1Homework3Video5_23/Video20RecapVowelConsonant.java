package playlist.day1Homework3Video5_23;

import java.util.Scanner;

public class Video20RecapVowelConsonant {
    public static void main(String[ ] arg)
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        //char ch=sc.nextChar();
        switch(ch)
        {
            case  'a' :
            case 'e'  :
            case 'ı'   :
            case 'ö'  :
            case 'ü'  :
            case 'o'  :
            case 'u'  :
            case 'i'  :
            case 'İ'  :
            case 'Ö'  :
            case 'Ü'  :
            case 'A' :
            case 'E'  :
            case 'I'   :
            case 'O'  :
            case 'U'  :i++;
        }
        if(i==1)
            System.out.println("Entered character "+ch+" is Vowel");
            else
                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                    System.out.println("Entered character "+ch+" is Consonent");
                else
                    System.out.println("Not an alphabet");
    }
}