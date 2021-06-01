package playlist2.day2Homework2Video24_35.video24Methods.basic;
public class BasicHumanDemo {

    public static void main(String... args) {

        Musician human = new Musician("John", 40, 1.91f, Gender.MALE,
                "self taught", "country");

        System.out.println("name: " + human.getName());
        System.out.println("age: " + human.getAge());
        System.out.println("height: " + human.getHeight());
        System.out.println("gender: " + human.getGender().name());
        System.out.println("music school: " + human.getMusicSchool());
        System.out.println("genre: " + human.getGenre());
        System.out.println("ttl: " + human.getTimeToLive());

    }

}