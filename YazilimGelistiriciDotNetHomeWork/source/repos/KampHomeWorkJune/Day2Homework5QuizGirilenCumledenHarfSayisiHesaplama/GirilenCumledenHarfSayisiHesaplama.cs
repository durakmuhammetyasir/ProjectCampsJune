using System;

namespace Day2Homework5QuizGirilenCumledenHarfSayisiHesaplama
{
    class GirilenCumledenHarfSayisiHesaplama
    {
        static void HarfSayac(char harf, string cumle)
        {
            int sayac = 0;
            for (int i = 0; i < cumle.Length; i++)
            {
                if (cumle[i] == harf)
                {
                    sayac++;
                }
            }
            Console.WriteLine("Girdiginiz cumlede " + harf + " den " + sayac + " tane vardır.");
        }
        static void Main(string[] args)
        {
            Console.Write("Bir cumle giriniz: ");
            string cumle = Console.ReadLine();
            Console.Write("Bir harf giriniz: ");
            char harf = Convert.ToChar(Console.ReadLine());
            HarfSayac(harf, cumle);

            Console.ReadLine();
        }
    }
}
