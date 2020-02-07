package fr.gtm.mains;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.gtm.webservice.Civilite;
import fr.gtm.webservice.Contact;
import fr.gtm.webservice.ContactServiceWeb;
import fr.gtm.webservice.ContactServiceWebServiceLocator;

public class MainContactSave {
	public static void main(String[] args) throws RemoteException, ServiceException {
		
		
		ContactServiceWebServiceLocator locator = new ContactServiceWebServiceLocator();
		ContactServiceWeb port = locator.getContactServiceWebPort();
		Contact contact = new Contact(Civilite.M,"SEGNOU","Cyrille");
		port.saveContact(contact);;
		System.out.println("vous venez d'enregistrer le contact : " + contact.getPrenom() 
							+" "+ contact.getNom() + " sous l'indetifiant" + contact.getId());

	
	}

}
