
package com.infotel.wsSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour produit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="produit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProduit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomProduit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="magasin" type="{http://wsSoap.infotel.com/}magasin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produit", propOrder = {
    "idProduit",
    "nomProduit",
    "stock",
    "prix",
    "magasin"
})
@XmlSeeAlso({
    ProduitNonPerissable.class,
    ProduitPerissable.class
})
public abstract class Produit {

    protected long idProduit;
    protected String nomProduit;
    protected int stock;
    protected double prix;
    protected Magasin magasin;

    /**
     * Obtient la valeur de la propriété idProduit.
     * 
     */
    public long getIdProduit() {
        return idProduit;
    }

    /**
     * Définit la valeur de la propriété idProduit.
     * 
     */
    public void setIdProduit(long value) {
        this.idProduit = value;
    }

    /**
     * Obtient la valeur de la propriété nomProduit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomProduit() {
        return nomProduit;
    }

    /**
     * Définit la valeur de la propriété nomProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomProduit(String value) {
        this.nomProduit = value;
    }

    /**
     * Obtient la valeur de la propriété stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Définit la valeur de la propriété stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété magasin.
     * 
     * @return
     *     possible object is
     *     {@link Magasin }
     *     
     */
    public Magasin getMagasin() {
        return magasin;
    }

    /**
     * Définit la valeur de la propriété magasin.
     * 
     * @param value
     *     allowed object is
     *     {@link Magasin }
     *     
     */
    public void setMagasin(Magasin value) {
        this.magasin = value;
    }

}
