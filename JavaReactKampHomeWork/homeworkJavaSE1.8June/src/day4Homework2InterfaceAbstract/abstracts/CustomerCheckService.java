package day4Homework2InterfaceAbstract.abstracts;

import day4Homework2InterfaceAbstract.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
