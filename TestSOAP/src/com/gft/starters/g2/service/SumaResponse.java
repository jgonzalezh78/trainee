
package com.gft.starters.g2.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sumaReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sumaReturn"
})
@XmlRootElement(name = "sumaResponse")
public class SumaResponse {

    protected double sumaReturn;

    /**
     * Gets the value of the sumaReturn property.
     * 
     */
    public double getSumaReturn() {
        return sumaReturn;
    }

    /**
     * Sets the value of the sumaReturn property.
     * 
     */
    public void setSumaReturn(double value) {
        this.sumaReturn = value;
    }

}
