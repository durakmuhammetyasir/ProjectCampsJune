using Day5Homework4InterfaceAbstract.Abstract;
using Day5Homework4InterfaceAbstract.Adapters;
using Day5Homework4InterfaceAbstract.Concrete;
using System;

namespace Day5Homework4InterfaceAbstract
{
    public class Program
    {
        static void Main(string[] args)   
        {
            BaseCustomerManager customerManager2 = new NeroCustomerManager();
            BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());

            customerManager1.Save(new Customer { DateOfBirth = new DateTime(1985, 1, 6), FirstName = "Engin", LastName = "Demiroğ", NationalityId = "28861499108" });
            customerManager2.Save(new Customer { DateOfBirth = new DateTime(1987, 1, 6), FirstName = "Muhammet Yasir", LastName = "Durak", NationalityId = "" });
            Console.ReadLine();
        }
    }
}
