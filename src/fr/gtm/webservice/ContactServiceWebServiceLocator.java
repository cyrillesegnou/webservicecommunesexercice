/**
 * ContactServiceWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.webservice;

public class ContactServiceWebServiceLocator extends org.apache.axis.client.Service implements fr.gtm.webservice.ContactServiceWebService {

    public ContactServiceWebServiceLocator() {
    }


    public ContactServiceWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContactServiceWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContactServiceWebPort
    private java.lang.String ContactServiceWebPort_address = "http://localhost:8080/webservicesontactwildfly/ContactServiceWeb";

    public java.lang.String getContactServiceWebPortAddress() {
        return ContactServiceWebPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContactServiceWebPortWSDDServiceName = "ContactServiceWebPort";

    public java.lang.String getContactServiceWebPortWSDDServiceName() {
        return ContactServiceWebPortWSDDServiceName;
    }

    public void setContactServiceWebPortWSDDServiceName(java.lang.String name) {
        ContactServiceWebPortWSDDServiceName = name;
    }

    public fr.gtm.webservice.ContactServiceWeb getContactServiceWebPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContactServiceWebPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContactServiceWebPort(endpoint);
    }

    public fr.gtm.webservice.ContactServiceWeb getContactServiceWebPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.gtm.webservice.ContactServiceWebServiceSoapBindingStub _stub = new fr.gtm.webservice.ContactServiceWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getContactServiceWebPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContactServiceWebPortEndpointAddress(java.lang.String address) {
        ContactServiceWebPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.gtm.webservice.ContactServiceWeb.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.gtm.webservice.ContactServiceWebServiceSoapBindingStub _stub = new fr.gtm.webservice.ContactServiceWebServiceSoapBindingStub(new java.net.URL(ContactServiceWebPort_address), this);
                _stub.setPortName(getContactServiceWebPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ContactServiceWebPort".equals(inputPortName)) {
            return getContactServiceWebPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.gtm.fr/", "ContactServiceWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.gtm.fr/", "ContactServiceWebPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContactServiceWebPort".equals(portName)) {
            setContactServiceWebPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
