
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ajouterProduitNonPerissableMagasin complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ajouterProduitNonPerissableMagasin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ajouterProduitNonPerissableMagasin", propOrder = {
    "nom",
    "stock",
    "prix",
    "mode",
    "idMagasin"
})
public class AjouterProduitNonPerissableMagasin {

    protected String nom;
    protected int stock;
    protected double prix;
    protected String mode;
    protected Long idMagasin;

    /**
     * Obtient la valeur de la propri�t� nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * D�finit la valeur de la propri�t� nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propri�t� stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * D�finit la valeur de la propri�t� stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Obtient la valeur de la propri�t� prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propri�t� mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * D�finit la valeur de la propri�t� mode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

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
