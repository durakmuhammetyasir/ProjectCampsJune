package playlist2.day2Homework2Video24_35.Video28ClassAccount;

//Java Program to demonstrate the working of a banking-system
//where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods
public class Account {
    int account_no;
    String name;
    float amount;
    //Method to initialize object
    void insert(int _account_no,String _name,float _amount){
        account_no=_account_no;
        name=_name;
        amount=_amount;
    }
    //deposit method
    void deposit(float _amount){
        amount=amount+_amount;
        System.out.println(_amount+" deposited");
    }
    //withdraw method
    void withdraw(float _amount){
        if(amount<_amount){
            System.out.println("Insufficient Balance");
        }else{
            amount=amount-_amount;
            System.out.println(_amount+" withdrawn");
        }
    }
    //method to check the balance of the account
    void checkBalance(){System.out.println("Balance is: "+amount);}
    //method to display the values of an object
    void display(){System.out.println(account_no+" "+name+" "+amount);}
}

