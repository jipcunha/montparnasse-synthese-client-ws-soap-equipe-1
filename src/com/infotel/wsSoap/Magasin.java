
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour magasin complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="magasin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMagasin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomMagasin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeMagasin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prixDuLocal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "magasin", propOrder = {
    "idMagasin",
    "nomMagasin",
    "codeMagasin",
    "prixDuLocal"
})
public class Magasin {

    protected long idMagasin;
    protected String nomMagasin;
    protected int codeMagasin;
    protected double prixDuLocal;

    /**
     * Obtient la valeur de la propri�t� idMagasin.
     * 
     */
    public long getIdMagasin() {
        return idMagasin;
    }

    /**
     * D�finit la valeur de la propri�t� idMagasin.
     * 
     */
    public void setIdMagasin(long value) {
        this.idMagasin = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomMagasin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMagasin() {
        return nomMagasin;
    }

    /**
     * D�finit la valeur de la propri�t� nomMagasin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMagasin(String value) {
        this.nomMagasin = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeMagasin.
     * 
     */
    public int getCodeMagasin() {
        return codeMagasin;
    }

    /**
     * D�finit la valeur de la propri�t� codeMagasin.
     * 
     */
    public void setCodeMagasin(int value) {
        this.codeMagasin = value;
    }

    /**
     * Obtient la valeur de la propri�t� prixDuLocal.
     * 
     */
    public double getPrixDuLocal() {
        return prixDuLocal;
    }

    /**
     * D�finit la valeur de la propri�t� prixDuLocal.
     * 
     */
    public void setPrixDuLocal(double value) {
        this.prixDuLocal = value;
    }

}
