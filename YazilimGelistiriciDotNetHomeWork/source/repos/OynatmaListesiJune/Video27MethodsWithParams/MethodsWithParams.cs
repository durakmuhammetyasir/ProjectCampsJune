using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Video27MethodsWithParams
{
    class MethodsWithParams
    {
        static void Main(string[] args)
        {
            // Total for 3rd grade. Pass 3 comma separate values as params  
            Console.WriteLine("Params with 3 parameters");
            int total3 = TotalMarks(8, 9, 8);
            // Print result  
            Console.WriteLine(total3);
            // Create an array of strings   
            string[] subs = { "English", "Reading", "Writing" };
            // Pass array of strings as a params and print result  
            Console.WriteLine(AllSubjects(subs));

            // Total for 8th grade          
            Console.WriteLine("Params with 4 parameters");
            int[] marks = { 24, 22, 25, 21 };
            int total4 = TotalMarks(marks);
            string str4 = AllSubjects("Math", "English", "Art", "Social Science");
            Console.WriteLine(total4);
            Console.WriteLine(str4.ToString());

            // Total for 10th grade  
            Console.WriteLine("Params with 5 parameters");
            int total5 = TotalMarks(92, 90, 95, 91, 98);
            string str5 = AllSubjects(new string[] { "Math", "English", "Art", "Social Science", "Gym" });
            Console.WriteLine(total5);
            Console.WriteLine(str5.ToString());

            Console.ReadKey();
        }
        public static int TotalMarks(params int[] list)
        {
            int total = 0;
            for (int i = 0; i < list.Length; i++)
                total += list[i];
            return total;
        }

        public static string AllSubjects(params string[] subjects)
        {
            System.Text.StringBuilder builder = new System.Text.StringBuilder();
            for (int i = 0; i < subjects.Length; i++)
            {
                builder.Append(subjects[i]);
                builder.Append(" ");
            }
            return builder.ToString();
        }
    }   
}
