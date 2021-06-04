package playlist3.day3Homework1Video27_39.Video29Types;

public class Graphician extends Human implements Artist{


    private String computer;
    public Graphician(String name, int age, float height, Gender gender, String computer) {
        super(name, age, height, gender);
        this.computer = computer;
    }
    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String getSchool() {
        return null;
    }

    @Override
    public void setSchool(String school) {

    }
}
