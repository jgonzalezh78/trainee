
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
 *         &lt;element name="operador1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operador2" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "operador1",
    "operador2"
})
@XmlRootElement(name = "multiplicacion")
public class Multiplicacion {

    protected double operador1;
    protected double operador2;

    /**
     * Gets the value of the operador1 property.
     * 
     */
    public double getOperador1() {
        return operador1;
    }

    /**
     * Sets the value of the operador1 property.
     * 
     */
    public void setOperador1(double value) {
        this.operador1 = value;
    }

    /**
     * Gets the value of the operador2 property.
     * 
     */
    public double getOperador2() {
        return operador2;
    }

    /**
     * Sets the value of the operador2 property.
     * 
     */
    public void setOperador2(double value) {
        this.operador2 = value;
    }

}
