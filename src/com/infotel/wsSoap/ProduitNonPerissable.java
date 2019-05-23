
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour produitNonPerissable complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété modeDemploi.
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
     * Définit la valeur de la propriété modeDemploi.
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
