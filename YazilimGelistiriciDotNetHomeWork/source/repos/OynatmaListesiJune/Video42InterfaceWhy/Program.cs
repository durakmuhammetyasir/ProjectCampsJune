using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Video42InterfaceWhy
{
    public class Program
    {
        static void Main(string[] args)
        {
            PersonManager manager = new PersonManager();
            Customer customer = new Customer() { Id = 1, FirstName = "Engin", LastName = "Demirog", Address = "Ankara" };
            Student student = new Student() { Id = 1, FirstName = "Derin", LastName = "Demirog", Department = "Computer Sciences" };
            manager.Add(customer);
            manager.Add(student);
            Console.ReadKey();
        }
    }
}
