package day4Homework2InterfaceAbstract;

import java.util.GregorianCalendar;

import day4Homework2InterfaceAbstract.abstracts.BaseCustomerManager;
import day4Homework2InterfaceAbstract.adapters.MernisServiceAdapter;
import day4Homework2InterfaceAbstract.concretes.CustomerCheckManager;
import day4Homework2InterfaceAbstract.concretes.NeroCustomerManager;
import day4Homework2InterfaceAbstract.concretes.StarbucksCustomerManager;
import day4Homework2InterfaceAbstract.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer();
		customer1.setDateOfBirth(new GregorianCalendar(1985, 0, 6));
		customer1.setId(1);
		customer1.setFirstName("Engin");
		customer1.setLastName("Demiroð");
		customer1.setNationalityId("28861499108");
		Customer customer2 = new Customer();
		customer2.setDateOfBirth(new GregorianCalendar(1987, 1, 17));
		customer2.setId(2);
		customer2.setFirstName("Muhammet Yasir");
		customer2.setLastName("Durak");
		customer2.setNationalityId("");
		customerManager.save(customer1);
		customerManager1.save(customer1);
		System.out.println(customer1.toString());
		customerManager.save(customer2);
		customerManager1.save(customer2);
		System.out.println(customer2.toString());
	}

}
