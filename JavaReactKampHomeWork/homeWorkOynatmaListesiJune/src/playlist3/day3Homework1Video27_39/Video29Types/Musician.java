package playlist3.day3Homework1Video27_39.Video29Types;

import java.util.List;

public interface Musician extends Artist {
    List<String> getSongs();
    void setSongs(List<String> songs);
    String getGenre();
    void setGenre(String genre);
}
