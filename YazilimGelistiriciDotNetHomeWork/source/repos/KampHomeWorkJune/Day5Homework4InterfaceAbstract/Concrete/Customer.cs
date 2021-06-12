using Day5Homework4InterfaceAbstract.Abstract;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework4InterfaceAbstract.Concrete
{
    public class Customer:IEntity
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime DateOfBirth { get; set; }
        public string NationalityId { get; set; }
    }

}
