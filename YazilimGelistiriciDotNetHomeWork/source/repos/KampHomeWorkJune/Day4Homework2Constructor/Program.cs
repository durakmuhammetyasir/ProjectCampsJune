using System;

namespace Day4Homework2Constructor
{
    class Program
    {
        static void Main(string[] args)
        {
            Customer customer1 = new Customer() { Id = 1, FirstName = "Engin", LastName = "Demirog", City = "Ankara" };
            Customer customer2 = new Customer() { Id = 2, FirstName = "Derin", LastName = "Demirog", City = "Ankara" };
            Customer customer3 = new Customer( 3, "Ergin", "Demirog", "Ankara");
            Console.WriteLine(  customer3.FirstName);
        }
    }
    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Yapici blok calisti.");
        }
        public Customer(int id, string firstName, string lastName, string city)
        {
            Id = id;
            FirstName = firstName;
            LastName = lastName;
            City = city;
        }
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string City { get; set; }
    }
}
