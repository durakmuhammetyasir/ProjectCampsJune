package playlist3.day3Homework1Video27_39.Video38LoggerPolymorphism;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers1 = new BaseLogger[] {new FileLogger(),
        new EmailLogger(), new DatabaseLogger()};
        for(BaseLogger logger:loggers1){
            logger.log("Log mesaji");
        }

        BaseLogger[] loggers2 = new BaseLogger[] {new FileLogger(),
                new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for(BaseLogger logger:loggers2){
            logger.log("Log mesaji");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
