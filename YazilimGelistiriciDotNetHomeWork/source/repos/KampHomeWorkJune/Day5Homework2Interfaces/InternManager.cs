using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework2Interfaces
{
    public class InternManager : IPersonManager
    {
        public void Add()
        {
            Console.WriteLine("Satjyer eklendi");
        }

        public void Update()
        {
            Console.WriteLine("Satjyer guncellendi");
        }
    }
}
