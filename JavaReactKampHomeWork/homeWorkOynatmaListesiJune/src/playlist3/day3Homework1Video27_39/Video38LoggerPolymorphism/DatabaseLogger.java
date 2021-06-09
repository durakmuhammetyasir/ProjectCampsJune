package playlist3.day3Homework1Video27_39.Video38LoggerPolymorphism;

public class DatabaseLogger extends BaseLogger{
    public void log (String message){
        System.out.println("Logged to database : " + message);
    }
}
