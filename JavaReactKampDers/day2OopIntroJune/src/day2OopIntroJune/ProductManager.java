package day2OopIntroJune;

public class ProductManager {
	public void addToCart() {
		System.out.println("Sepete ekleme kodu cagrildi.");		
	}
	public void addToCart(Product product) {
		System.out.println("Sepete ekleme kodu cagrildi : " + product.name);		
	}
}
