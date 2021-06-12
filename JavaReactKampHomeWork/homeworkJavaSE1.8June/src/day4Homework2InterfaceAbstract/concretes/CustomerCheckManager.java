package day4Homework2InterfaceAbstract.concretes;

import day4Homework2InterfaceAbstract.abstracts.CustomerCheckService;
import day4Homework2InterfaceAbstract.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;		
	}

}
