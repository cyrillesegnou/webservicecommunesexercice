package fr.gtm.mains;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.gtm.webservice.ContactServiceWeb;
import fr.gtm.webservice.ContactServiceWebServiceLocator;

public class MainContactDelete {
	public static void main(String[] args) throws ServiceException, RemoteException {
		
		long idContact = 83;
		ContactServiceWebServiceLocator locator = new ContactServiceWebServiceLocator();
		ContactServiceWeb port = locator.getContactServiceWebPort();
		port.removeContact(idContact);
		System.out.println("le contact de correspondant à l'identifiant " +idContact+ " à été retité");
	
		
	}

}
