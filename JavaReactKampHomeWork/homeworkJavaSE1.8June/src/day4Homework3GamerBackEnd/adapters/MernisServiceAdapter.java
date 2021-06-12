package day4Homework3GamerBackEnd.adapters;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import day4Homework3GamerBackEnd.abstracts.GamerCheckService;
import day4Homework3GamerBackEnd.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
			try {
				result = soapClient.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(), 
						gamer.getLastName(),gamer.getDateOfBirth().get(GregorianCalendar.YEAR));
			}catch (NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("naltionalityId gecersiz");
			}catch (RemoteException e) {
				e.printStackTrace();
			}
		return result;
	}

}
