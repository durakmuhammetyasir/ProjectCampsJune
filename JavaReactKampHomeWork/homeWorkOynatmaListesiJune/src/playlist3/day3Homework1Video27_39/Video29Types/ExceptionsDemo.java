package playlist3.day3Homework1Video27_39.Video29Types;

public class ExceptionsDemo {
    public static void main(String... args) {
        try {
            Performer p = PerformerGenerator.get("John");
            System.out.println("TTL: " + p.getTimeToLive());
        } catch (EmptyPerformerException e) {
            System.out.println("Cannot use an empty performer!");
        } finally {
            System.out.println("All went as expected!");
        }
    }
}
