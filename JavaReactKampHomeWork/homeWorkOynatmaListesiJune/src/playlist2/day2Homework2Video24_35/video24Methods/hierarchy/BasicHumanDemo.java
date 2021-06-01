package playlist2.day2Homework2Video24_35.video24Methods.hierarchy;

public class BasicHumanDemo {

    public static void main(String... args) {
        Performer human = new Performer("John", 40, 1.91f, Gender.MALE);

        System.out.println("name: " + human.getName());
        System.out.println("age: " + human.getAge());
        System.out.println("height: " + human.getHeight());
        System.out.println("gender: " + human.getGender().name());
        System.out.println("music school: " + human.getSchool());
        System.out.println("genre: " + human.getGenre());
        System.out.println("ttl: " + human.getTimeToLive());

    }

}
