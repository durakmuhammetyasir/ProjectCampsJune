package day4Homework2InterfaceAbstract.adapters;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import day4Homework2InterfaceAbstract.abstracts.CustomerCheckService;
import day4Homework2InterfaceAbstract.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
			try {
				result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), 
						customer.getLastName(),customer.getDateOfBirth().get(GregorianCalendar.YEAR));
			}catch (NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("naltionalityId gecersiz");
			}catch (RemoteException e) {
				e.printStackTrace();
			}
		return result;
	}

}
