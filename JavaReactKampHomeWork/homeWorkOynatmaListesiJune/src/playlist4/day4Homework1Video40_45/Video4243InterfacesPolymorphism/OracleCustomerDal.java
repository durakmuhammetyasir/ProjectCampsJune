package playlist4.day4Homework1Video40_45.Video4243InterfacesPolymorphism;

public class OracleCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Oracle eklendi.");
    }
}
