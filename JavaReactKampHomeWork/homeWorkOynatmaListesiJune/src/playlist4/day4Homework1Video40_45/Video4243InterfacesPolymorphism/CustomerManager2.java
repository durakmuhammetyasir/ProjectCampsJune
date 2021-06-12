package playlist4.day4Homework1Video40_45.Video4243InterfacesPolymorphism;

public class CustomerManager2 implements ICustomerDal{
    private ICustomerDal customerDal2;

    public CustomerManager2(ICustomerDal customerDal){
        this.customerDal2 = customerDal;
    }
    @Override
    public void add() {
        customerDal2.add();

    }
}
