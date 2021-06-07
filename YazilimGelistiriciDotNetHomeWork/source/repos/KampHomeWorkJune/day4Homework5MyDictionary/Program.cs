using System;

namespace day4Homework5MyDictionary
{
    class Program
    {
        static void Main(string[] args)
        {   MyDictionary<int, int> dictionary = new MyDictionary<int, int>();
            dictionary.Add(4, 20);
            dictionary.Add(5, 22);
            Console.WriteLine(String.Format("There are {0} value in data base", dictionary.Count));
            Console.ReadKey();


            MyDictionary<string, int> ageMap = new MyDictionary<string, int>();
            ageMap.Add("Oksana", 21);
            ageMap.Add("Vasya", 45);
            ageMap.Add("Katya", 13);
            Console.WriteLine(String.Format("There are {0} people in data base", ageMap.Count));
            Console.ReadKey();
        }
    }
}
