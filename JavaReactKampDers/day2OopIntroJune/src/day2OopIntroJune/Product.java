package day2OopIntroJune;

public class Product {
	public Product() {
		System.out.println("Ben calistim.");
	}
	/*public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}*/
	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	int id;
	String name;
	double unitPrice;
	String detail;	
}
