using System;

namespace Day2Homework4WhileLoopJune
{
    class Day2Homework4WhileLoopJune
    {
        static void Main(string[] args)
        {
            string userIsDone = "";
            // Test on a lower-class copy of the string.
            while (userIsDone.ToLower() != "yes")
            {
                Console.WriteLine("In while loop");
                Console.Write("Are you done? [yes] [no]: ");
                userIsDone = Console.ReadLine();
            }
            string userIsDone1 = "";
            do
            {
                Console.WriteLine("In do/while loop");
                Console.Write("Are you done? [yes] [no]: ");
                userIsDone1 = Console.ReadLine();
            } while (userIsDone1.ToLower() != "yes"); // Note the semicolon!
        }
    }
}
