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
	}

}
