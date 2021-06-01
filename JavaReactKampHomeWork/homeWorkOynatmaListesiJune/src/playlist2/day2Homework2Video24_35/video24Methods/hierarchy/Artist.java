package playlist2.day2Homework2Video24_35.video24Methods.hierarchy;
public interface Artist {
    String getSchool();

    void setSchool(String school);

    default boolean isCreative(){
        return true;
    }
}
