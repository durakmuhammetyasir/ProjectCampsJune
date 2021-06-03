using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Video23MethodsWithDefault
{
    class MethodsWithDefault
    {
        static void Main(string[] args)
        {
            CalculateDefault mc = new CalculateDefault();
            int r0 = mc.Calculate(5, 6, 7); // Use all explicit values.
            int r1 = mc.Calculate(5, 6); // Use default for c.
            int r2 = mc.Calculate(5); // Use default for b and c.
            int r3 = mc.Calculate(); // Use all defaults.
            Console.WriteLine($"{r0}, {r1}, {r2}, {r3}");
            Console.ReadLine();
        }
        
    }
}
