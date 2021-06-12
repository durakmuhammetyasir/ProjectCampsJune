using System;

namespace Day4Homework5MyDictionary
{
    class Program
    {
        static void Main(string[] args)
        {   /*MyDictionary<int, int> dictionary = new MyDictionary<int, int>();
            dictionary.Add(4, 20);
            dictionary.Add(5, 22);
            Console.WriteLine(String.Format("There are {0} value in data base", dictionary.Count));
            Console.ReadKey();


            MyDictionary<string, int> ageMap = new MyDictionary<string, int>();
            ageMap.Add("Oytun", 21);
            ageMap.Add("Ozkan", 45);
            ageMap.Add("Onur", 13);
            Console.WriteLine(String.Format("There are {0} people in data base", ageMap.Count));
            Console.ReadKey();*/

            MyDictionary<int, int> dictionary = new MyDictionary<int, int>();
            Console.WriteLine(String.Format("There are {0} value in data base\n", dictionary.Count));
            dictionary.Add(4, 20);
            Console.WriteLine(String.Format("There are {0} value in data base\n", dictionary.Count));
            dictionary.Add(5, 22);
            Console.WriteLine(String.Format("There are {0} value in data base\n", dictionary.Count));
            Console.ReadKey();


            MyDictionary<string, int> ageMap = new MyDictionary<string, int>();
            Console.WriteLine(String.Format("There are {0} people in data base\n", ageMap.Count));
            ageMap.Add("Oytun", 21);
            Console.WriteLine(String.Format("There are {0} people in data base\n", ageMap.Count));
            ageMap.Add("Ozkan", 45);
            Console.WriteLine(String.Format("There are {0} people in data base\n", ageMap.Count));
            ageMap.Add("Onur", 13);
            Console.WriteLine(String.Format("There are {0} people in data base\n", ageMap.Count));
            Console.ReadKey();


        }
    }
}
