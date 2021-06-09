package playlist3.day3Homework1Video27_39.Video38LoggerPolymorphism;

public class EmailLogger extends BaseLogger{
    public void log (String message){
        System.out.println("Sent email : " + message);
    }
}
