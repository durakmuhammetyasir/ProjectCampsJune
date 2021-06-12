using System;

namespace Day5Homework2Interfaces
{
    public class EmployeeManager : IPersonManager
    {
        public void Add()
        {
            Console.WriteLine("Personel eklendi");
        }

        public void Update()
        {
            Console.WriteLine("Personel guncellendi");
        }
    }
}