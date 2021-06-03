using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Video25MethodsWithOut
{
    class MethodsWithOut
    {
        static void Main(string[] args)
        {
            int i = 0;
            Console.WriteLine("Previous value of integer i:" + i.ToString());
            string test = GetNextNameByOut(out i);
            Console.WriteLine("Current value of integer i:" + i.ToString());
            Console.ReadLine();
            int j = 9;
            Console.WriteLine("Previous value of integer j:" + j.ToString());
            string test1 = GetNextName(out j);
            Console.WriteLine("Current value of integer j:" + j.ToString());
            Console.ReadLine();
            int k = 99;
            Console.WriteLine("Previous value of integer k:" + k.ToString());
            string test2 = GetNextName(k);
            Console.WriteLine("Current value of integer k:" + k.ToString());
            Console.ReadLine();
        }
        public static string GetNextNameByOut(out int id)
        {
            id = 1;
            string returnText = "Next-" + id.ToString();
            return returnText;
        }
        public static string GetNextName(int id)
        {
            string returnText = "Next-" + id.ToString();
            id += 1;
            return returnText;
        }
        public static string GetNextName(out int id)
        {
            id = 10;
            string returnText = "Next-" + id.ToString();
            return returnText;
        }
    }
}
