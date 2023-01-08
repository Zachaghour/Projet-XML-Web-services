
package com.zakaria.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for releve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="releve">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="operations" type="{http://ws.zakaria.com/}operations" minOccurs="0"/>
 *         <element name="RIB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "operations",
    "rib",
    "solde"
})
public class Releve {

    protected String dateReleve;
    protected Operations operations;
    @XmlElement(name = "RIB")
    protected Long rib;
    protected double solde;

    /**
     * Gets the value of the dateReleve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReleve() {
        return dateReleve;
    }

    /**
     * Sets the value of the dateReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReleve(String value) {
        this.dateReleve = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Gets the value of the rib property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRIB() {
        return rib;
    }

    /**
     * Sets the value of the rib property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRIB(Long value) {
        this.rib = value;
    }

    /**
     * Gets the value of the solde property.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

}
