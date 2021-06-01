package playlist2.day2Homework2Video24_35.video24Methods.basic;
import java.util.List;

public class Actor extends Human {

    private String actingSchool;

    private List<String> films;

    public Actor(String name, int age, float height, Gender gender, String actingSchool) {
        super(name, age, height, gender);
        this.actingSchool = actingSchool;
    }

    @Override
    public int getTimeToLive() {
        return LIFESPAN - getAge();
    }

    public String getActingSchool() {
        return actingSchool;
    }

    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public void addFilm(String filmName){
        this.films.add(filmName);
    }
}