package fr.gtm.mains;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.gtm.webservice.Civilite;
import fr.gtm.webservice.Contact;
import fr.gtm.webservice.ContactServiceWeb;
import fr.gtm.webservice.ContactServiceWebServiceLocator;

public class MainContactupdate {
	public static void main(String[] args) throws RemoteException, ServiceException {
		
			long id= 20;
			ContactServiceWebServiceLocator locator = new ContactServiceWebServiceLocator();
			ContactServiceWeb port = locator.getContactServiceWebPort();
			Contact contact = new Contact(Civilite.Dr,"Cyrille","SEGNOU");
			
			contact.setId(id);
			port.updateContact(contact);
			System.out.println("vous avez modifier le contact d'identifiant :" + contact.getId());

		}
		
		
	}


