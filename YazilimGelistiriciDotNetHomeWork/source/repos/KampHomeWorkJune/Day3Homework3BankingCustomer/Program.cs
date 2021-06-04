using System;

namespace Day3Homework3BankingCustomer
{
    class Program
    {
        static void Main(string[] args)
        {
            var account = new BankAccount("Yasir", 1000);
            Console.WriteLine($"Account {account.Number} was created for {account.Client} with {account.Balance} initial balance.");
            account.MakeWithdrawal(500, DateTime.Now, "Rent payment");
            Console.WriteLine(account.Balance);
            account.MakeDeposit(100, DateTime.Now, "Friend paid me back");
            Console.WriteLine(account.Balance);
            Console.WriteLine(account.GetAccountHistory());
            
            
            // Test for a negative balance.
            try
            {
                account.MakeWithdrawal(750, DateTime.Now, "Attempt to overdraw");
            }
            catch (InvalidOperationException e)
            {
                Console.WriteLine("Exception caught trying to overdraw");
                //Console.WriteLine(e.ToString());

            }
            // Test that the initial balances must be positive.
            BankAccount invalidAccount;
            try
            {
                invalidAccount = new BankAccount("invalid", -55);
            }
            catch (ArgumentOutOfRangeException e)
            {
                Console.WriteLine("Exception caught creating account with negative balance");
                //Console.WriteLine(e.ToString());
                return;
            }
            Console.WriteLine(account.GetAccountHistory());
        }
    }
}
