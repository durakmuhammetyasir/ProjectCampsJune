using System;
using System.Collections.Generic;

namespace Day4KoleksiyonlarJune
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] isimler = new string[] { "Engin", "Murat", "Kerem", "Halil" };
            Console.WriteLine(isimler[0]);
            Console.WriteLine(isimler[1]);
            Console.WriteLine(isimler[2]);
            Console.WriteLine(isimler[3]);

            //isimler[4] = "Ilker";
            //Console.WriteLine(isimler[4]);

            List<string> isimler2 = new List<string> 
            {
                "Engin",
                "Murat",
                "Kerem",
                "Halil"                
            };
            isimler2.Add( "Ilker");
            Console.WriteLine(isimler2[4]);
            Console.WriteLine(isimler2[0]);
        }
    }
}
