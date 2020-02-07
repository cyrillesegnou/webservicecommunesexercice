/**
 * ContactServiceWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.webservice;

public interface ContactServiceWebService extends javax.xml.rpc.Service {
    public java.lang.String getContactServiceWebPortAddress();

    public fr.gtm.webservice.ContactServiceWeb getContactServiceWebPort() throws javax.xml.rpc.ServiceException;

    public fr.gtm.webservice.ContactServiceWeb getContactServiceWebPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
