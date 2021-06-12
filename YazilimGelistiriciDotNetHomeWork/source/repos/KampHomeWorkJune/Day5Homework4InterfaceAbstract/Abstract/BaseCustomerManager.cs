using Day5Homework4InterfaceAbstract.Concrete;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework4InterfaceAbstract.Abstract
{
    public abstract class BaseCustomerManager : ICustomerService
    {
        public virtual void Save(Customer customer)
        {
            Console.WriteLine("Saved to database : " + customer.FirstName);
        }

    }
}
