using System;
using System.Collections.Generic;
using System.Text;

namespace Day3MetotlarJune
{
    class SepetManager
    {
        public void Ekle(Urun urun)
        {
            Console.WriteLine("Tebrikler. Sepete eklendi! : " + urun.Adi);
        }
        public void Ekle2(string urunAdi, string Aciklama, double fiyat)
        {
            Console.WriteLine("Tebrikler. Sepete Eklendi! : " + urunAdi);
        }
        public void Ekle3(string urunAdi, string Aciklama, double fiyat, int stokAdedi)
        {
            Console.WriteLine("Tebrikler. Sepete Eklendi! : " + urunAdi);
        }
        public void Ekle4(Urun2 urun)
        {
            Console.WriteLine("Tebrikler. Sepete eklendi! : " + urun.Adi);
        }
    }
}
