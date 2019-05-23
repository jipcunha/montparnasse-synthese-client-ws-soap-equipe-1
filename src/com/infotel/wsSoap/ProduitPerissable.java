
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour produitPerissable complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="produitPerissable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsSoap.infotel.com/}produit">
 *       &lt;sequence>
 *         &lt;element name="dateLimiteUtilisation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produitPerissable", propOrder = {
    "dateLimiteUtilisation"
})
public class ProduitPerissable
    extends Produit
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLimiteUtilisation;

    /**
     * Obtient la valeur de la propri�t� dateLimiteUtilisation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLimiteUtilisation() {
        return dateLimiteUtilisation;
    }

    /**
     * D�finit la valeur de la propri�t� dateLimiteUtilisation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLimiteUtilisation(XMLGregorianCalendar value) {
        this.dateLimiteUtilisation = value;
    }

}
