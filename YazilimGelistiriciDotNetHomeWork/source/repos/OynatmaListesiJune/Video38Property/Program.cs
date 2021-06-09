using System;

namespace Video38Property
{
    class Program
    {
        static void Main(string[] args)
        {
            Customer customer1 = new Customer();
            customer1.FirstName = "Engin";
            customer1.LastName = "Demirog";
            customer1.Id = 1;
            customer1.City = "Ankara";

            Customer customer2 = new Customer
            {
                Id = 2, FirstName = "Derin", LastName = "Demirog", City = "Istanbul"
            };
            Customer[] customers = new Customer[] { customer1, customer2 };
            bool hasTitle = false;
            foreach (Customer customer in customers)
            {
                if (!hasTitle)
                {
                    Console.WriteLine("Musteri Bilgileri: ");
                    hasTitle = true;
                }
                Console.WriteLine(" \n " + customer.Id + " " + customer.FirstName + " " + customer.LastName + " " + customer.City);
            }
        }
    }
}
