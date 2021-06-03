using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Video23MethodsWithDefault
{
    class CalculateDefault
    {
        public int Calculate(int a = 2, int b = 3, int c = 4)
        {
            return (a + b) * c;
        }
    }
}
