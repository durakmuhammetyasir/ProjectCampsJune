package playlist2.day2Homework2Video24_35.video24Methods.hierarchy;
import java.util.List;

public interface Actor extends Artist {

    List<String> getFilms();

    void setFilms(List<String> films);

    void addFilm(String filmName);
}
