package day4Homework2InterfaceAbstract.concretes;

import day4Homework2InterfaceAbstract.abstracts.BaseCustomerManager;
import day4Homework2InterfaceAbstract.abstracts.CustomerCheckService;
import day4Homework2InterfaceAbstract.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	CustomerCheckService _customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		try {
			if (_customerCheckService.checkIfRealPerson(customer)) {
				System.out.println("Nero Customer Manager : validation successfull.");
				super.save(customer);
			}else {
				System.out.println("Nero Customer Manager : Error -- The person not a valid.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
