using System;

namespace Day3MetotlarJune
{
    class Program
    {
        static void Main(string[] args)
        {
            //Don't repeat yourself DRY Clean code Best practices
            Urun urun1 = new Urun();
            urun1.Adi = "Elma";
            urun1.Fiyati = 15;
            urun1.Aciklama = "Amasya elmasi";

            Urun urun2 = new Urun();
            urun2.Adi = "Elma";
            urun2.Fiyati = 15;
            urun2.Aciklama = "Amasya elmasi";

            Urun urun3 = new Urun();
            urun3.Adi = "Karpuz";
            urun3.Fiyati = 80;
            urun3.Aciklama = "Diyarbakir karpuzu";

            Urun2 urun4 = new Urun2();
            urun4.Adi = "Elma";
            urun4.Fiyati = 15;
            urun4.Aciklama = "Amasya elmasi";
            urun4.StokAdedi = 10;

            Urun2 urun5 = new Urun2();
            urun5.Adi = "Elma";
            urun5.Fiyati = 15;
            urun5.Aciklama = "Amasya elmasi";
            urun5.StokAdedi = 10;

            Urun2 urun6 = new Urun2();
            urun6.Adi = "Karpuz";
            urun6.Fiyati = 80;
            urun6.Aciklama = "Diyarbakir karpuzu";
            urun6.StokAdedi = 10;

            Urun[] urunler = new Urun[] { urun1, urun2 ,urun3};

            foreach (Urun urun in urunler)
            {
                Console.WriteLine(urun.Adi);
                Console.WriteLine(urun.Fiyati);
                Console.WriteLine(urun.Aciklama);
            }
            SepetManager sepetManager = new SepetManager();
            sepetManager.Ekle(urun1);
            sepetManager.Ekle(urun2);
            sepetManager.Ekle(urun3);

            sepetManager.Ekle2("Armut", "Yesil armut", 12);
            sepetManager.Ekle2("Elma", "Yesil elma", 12);
            sepetManager.Ekle2("Karpuz", "Diyarbakir karpuzu", 12);
            
            sepetManager.Ekle3("Armut", "Yesil armut", 12, 10);
            sepetManager.Ekle3("Elma", "Yesil elma", 12, 9);
            sepetManager.Ekle3("Karpuz", "Diyarbakir karpuzu", 12, 8);

            sepetManager.Ekle4(urun4);
            sepetManager.Ekle4(urun5);
            sepetManager.Ekle4(urun6);

        }
    }
}
