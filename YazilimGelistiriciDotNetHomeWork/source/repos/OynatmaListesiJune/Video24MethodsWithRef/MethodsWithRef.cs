using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Console;

namespace Video24MethodsWithRef
{
    class MethodsWithRef
    {
        static void Main(string[] args)
        {
            int v1 = 100;
            int v2 = 200;
            WriteLine("Start");
            WriteLine($"v1: {v1}, v2: {v2}\n");
            ref int max = ref Max(ref v1, ref v2);
            WriteLine("After assignment");
            WriteLine($"max: {max}\n");
            max++;
            WriteLine("After increment");
            WriteLine($"max: {max}, v1: {v1}, v2: {v2}");
            ReadLine();
            int i = 1;
            WriteLine("Previous value of integer i:" + i.ToString());
            string test = GetNextName(ref i);
            WriteLine("Current value of integer i:" + i.ToString());
            ReadLine();            
        }
        public static string GetNextName(ref int id)
        {
            string returnText = "Next-" + id.ToString();
            id += 1;
            return returnText;
        }
        static ref int Max(ref int p1, ref int p2)
        {
            if (p1 > p2)
                return ref p1; // Return the reference--not the value.
            else
                return ref p2; // Return the reference--not the value.
        }
        
    }
}
