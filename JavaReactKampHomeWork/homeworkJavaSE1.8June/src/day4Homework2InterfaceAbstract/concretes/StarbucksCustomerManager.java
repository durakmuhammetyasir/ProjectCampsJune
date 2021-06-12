package day4Homework2InterfaceAbstract.concretes;

import day4Homework2InterfaceAbstract.abstracts.BaseCustomerManager;
import day4Homework2InterfaceAbstract.abstracts.CustomerCheckService;
import day4Homework2InterfaceAbstract.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
		
	}
	public void save(Customer customer) {
		
		if(_customerCheckService.checkIfRealPerson(customer))
		{
			System.out.println("Starbucks Customer Manager : validation successfull");
			super.save(customer);	
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}

}
