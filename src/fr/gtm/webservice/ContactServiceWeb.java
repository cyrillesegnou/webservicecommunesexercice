/**
 * ContactServiceWeb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.webservice;

public interface ContactServiceWeb extends java.rmi.Remote {
    public void updateContact(fr.gtm.webservice.Contact arg0) throws java.rmi.RemoteException;
    public void saveContact(fr.gtm.webservice.Contact arg0) throws java.rmi.RemoteException;
    public fr.gtm.webservice.Contact findContactById(java.lang.Long arg0) throws java.rmi.RemoteException;
    public fr.gtm.webservice.Contact removeContact(java.lang.Long arg0) throws java.rmi.RemoteException;
}
