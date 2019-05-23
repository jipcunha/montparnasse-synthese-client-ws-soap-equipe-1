
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getMagasin complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getMagasin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMagasin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMagasin", propOrder = {
    "idMagasin"
})
public class GetMagasin {

    protected long idMagasin;

    /**
     * Obtient la valeur de la propriété idMagasin.
     * 
     */
    public long getIdMagasin() {
        return idMagasin;
    }

    /**
     * Définit la valeur de la propriété idMagasin.
     * 
     */
    public void setIdMagasin(long value) {
        this.idMagasin = value;
    }

}
