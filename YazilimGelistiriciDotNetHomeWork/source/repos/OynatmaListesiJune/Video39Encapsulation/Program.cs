using System;

namespace Video39Encapsulation
{
    class Program
    {
        static void Main(string[] args)
        {
            CustomerManager2 customerManager = new CustomerManager2();
            customerManager.Add();
            customerManager.Update();
            Customer2 customer2 = new Customer2();
            customer2.Id = 1;
            customer2.FirstName = "Derin";
            customer2.LastName = "Demiro";
            customer2.City = "Istanbul" ;
            Console.WriteLine(customer2.FirstName);


            ProductManager2 productManager = new ProductManager2();
            productManager.Add();
            productManager.Update();
            Console.ReadLine();
        }
    }
}
