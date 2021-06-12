package day4Homework2DateClasses;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) {

    GregorianCalendar birthdate = new GregorianCalendar(1987, 1, 17);
    GregorianCalendar today = new GregorianCalendar(); // Today's date
    GregorianCalendar birthday = new GregorianCalendar(today.get(YEAR), birthdate.get(MONTH),
        birthdate.get(DATE));
    int age = today.get(today.YEAR) - birthdate.get(YEAR);
    String[] weekdays = new DateFormatSymbols().getWeekdays(); // Get day names
    System.out.println("You were born on a " + weekdays[birthdate.get(DAY_OF_WEEK)]);
    System.out.println("This year you " + (birthday.after(today) ? " will be " : "are ") + age
        + " years old.");
    System.out.println("In " + today.get(YEAR) + " your birthday "
        + (today.before(birthday) ? "will be" : "was") + " on a "
        + weekdays[birthday.get(DAY_OF_WEEK)] + ".");
    
    Formatter formatter1 = new Formatter();
    Formatter formatter2 = new Formatter();
    Calendar calendar = Calendar.getInstance();

    formatter1.format("Today is day %te of %<tB, %<tY", calendar);
    System.out.println(formatter1);
    formatter2.format("Today is day %td of %<tm (%<tb), %<ty", calendar);
    System.out.println(formatter2);
    
    Calendar now = Calendar.getInstance();

    System.out.println("Current full date time is : " + (now.get(Calendar.MONTH) + 1) + "-"
        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
        + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
        + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
    
    Date date = new Date();

    // Format date in a short format
    String today1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(date);
    System.out.println("Today " + today1);

    // Format date in a medium format
    today1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(date);
    System.out.println("Today " + today1);

    // Format date in a long format
    today1 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(date);
    System.out.println("Today " + today1);
    
    System.out.println(getElapsedText(1231231212L));
    
    /*Suffix             Replaced By

		a                  Abbreviated weekday name		
		A                  Full weekday name		
		b                  Abbreviated month name		
		B                  Full month name		
		c                  Standard date and time string formatted as day month date hh::mm:ss tzone year		
		C                  First two digits of year		
		d                  Day of month as a decimal (01-31)		
		D                  month/day/year		
		e                  Day of month as a decimal (1-31)		
		F                  year-month-day		
		h                  Abbreviated month name		
		H                  Hour (00 to 23)		
		I                  Hour (01 to 12)		
		j                  Day of year as a decimal (001 to 366)		
		k                  Hour (0 to 23)		
		l                  Hour (1 to 12)		
		L                  Millisecond (000 to 999)		
		m                  Month as decimal (01 to 13)		
		M                  Minute as decimal (00 to 59)		
		N                  Nanosecond (000000000 to 999999999)		
		P                  Locale's equivalent of AM or PM in uppercase		
		p                  Locale's equivalent of AM or PM in lowercase		
		Q                  Milliseconds from 1/1/1970		
		r                  hh:mm (12-hour format)		
		R                  hh:mm (24-hour format)		
		S                  Seconds (00 to 60)		
		s                  Seconds from 1/1/1970 UTC		
		T                  hh:mm:ss (24-hour format)		
		y                  Year in decimal without century (00 to 99)		
		Y                  Year in decimal including century (0001 to 9999)		
		z                  Offset from UTC		
		Z                  Time zone name
     */
    
  }
  public static double round1(double value) {
	    return Math.round(value * 10.0) / 10.0;
	  }

	  public static String getElapsedText(long elapsedMillis) {
	    if (elapsedMillis < 60000) {
	      double unit = round1(elapsedMillis / 1000.0);
	      return unit + (unit == 1 ? " second" : " seconds");
	    } else if (elapsedMillis < 60000 * 60) {
	      double unit = round1(elapsedMillis / 60000.0);
	      return unit + (unit == 1 ? " minute" : " minutes");
	    } else if (elapsedMillis < 60000 * 60 * 24) {
	      double unit = round1(elapsedMillis / (60000.0 * 60));
	      return unit + (unit == 1 ? " hour" : " hours");
	    } else {
	      double unit = round1(elapsedMillis / (60000.0 * 60 * 24));
	      return unit + (unit == 1 ? " day" : " days");
	    }
	  }
}
