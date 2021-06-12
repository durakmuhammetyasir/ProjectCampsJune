package playlist4.day4Homework1Video40_45.Video4243InterfacesPolymorphism;

public class Main {
    public static void main(String[] args) {
        //ICustomerDal customerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();
        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.add();
        customerManager.customerDal = new SqlServerCustomerDal();
        customerManager.add();


        CustomerManager2 customerManagers2 = new CustomerManager2(new OracleCustomerDal());
        customerManagers2.add();
        CustomerManager2 customerManagers3 = new CustomerManager2(new MySqlCustomerDal());
        customerManagers3.add();
        CustomerManager2 customerManagers4 = new CustomerManager2(new SqlServerCustomerDal());
        customerManagers4.add();
    }
}
