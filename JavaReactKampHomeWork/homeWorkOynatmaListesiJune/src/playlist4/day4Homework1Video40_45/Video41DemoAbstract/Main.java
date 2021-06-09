package playlist4.day4Homework1Video40_45.Video41DemoAbstract;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomers();
    }
}
