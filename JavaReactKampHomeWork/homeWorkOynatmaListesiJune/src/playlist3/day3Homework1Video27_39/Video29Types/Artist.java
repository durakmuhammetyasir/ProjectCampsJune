package playlist3.day3Homework1Video27_39.Video29Types;

public interface Artist {
    String getSchool();
    void setSchool(String school);
    default boolean isCreative(){
        return true;
    }
}
