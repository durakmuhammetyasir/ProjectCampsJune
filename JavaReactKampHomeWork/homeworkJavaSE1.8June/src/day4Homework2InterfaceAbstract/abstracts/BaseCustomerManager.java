package day4Homework2InterfaceAbstract.abstracts;

import day4Homework2InterfaceAbstract.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
	}

}
