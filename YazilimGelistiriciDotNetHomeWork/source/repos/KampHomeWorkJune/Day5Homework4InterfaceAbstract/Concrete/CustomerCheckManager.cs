using Day5Homework4InterfaceAbstract.Abstract;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework4InterfaceAbstract.Concrete
{
    class CustomerCheckManager : ICustomerCheckService
    {
        public bool CheckIfRealPerson(Customer customer)
        {
            return true;
        }
    }
}
