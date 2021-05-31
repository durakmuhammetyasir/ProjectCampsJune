using System;

namespace Day2Homework5QuizIkiSayiArasindakiAsalSayilariBulma
{
    class IkiSayiArasindakiAsalSayilariBulma
    {
        static void AsalArası(int sayi1, int sayi2)
        {
            int sayac;
            for (int i = sayi1; i < sayi2; i++)
            {
                sayac = 0;
                for (int j = 2; j < i; j++)
                {
                    if (i % j == 0)
                    {
                        sayac++;
                    }
                }
                if (sayac == 0)
                {
                    Console.WriteLine("Asal Sayılar = " + i);
                }
            }
        }
        static void Main(string[] args)
        {
            AsalArası(10, 50);
            Console.ReadLine();
        }
    }
}
