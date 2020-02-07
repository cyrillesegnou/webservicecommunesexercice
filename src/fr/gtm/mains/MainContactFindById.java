package fr.gtm.mains;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.gtm.webservice.Contact;
import fr.gtm.webservice.ContactServiceWeb;
import fr.gtm.webservice.ContactServiceWebServiceLocator;

public class MainContactFindById {

	public static void main(String[] args) throws RemoteException, ServiceException {
		
		ContactServiceWebServiceLocator locator = new ContactServiceWebServiceLocator();
		ContactServiceWeb port = locator.getContactServiceWebPort();
		Contact contact = port.findContactById(70L);
		
		System.out.println(contact.getCivilite()+" - "+contact.getPrenom()+" , "+contact.getNom());
	}
}