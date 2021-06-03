using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Video22MethodsWithParameterJune
{
    class MethodsWithParameter
    {
        static void Main(string[] args)
        {            
            // Pass two variables in by value.
            int x = 9, y = 10;
            Console.WriteLine("Before call: X: {0}, Y: {1}", x, y);
            Console.WriteLine("Answer is: {0}", Add(x, y));
            Console.WriteLine("After call: X: {0}, Y: {1}", x, y);
            Console.ReadLine();
            Console.WriteLine(Sum(1, 2, 3, 4, 5, 6));
            Console.ReadLine();
            Add(90, 90, out int ans);
            Console.WriteLine("90 + 90 = {0}", ans);
            Console.ReadLine();
            int i; string str; bool b;
            FillTheseValues(out i, out str, out b);
            Console.WriteLine("Int is: {0}", i);
            Console.WriteLine("String is: {0}", str);
            Console.WriteLine("Boolean is: {0}", b);
            Console.ReadLine();
            string str1 = "Flip";
            string str2 = "Flop";
            Console.WriteLine("Before: {0}, {1} ", str1, str2);
            SwapStrings(ref str1, ref str2);
            Console.WriteLine("After: {0}, {1} ", str1, str2);
            Console.ReadLine();
            // Pass in a comma-delimited list of doubles...
            double average;
            average = CalculateAverage(4.0, 3.2, 5.7, 64.22, 87.2);
            Console.WriteLine("Average of data is: {0}", average);
            // ...or pass an array of doubles.
            double[] data = { 4.0, 3.2, 5.7 };
            average = CalculateAverage(data);
            Console.WriteLine("Average of data is: {0}", average);
            // Average of 0 is 0!
            Console.WriteLine("Average of data is: {0}", CalculateAverage());
            Console.ReadLine();
        }
        static double CalculateAverage(params double[] values)
        {
            Console.WriteLine("You sent me {0} doubles.", values.Length);
            double sum = 0;
            if (values.Length == 0)
                return sum;
            for (int i = 0; i < values.Length; i++)
                sum += values[i];
            return (sum / values.Length);
        }
        public static void SwapStrings(ref string s1, ref string s2)
        {
            string tempStr = s1;
            s1 = s2;
            s2 = tempStr;
        }
        static void FillTheseValues(out int a, out string b, out bool c)
        {
            a = 9;
            b = "Enjoy your string.";
            c = true;
        }
        static void Add(int x, int y, out int ans)
        {
            ans = x + y;
        }
        static int Sum(params int[] args)
        {
            int add = 0;
            foreach (int item in args)
            {
                add = add + item;
            }
            return add;
        }
        static int Add(int x, int y)
        {
            int ans = x + y;
            // Caller will not see these changes
            // as you are modifying a copy of the
            // original data.
            x = 10000;
            y = 88888;
            return ans;
        }
        /*
            Parameter Modifier Meaning in Life
                (None)              If a parameter is not marked with a parameter modifier, it is assumed to be passed by value, meaning the called method receives a copy of the original data.
                out                 Output parameters must be assigned by the method being called and, therefore, are passed by reference. If the called method fails to assign output parameters,
                                        you are issued a compiler error.
                ref                 The value is initially assigned by the caller and may be optionally modified by the called method (as the data is also passed by reference). 
                                        No compiler error is generated if the called method fails to assign a ref parameter.
                params              This parameter modifier allows you to send in a variable number of arguments as a single logical parameter. A method can have only a single params modifier,
                                        and it must be the final parameter of the method. In reality, you might not need to use the params modifier all too often; however, 
                                        be aware that numerous methods within the base class libraries do make use of this C# language feature.
        */
    }
}

