using System;

namespace Day5Homework2Interfaces
{
    public class CustomerManager : IPersonManager
    {
        public CustomerManager()
        {
        }

        public void Add()
        {
            Console.WriteLine("Musteri eklendi");
        }

        public void Update()
        {
            Console.WriteLine("Musteri guncellendi");
        }
    }
}