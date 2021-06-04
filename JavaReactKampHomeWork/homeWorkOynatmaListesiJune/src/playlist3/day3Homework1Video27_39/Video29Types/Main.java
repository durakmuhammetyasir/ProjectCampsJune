package playlist3.day3Homework1Video27_39.Video29Types;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String... args) {
        List<Artist> artists = new ArrayList<>();
        Musician john = new Performer("John", 40, 1.91f, Gender.MALE);
        List<String> songs = List.of("Gravity");
        john.setSongs(songs);
        artists.add(john);
        Graphician diana = new Graphician("Diana", 23, 1.62f, Gender.
                FEMALE, "macOs"); artists.add(diana);
        System.out.println(diana.getName()+ "\n" + diana.getAge() +"\n" + diana.getTimeToLive() + "\n" + diana.getComputer());
        for (Artist artist : artists) {
            if (artist instanceof Musician) {
                Musician musician = (Musician) artist;
                System.out.println("Songs: " + musician.getSongs());
            } else {
                System.out.println("Other Type: " + artist.getClass());
            }
        }
        List objList = new ArrayList();
        objList.add("temp");
        objList.add(Integer.valueOf(5));
        objList.add(new Performer("John", 40, 1.91f, Gender.MALE));
        for (Object obj : objList) {
            if (obj instanceof String) {
                System.out.println("String object = " + obj.toString());
            } else if (obj instanceof Integer) {
                Integer i = (Integer)obj;
                System.out.println("Integer object = " + obj.toString());
            } else {
                Performer p = (Performer) obj;
                System.out.println("Performer object = " + p.getName());
            }
        }
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);
        LocalDate today = currentTime.toLocalDate();
        System.out.println("Today: " + today);
        LocalDate johnBd = LocalDate.of(1977, Month.OCTOBER, 16);
        System.out.println("John’s Birthday: " + johnBd);
        int day = johnBd.getDayOfMonth();
        System.out.println("Day: " + day + ", " + johnBd.getDayOfWeek());
        int month = johnBd.getMonthValue();
        System.out.println("Month: " + month + ", " + johnBd.getMonth());
        int year = johnBd.getYear();
        System.out.println("Year: " + year);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar();
        Date currentDate = calendar.getTime();
        System.out.println("Today: " + sdf.format(currentDate));
        calendar.set(1977, 9, 16);
        Date johnBirthday = calendar.getTime();
        System.out.println("John’s Birthday: " + sdf.format(johnBirthday));
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day: " + day1);
        int month1 = calendar.get(Calendar.MONTH);
        System.out.println("Month: " + month1);
        int year1 = calendar.get(Calendar.YEAR);
        System.out.println("Year: " + year1);

        Performer[] array = new Performer[2];
        for (int i = 0; i < array.length; ++i) {
            System.out.println("performer[" + i + "]= " + array[i] );
        }
        array[0] = new Performer("John", 40, 1.91f, Gender.MALE);
        array[1] = new Performer("Julianna", 35, 1.61f, Gender.FEMALE);
        for (int i = 0; i < array.length; ++i) {
            System.out.println("performer[" + i + "]= " + array[i].
                    getName() );
        }

        Performer performer = new Performer("John", 40, 1.91f, Gender.MALE);
        Human human = performer;
        Actor actor = performer;
        Musician musician = performer;

        Performer john1 = new Performer("Johnny", 48, 1.99f, Gender.MALE);
        Performer jane = new Performer("Jane", 34, 1.591f, Gender.FEMALE);
        Pair<Performer, Performer> performerPair = Pair.of(john1, jane);
        System.out.println(performerPair);
        Pair<String, String> stringPair = Pair.of("Johnny", "Jane");
        System.out.println(stringPair);
        Pair<String, Performer> spPair = Pair.of("Johnny", jane);
        System.out.println(spPair);
        System.out.println("all good.");

        try {
            Performer p = PerformerGenerator.get("John");
            System.out.println("TTL: " + p.getTimeToLive());
        } catch (EmptyPerformerException e) {
            System.out.println("Cannot use an empty performer!");
        } finally {
            System.out.println("All went as expected!");
        }
        try {
            Performer p = PerformerGenerator.get("Jack");
            System.out.println("TTL: " + p.getTimeToLive());
        } catch (EmptyPerformerException e) {
            System.out.println("Cannot use an empty performer because of " + e.getMessage());
        }
    }
}

