
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
 *         &lt;element name="divisionReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "divisionReturn"
})
@XmlRootElement(name = "divisionResponse")
public class DivisionResponse {

    protected double divisionReturn;

    /**
     * Gets the value of the divisionReturn property.
     * 
     */
    public double getDivisionReturn() {
        return divisionReturn;
    }

    /**
     * Sets the value of the divisionReturn property.
     * 
     */
    public void setDivisionReturn(double value) {
        this.divisionReturn = value;
    }

}
