package playlist2.day2Homework2Video24_35.Video28ClassAccount;

import playlist2.day2Homework2Video24_35.Video28ClassAccount.Account;

public class TestAccount {
    //Creating a test class to deposit and withdraw amount
    public static void main(String[] args){
        Account account1=new Account()
                ;
        account1.insert(832345,"Ahmet",1000);
        account1.display();
        account1.checkBalance();
        account1.deposit(40000);
        account1.checkBalance();
        account1.withdraw(15000);
        account1.checkBalance();
    }
}
