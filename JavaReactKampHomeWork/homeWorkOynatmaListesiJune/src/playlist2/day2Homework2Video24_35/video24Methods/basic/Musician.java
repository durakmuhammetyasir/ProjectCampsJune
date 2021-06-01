package playlist2.day2Homework2Video24_35.video24Methods.basic;
import java.util.List;

public class Musician extends Human {

    private String musicSchool;

    private String genre;

    private List<String> songs;

    public Musician(String name, int age, float height, Gender gender, String musicSchool, String genre) {
        super(name, age, height, gender);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }

    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
    }

    public String getMusicSchool() {
        return musicSchool;
    }

    public void setMusicSchool(String musicSchool) {
        this.musicSchool = musicSchool;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public void addSong(String song){
        this.songs.add(song);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}