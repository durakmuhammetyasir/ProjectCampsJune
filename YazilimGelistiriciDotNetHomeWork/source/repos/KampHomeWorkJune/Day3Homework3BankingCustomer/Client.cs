using System;
using System.Collections.Generic;
using System.Text;

namespace Day3Homework3BankingCustomer
{
    class Client
    {
        string Email;
        string Password;
        string FirstName;
        string LastName;
        string Country;
        string Age;
        string VisaCard;
        string PhonNumber;
        public Client(string Email, string Password, string FirstName, string LastName, string Country,
                      string Age, string VisaCard, string PhonNumber)
        {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.VisaCard = VisaCard;
            this.Email = Email;
            this.Country = Country;
            this.Age = Age;
            this.Password = Password;
            this.PhonNumber = PhonNumber;
        }
    }
}
