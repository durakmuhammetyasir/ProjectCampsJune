using System;

namespace Video45InterfacesDemo
{
    public class Manager : IEat, IWork,ISalary
    {
        public void Eat()
        {
            Console.WriteLine("Manager eats");
        }

        public void Pays()
        {
            Console.WriteLine("Manager's salary is paid");
        }

        public void Work()
        {
            Console.WriteLine("Manager works");
        }
    }
}