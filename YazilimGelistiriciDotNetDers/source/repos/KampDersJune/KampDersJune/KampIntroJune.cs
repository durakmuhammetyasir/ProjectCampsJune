using System;

namespace Day2KampIntroJune
{
    class KampIntroJune
    {
        static void Main(string[] args)
        {
            string kategoriEtiketi = "Kategoriler";
            bool sistemeGirisYapmisMi = false;
            double dolarDun = 8.54;
            double dolarBugun = 8.50;

            if (dolarBugun<dolarDun)
            {
                Console.WriteLine("Azalis Butonu");
            }
            else if (dolarDun < dolarBugun)
            {
                Console.WriteLine("Artis Butonu");
            }
            else
            {
                Console.WriteLine("Degismedi Butonu");
            }
            
            
            if (sistemeGirisYapmisMi==true)//veri kaynagindan gelir
            {
                Console.WriteLine("Kullanici ayarlari butonu");
            }
            else
            {
                Console.WriteLine("Giris yap butonu");
            }
            Console.WriteLine(kategoriEtiketi);
        }
    }
}
