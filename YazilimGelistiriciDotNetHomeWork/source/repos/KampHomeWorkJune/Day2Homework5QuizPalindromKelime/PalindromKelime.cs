using System;

namespace Day2Homework5QuizPalindromKelime
{
    class PalindromKelime
    {
        static void Main(string[] args)
        {
            Console.Write("Bir kelime giriniz: ");
            string kelime = Console.ReadLine();
            string kelime_ters = "";
            for (int i = kelime.Length - 1; i >= 0; i--)
            {
                kelime_ters += kelime[i];
            }
            Console.WriteLine("\nKelimenin tersten yazılısı = " + kelime_ters);
            if (kelime_ters == kelime)
            {
                Console.WriteLine("\nGirilen kelime Palindromik bir kelimedir.");
            }
            else
            {
                Console.WriteLine("\nGirilen kelime Palindromik bir kelime değildir.");
            }
            Console.ReadLine();
        }
    }
}
