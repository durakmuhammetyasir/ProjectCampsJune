package day2OopIntroJune;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();//Ornek, referans, instance olusturma 
		product1.setId(1);
		product1.setName( "Lenovo V14");
		product1.setUnitPrice( 15000);
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		Product product2 = new Product();//Ornek, referans, instance olusturma 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(10);
		Product product3 = new Product();//Ornek, referans, instance olusturma 
		product3.setId(3);
		product3.setName("HP 5");
		product3.setUnitPrice(10000);
		product3.setDetail("8 GB Ram");
		product3.setDiscount(10);
		Product product4 = new Product(1, "Lenovo V14", 15000, 
				"16 GB Ram",10);
		
		Category category1 = new Category();
		/*
		 * category1.id = 1; 
		 * category1.name = "Bilgisayar";
		 */
		category1.setId( 1);
		category1.setName ("Bilgisayar"); 
		Category category2 = new Category();
		/*
		 * category2.id = 2; 
		 * category2.name = "Ev/Bahce";
		 */
		category2.setId ( 2);
		category2.setName ( "Ev/Bahce");
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart();
		/*
		 * productManager.addToCart(product4); 
		 * productManager.addToCart(product3);
		 * productManager.addToCart(product2); 
		 * productManager.addToCart(product1);
		 */
		
		Product[] products = {product1, product2, product3,product4};
		System.out.println("Urun Cesidi Sayisi : " + products.length + "\n");
		for (Product product : products) {
			productManager.addToCart(product);
			System.out.println(product.getName() + " indirim sonrasi fiyat "
					+ product.getUnitPriceAfterDiscont() + "\n");			
		}
		
		Category[] categories = {category1, category2};
		System.out.println("Urun Kategorisi Sayisi : " + categories.length + "\n");
		boolean hasTitle = false; 
		for (Category category : categories) {
			if(!hasTitle) {
				System.out.println("Urun kategorileri\n");
				hasTitle =true;
			}
			System.out.println(category.getId() + " " + category.getName() +"\n");			
			
		}
	}
}


