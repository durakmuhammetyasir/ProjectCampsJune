package day1IntroJune;

public class Main {

	public static void main(String[] args) {
		//Automation applications like banking, ecommerce, inventory control, rent a car, real estate, food delivery
		//Veritabani ve kullanici arayuzu arasindaki baglantiyi saglayan her islem dahil
		//int<long
		double dolarDun = 8.54;
		double dolarBugun = 8.60;
		boolean dustuMu = false;
		
		//CamelCase
		String internetSubeButonu = "Internet Subesi";
		//Don't repeat   yourself
		System.out.println(internetSubeButonu);
		internetSubeButonu = "Internet subeye gir";
		System.out.println(internetSubeButonu);
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar dustu resmi.");
		} else if(dolarDun<dolarBugun) {
			System.out.println("Dolar yukseldi resmi.");
		} else {
			System.out.println("Dolar esittir resmi.");
		}
		String kredi1 = "Hizli Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Ciftci Kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";
		
		String[] krediler = {
				"Hizli Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Ciftci Kredisi",
				"Msb Kredisi",
				"Meb Kredisi"				
		};
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1, 2, 3, 4, 5};
		int[] sayilar2 = {10, 20, 30, 40, 50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2 ;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
			 
	}

}
