using System;

namespace Day2DongulerJune
{
    class Day2DonglerJune
    {
        static void Main(string[] args)
        {
            string kurs1 = "Yazilim Gelistirici Yetistirme Kampi";
            string kurs2 = "Programlamaya Giris Icin Temel Kurs";
            string kurs3 = "Java React Yazilim Gelistirme Kampi";

            string[] kurslar = new string[]
                {
                "Yazilim Gelistirici Yetistirme Kampi",
                "Programlamaya Giris Icin Temel Kurs",
                "Java React Yazilim Gelistirme Kampi",
                "Python",
                "C++"
                };
            for (int i = 0; i < 3; i++)
            {
                Console.WriteLine(kurslar[i]);
            }
            Console.WriteLine("Sayfa Sonu - Footer");

            for (int i = 0; i < kurslar.Length; i++)
            {
                Console.WriteLine(kurslar[i]);
            }
            Console.WriteLine("Sayfa Sonu - Footer");

            foreach (var item in kurslar)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine("Sayfa Sonu - Footer");
            for (int i = 0; i <= 10; i++)
            {
                Console.WriteLine(i);
            }
            for (int i = 0; i <= 10; i+=2)
            {
                Console.WriteLine(i);
            }
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine(i);
            }
        }
    }
    
}
