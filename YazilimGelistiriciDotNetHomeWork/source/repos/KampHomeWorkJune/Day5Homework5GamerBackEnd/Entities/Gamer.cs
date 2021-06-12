using Day5Homework5GamerBackEnd.Abstracts;
using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework5GamerBackEnd.Concretes
{
    public class Gamer:IEntity
    {
        public int Id { get; set; }
        public string FirstName{ get; set; }
        public string LastName{ get; set; }
        public DateTime DateOfBirth{ get; set; }
        public string NationalityId{ get; set; }
    }
}
