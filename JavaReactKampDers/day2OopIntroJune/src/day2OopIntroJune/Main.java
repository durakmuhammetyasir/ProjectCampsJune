package day2OopIntroJune;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();//Ornek, referans, instance olusturma 
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		Product product2 = new Product();//Ornek, referans, instance olusturma 
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		Product product3 = new Product();//Ornek, referans, instance olusturma 
		product3.id = 3;
		product3.name = "HP 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		Product product4 = new Product(1, "Lenovo V14", 15000, "16 GB Ram");
		Product[] products = {product1, product2, product3,product4};
		System.out.println(products.length);
		for (Product product : products) {
			System.out.println(product.name);
		}
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar"; 
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahce";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart();
		productManager.addToCart(product4);
		productManager.addToCart(product3);
		productManager.addToCart(product2);
		productManager.addToCart(product1);		
	}
}


