package fr.gtm.webservice;

public class ContactServiceWebProxy implements fr.gtm.webservice.ContactServiceWeb {
  private String _endpoint = null;
  private fr.gtm.webservice.ContactServiceWeb contactServiceWeb = null;
  
  public ContactServiceWebProxy() {
    _initContactServiceWebProxy();
  }
  
  public ContactServiceWebProxy(String endpoint) {
    _endpoint = endpoint;
    _initContactServiceWebProxy();
  }
  
  private void _initContactServiceWebProxy() {
    try {
      contactServiceWeb = (new fr.gtm.webservice.ContactServiceWebServiceLocator()).getContactServiceWebPort();
      if (contactServiceWeb != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contactServiceWeb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contactServiceWeb)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contactServiceWeb != null)
      ((javax.xml.rpc.Stub)contactServiceWeb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.gtm.webservice.ContactServiceWeb getContactServiceWeb() {
    if (contactServiceWeb == null)
      _initContactServiceWebProxy();
    return contactServiceWeb;
  }
  
  public void updateContact(fr.gtm.webservice.Contact arg0) throws java.rmi.RemoteException{
    if (contactServiceWeb == null)
      _initContactServiceWebProxy();
    contactServiceWeb.updateContact(arg0);
  }
  
  public void saveContact(fr.gtm.webservice.Contact arg0) throws java.rmi.RemoteException{
    if (contactServiceWeb == null)
      _initContactServiceWebProxy();
    contactServiceWeb.saveContact(arg0);
  }
  
  public fr.gtm.webservice.Contact findContactById(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (contactServiceWeb == null)
      _initContactServiceWebProxy();
    return contactServiceWeb.findContactById(arg0);
  }
  
  public fr.gtm.webservice.Contact removeContact(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (contactServiceWeb == null)
      _initContactServiceWebProxy();
    return contactServiceWeb.removeContact(arg0);
  }
  
  
}