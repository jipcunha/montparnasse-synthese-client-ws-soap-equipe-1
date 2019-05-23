
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour produitNonPerissable complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="produitNonPerissable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsSoap.infotel.com/}produit">
 *       &lt;sequence>
 *         &lt;element name="modeDemploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produitNonPerissable", propOrder = {
    "modeDemploi"
})
public class ProduitNonPerissable
    extends Produit
{

    protected String modeDemploi;

    /**
     * Obtient la valeur de la propri�t� modeDemploi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeDemploi() {
        return modeDemploi;
    }

    /**
     * D�finit la valeur de la propri�t� modeDemploi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeDemploi(String value) {
        this.modeDemploi = value;
    }

}
