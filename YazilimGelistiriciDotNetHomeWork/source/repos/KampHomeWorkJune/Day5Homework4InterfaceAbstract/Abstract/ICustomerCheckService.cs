﻿using Day5Homework4InterfaceAbstract.Concrete;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework4InterfaceAbstract.Abstract
{
    public interface ICustomerCheckService
    {
        bool CheckIfRealPerson(Customer customer);
    }
}
