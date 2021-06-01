package playlist2.day2Homework2Video24_35.video24Methods.hierarchy;

import java.util.List;

public interface Musician extends Artist {

    List<String> getSongs();

    void setSongs(List<String> songs);

    String getGenre();

    void setGenre(String genre);
}