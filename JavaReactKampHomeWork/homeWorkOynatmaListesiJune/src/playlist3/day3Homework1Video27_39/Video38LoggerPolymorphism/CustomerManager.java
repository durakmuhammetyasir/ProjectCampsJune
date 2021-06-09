package playlist3.day3Homework1Video27_39.Video38LoggerPolymorphism;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Musteri eklendi");
        this.logger.log("Log mesaji");
    }
}
