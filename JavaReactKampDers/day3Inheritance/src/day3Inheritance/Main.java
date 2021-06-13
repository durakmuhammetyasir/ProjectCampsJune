package day3Inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.id = 1;
		individualCustomer.customerNumber = "12345";
		individualCustomer.firstName = "Engin";
		individualCustomer.lastName = "Demirog";
		individualCustomer.nationalityId = "12345678910";
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.id = 2;
		corporateCustomer.customerNumber = "54321";
		corporateCustomer.corporateName = "HepsiBurada";
		corporateCustomer.taxNumber = "1234567890";
		UnionCustomer unionCustomer = new UnionCustomer();
		unionCustomer.id =3;
		unionCustomer.customerNumber ="99999";
		unionCustomer.unionName = "KomurIs";
		
		CustomerManager customerManager = new CustomerManager();
		Customer customer1 = new IndividualCustomer();
		Customer customer2 = new CorporateCustomer();
		
		
		customerManager.add(individualCustomer);
		customerManager.add(corporateCustomer);
		customerManager.add(unionCustomer);
	}
}
