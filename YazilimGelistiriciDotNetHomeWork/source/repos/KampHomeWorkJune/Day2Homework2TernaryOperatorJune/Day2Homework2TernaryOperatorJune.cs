using System;

namespace Day2Homework2TernaryOperatorJune
{
    class Day2Homework2TernaryOperatorJune
    {
        static void Main(string[] args)
        {
            string Sonuc = (1 == 1) ? "Sonuç Doğru" : "Sonuç Yanlış";
            Console.WriteLine(Sonuc);

            int input = new Random().Next(-5, 5);
            string classify1;
            string classify2;
            if (input >= 0)
            {
                classify1 = "nonnegative";
            }
            else
            {
                classify1 = "negative";
            }
            Console.WriteLine(classify1);
            classify2 = (input >= 0) ? "nonnegative" : "negative";
            Console.WriteLine(classify2);
            string GetWeatherDisplay(double tempInCelsius) => tempInCelsius < 20.0 ? "Cold." : "Perfect!";

            Console.WriteLine(GetWeatherDisplay(15));  // output: Cold.
            Console.WriteLine(GetWeatherDisplay(27));  // output: Perfect!
        }
    }
}
