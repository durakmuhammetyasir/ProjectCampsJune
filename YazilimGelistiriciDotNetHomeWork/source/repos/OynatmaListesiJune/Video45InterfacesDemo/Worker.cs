using System;

namespace Video45InterfacesDemo
{
    public class Worker : IWork, IEat,ISalary
    {
        public void Eat()
        {
            Console.WriteLine("Worker eats");
        }

        public void Pays()
        {
            Console.WriteLine("Worker's salary is paid");
        }
        public void Work()
        {
            Console.WriteLine("Worker works");
        }
    }   
}