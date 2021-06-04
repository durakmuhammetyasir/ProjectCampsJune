package playlist3.day3Homework1Video27_39.Video29Types;

public class PerformerGenerator {
    public static Performer get(String name)
            throws EmptyPerformerException {
        return new Performer(name,40, 1.91f, Gender.MALE);
    }
}
