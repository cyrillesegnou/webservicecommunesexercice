/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.webservice;

public class Contact  implements java.io.Serializable {
    private fr.gtm.webservice.Adresse[] adresses;

    private fr.gtm.webservice.Civilite civilite;

    private long id;

    private java.lang.String nom;

    private java.lang.String prenom;

    public Contact() {
    }

    public Contact(Civilite civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

    public Contact(
           fr.gtm.webservice.Adresse[] adresses,
           fr.gtm.webservice.Civilite civilite,
           long id,
           java.lang.String nom,
           java.lang.String prenom) {
           this.adresses = adresses;
           this.civilite = civilite;
           this.id = id;
           this.nom = nom;
           this.prenom = prenom;
    }


    /**
     * Gets the adresses value for this Contact.
     * 
     * @return adresses
     */
    public fr.gtm.webservice.Adresse[] getAdresses() {
        return adresses;
    }


    /**
     * Sets the adresses value for this Contact.
     * 
     * @param adresses
     */
    public void setAdresses(fr.gtm.webservice.Adresse[] adresses) {
        this.adresses = adresses;
    }

    public fr.gtm.webservice.Adresse getAdresses(int i) {
        return this.adresses[i];
    }

    public void setAdresses(int i, fr.gtm.webservice.Adresse _value) {
        this.adresses[i] = _value;
    }


    /**
     * Gets the civilite value for this Contact.
     * 
     * @return civilite
     */
    public fr.gtm.webservice.Civilite getCivilite() {
        return civilite;
    }


    /**
     * Sets the civilite value for this Contact.
     * 
     * @param civilite
     */
    public void setCivilite(fr.gtm.webservice.Civilite civilite) {
        this.civilite = civilite;
    }


    /**
     * Gets the id value for this Contact.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Contact.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the nom value for this Contact.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Contact.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the prenom value for this Contact.
     * 
     * @return prenom
     */
    public java.lang.String getPrenom() {
        return prenom;
    }


    /**
     * Sets the prenom value for this Contact.
     * 
     * @param prenom
     */
    public void setPrenom(java.lang.String prenom) {
        this.prenom = prenom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adresses==null && other.getAdresses()==null) || 
             (this.adresses!=null &&
              java.util.Arrays.equals(this.adresses, other.getAdresses()))) &&
            ((this.civilite==null && other.getCivilite()==null) || 
             (this.civilite!=null &&
              this.civilite.equals(other.getCivilite()))) &&
            this.id == other.getId() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.prenom==null && other.getPrenom()==null) || 
             (this.prenom!=null &&
              this.prenom.equals(other.getPrenom())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCivilite() != null) {
            _hashCode += getCivilite().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getPrenom() != null) {
            _hashCode += getPrenom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.gtm.fr/", "contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.gtm.fr/", "adresse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("civilite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "civilite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.gtm.fr/", "civilite"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prenom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
