
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour calculPrixMagasin complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="calculPrixMagasin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMagasin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculPrixMagasin", propOrder = {
    "idMagasin"
})
public class CalculPrixMagasin {

    protected Long idMagasin;

    /**
     * Obtient la valeur de la propri�t� idMagasin.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMagasin() {
        return idMagasin;
    }

    /**
     * D�finit la valeur de la propri�t� idMagasin.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMagasin(Long value) {
        this.idMagasin = value;
    }

}
