/**
 * Adresse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.webservice;

public class Adresse  implements java.io.Serializable {
    private java.lang.String code_postal;

    private long id;

    private java.lang.String pays;

    private java.lang.String rue;

    private java.lang.String ville;

    public Adresse() {
    }

    public Adresse(
           java.lang.String code_postal,
           long id,
           java.lang.String pays,
           java.lang.String rue,
           java.lang.String ville) {
           this.code_postal = code_postal;
           this.id = id;
           this.pays = pays;
           this.rue = rue;
           this.ville = ville;
    }


    /**
     * Gets the code_postal value for this Adresse.
     * 
     * @return code_postal
     */
    public java.lang.String getCode_postal() {
        return code_postal;
    }


    /**
     * Sets the code_postal value for this Adresse.
     * 
     * @param code_postal
     */
    public void setCode_postal(java.lang.String code_postal) {
        this.code_postal = code_postal;
    }


    /**
     * Gets the id value for this Adresse.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Adresse.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the pays value for this Adresse.
     * 
     * @return pays
     */
    public java.lang.String getPays() {
        return pays;
    }


    /**
     * Sets the pays value for this Adresse.
     * 
     * @param pays
     */
    public void setPays(java.lang.String pays) {
        this.pays = pays;
    }


    /**
     * Gets the rue value for this Adresse.
     * 
     * @return rue
     */
    public java.lang.String getRue() {
        return rue;
    }


    /**
     * Sets the rue value for this Adresse.
     * 
     * @param rue
     */
    public void setRue(java.lang.String rue) {
        this.rue = rue;
    }


    /**
     * Gets the ville value for this Adresse.
     * 
     * @return ville
     */
    public java.lang.String getVille() {
        return ville;
    }


    /**
     * Sets the ville value for this Adresse.
     * 
     * @param ville
     */
    public void setVille(java.lang.String ville) {
        this.ville = ville;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Adresse)) return false;
        Adresse other = (Adresse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code_postal==null && other.getCode_postal()==null) || 
             (this.code_postal!=null &&
              this.code_postal.equals(other.getCode_postal()))) &&
            this.id == other.getId() &&
            ((this.pays==null && other.getPays()==null) || 
             (this.pays!=null &&
              this.pays.equals(other.getPays()))) &&
            ((this.rue==null && other.getRue()==null) || 
             (this.rue!=null &&
              this.rue.equals(other.getRue()))) &&
            ((this.ville==null && other.getVille()==null) || 
             (this.ville!=null &&
              this.ville.equals(other.getVille())));
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
        if (getCode_postal() != null) {
            _hashCode += getCode_postal().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getPays() != null) {
            _hashCode += getPays().hashCode();
        }
        if (getRue() != null) {
            _hashCode += getRue().hashCode();
        }
        if (getVille() != null) {
            _hashCode += getVille().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Adresse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.gtm.fr/", "adresse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code_postal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code_postal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ville");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ville"));
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
