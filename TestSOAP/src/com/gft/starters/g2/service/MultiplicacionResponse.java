
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
 *         &lt;element name="multiplicacionReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "multiplicacionReturn"
})
@XmlRootElement(name = "multiplicacionResponse")
public class MultiplicacionResponse {

    protected double multiplicacionReturn;

    /**
     * Gets the value of the multiplicacionReturn property.
     * 
     */
    public double getMultiplicacionReturn() {
        return multiplicacionReturn;
    }

    /**
     * Sets the value of the multiplicacionReturn property.
     * 
     */
    public void setMultiplicacionReturn(double value) {
        this.multiplicacionReturn = value;
    }

}
