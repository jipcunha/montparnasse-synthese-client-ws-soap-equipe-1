
package com.infotel.wsSoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AjouterProdPerissable_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProdPerissable");
    private final static QName _GetProduitResponse_QNAME = new QName("http://wsSoap.infotel.com/", "getProduitResponse");
    private final static QName _GetMagasin_QNAME = new QName("http://wsSoap.infotel.com/", "getMagasin");
    private final static QName _ModifierProdNonPerissable_QNAME = new QName("http://wsSoap.infotel.com/", "modifierProdNonPerissable");
    private final static QName _ModifierProdPerissable_QNAME = new QName("http://wsSoap.infotel.com/", "modifierProdPerissable");
    private final static QName _Magasin_QNAME = new QName("http://wsSoap.infotel.com/", "magasin");
    private final static QName _AjouterProdNonPerissableResponse_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProdNonPerissableResponse");
    private final static QName _GetAllMagasins_QNAME = new QName("http://wsSoap.infotel.com/", "getAllMagasins");
    private final static QName _ModifierMagasin_QNAME = new QName("http://wsSoap.infotel.com/", "modifierMagasin");
    private final static QName _ModifierProdNonPerissableResponse_QNAME = new QName("http://wsSoap.infotel.com/", "modifierProdNonPerissableResponse");
    private final static QName _SupprimerMagasinResponse_QNAME = new QName("http://wsSoap.infotel.com/", "supprimerMagasinResponse");
    private final static QName _AjouterProdNonPerissable_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProdNonPerissable");
    private final static QName _AjouterProduitPerissableMagasinResponse_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProduitPerissableMagasinResponse");
    private final static QName _AjouterMagasin_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterMagasin");
    private final static QName _ModifierMagasinResponse_QNAME = new QName("http://wsSoap.infotel.com/", "modifierMagasinResponse");
    private final static QName _CalculPrixMagasin_QNAME = new QName("http://wsSoap.infotel.com/", "calculPrixMagasin");
    private final static QName _GetAllMagasinsResponse_QNAME = new QName("http://wsSoap.infotel.com/", "getAllMagasinsResponse");
    private final static QName _Produit_QNAME = new QName("http://wsSoap.infotel.com/", "produit");
    private final static QName _GetMagasinResponse_QNAME = new QName("http://wsSoap.infotel.com/", "getMagasinResponse");
    private final static QName _AjouterProduitPerissableMagasin_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProduitPerissableMagasin");
    private final static QName _AjouterProdPerissableResponse_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProdPerissableResponse");
    private final static QName _GetProduit_QNAME = new QName("http://wsSoap.infotel.com/", "getProduit");
    private final static QName _GetAllProduits_QNAME = new QName("http://wsSoap.infotel.com/", "getAllProduits");
    private final static QName _SupprimerProduit_QNAME = new QName("http://wsSoap.infotel.com/", "supprimerProduit");
    private final static QName _SupprimerMagasin_QNAME = new QName("http://wsSoap.infotel.com/", "supprimerMagasin");
    private final static QName _AjouterProduitNonPerissableMagasinResponse_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProduitNonPerissableMagasinResponse");
    private final static QName _ModifierProdPerissableResponse_QNAME = new QName("http://wsSoap.infotel.com/", "modifierProdPerissableResponse");
    private final static QName _CalculPrixMagasinResponse_QNAME = new QName("http://wsSoap.infotel.com/", "calculPrixMagasinResponse");
    private final static QName _AjouterMagasinResponse_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterMagasinResponse");
    private final static QName _AjouterProduitNonPerissableMagasin_QNAME = new QName("http://wsSoap.infotel.com/", "ajouterProduitNonPerissableMagasin");
    private final static QName _SupprimerProduitResponse_QNAME = new QName("http://wsSoap.infotel.com/", "supprimerProduitResponse");
    private final static QName _GetAllProduitsResponse_QNAME = new QName("http://wsSoap.infotel.com/", "getAllProduitsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifierProdNonPerissable }
     * 
     */
    public ModifierProdNonPerissable createModifierProdNonPerissable() {
        return new ModifierProdNonPerissable();
    }

    /**
     * Create an instance of {@link ModifierProdPerissable }
     * 
     */
    public ModifierProdPerissable createModifierProdPerissable() {
        return new ModifierProdPerissable();
    }

    /**
     * Create an instance of {@link AjouterProdPerissable }
     * 
     */
    public AjouterProdPerissable createAjouterProdPerissable() {
        return new AjouterProdPerissable();
    }

    /**
     * Create an instance of {@link GetProduitResponse }
     * 
     */
    public GetProduitResponse createGetProduitResponse() {
        return new GetProduitResponse();
    }

    /**
     * Create an instance of {@link GetMagasin }
     * 
     */
    public GetMagasin createGetMagasin() {
        return new GetMagasin();
    }

    /**
     * Create an instance of {@link AjouterProdNonPerissableResponse }
     * 
     */
    public AjouterProdNonPerissableResponse createAjouterProdNonPerissableResponse() {
        return new AjouterProdNonPerissableResponse();
    }

    /**
     * Create an instance of {@link GetAllMagasins }
     * 
     */
    public GetAllMagasins createGetAllMagasins() {
        return new GetAllMagasins();
    }

    /**
     * Create an instance of {@link Magasin }
     * 
     */
    public Magasin createMagasin() {
        return new Magasin();
    }

    /**
     * Create an instance of {@link ModifierProdNonPerissableResponse }
     * 
     */
    public ModifierProdNonPerissableResponse createModifierProdNonPerissableResponse() {
        return new ModifierProdNonPerissableResponse();
    }

    /**
     * Create an instance of {@link SupprimerMagasinResponse }
     * 
     */
    public SupprimerMagasinResponse createSupprimerMagasinResponse() {
        return new SupprimerMagasinResponse();
    }

    /**
     * Create an instance of {@link ModifierMagasin }
     * 
     */
    public ModifierMagasin createModifierMagasin() {
        return new ModifierMagasin();
    }

    /**
     * Create an instance of {@link AjouterMagasin }
     * 
     */
    public AjouterMagasin createAjouterMagasin() {
        return new AjouterMagasin();
    }

    /**
     * Create an instance of {@link AjouterProdNonPerissable }
     * 
     */
    public AjouterProdNonPerissable createAjouterProdNonPerissable() {
        return new AjouterProdNonPerissable();
    }

    /**
     * Create an instance of {@link AjouterProduitPerissableMagasinResponse }
     * 
     */
    public AjouterProduitPerissableMagasinResponse createAjouterProduitPerissableMagasinResponse() {
        return new AjouterProduitPerissableMagasinResponse();
    }

    /**
     * Create an instance of {@link AjouterProduitPerissableMagasin }
     * 
     */
    public AjouterProduitPerissableMagasin createAjouterProduitPerissableMagasin() {
        return new AjouterProduitPerissableMagasin();
    }

    /**
     * Create an instance of {@link CalculPrixMagasin }
     * 
     */
    public CalculPrixMagasin createCalculPrixMagasin() {
        return new CalculPrixMagasin();
    }

    /**
     * Create an instance of {@link GetAllMagasinsResponse }
     * 
     */
    public GetAllMagasinsResponse createGetAllMagasinsResponse() {
        return new GetAllMagasinsResponse();
    }

    /**
     * Create an instance of {@link ModifierMagasinResponse }
     * 
     */
    public ModifierMagasinResponse createModifierMagasinResponse() {
        return new ModifierMagasinResponse();
    }

    /**
     * Create an instance of {@link GetMagasinResponse }
     * 
     */
    public GetMagasinResponse createGetMagasinResponse() {
        return new GetMagasinResponse();
    }

    /**
     * Create an instance of {@link GetProduit }
     * 
     */
    public GetProduit createGetProduit() {
        return new GetProduit();
    }

    /**
     * Create an instance of {@link AjouterProdPerissableResponse }
     * 
     */
    public AjouterProdPerissableResponse createAjouterProdPerissableResponse() {
        return new AjouterProdPerissableResponse();
    }

    /**
     * Create an instance of {@link GetAllProduits }
     * 
     */
    public GetAllProduits createGetAllProduits() {
        return new GetAllProduits();
    }

    /**
     * Create an instance of {@link SupprimerProduit }
     * 
     */
    public SupprimerProduit createSupprimerProduit() {
        return new SupprimerProduit();
    }

    /**
     * Create an instance of {@link CalculPrixMagasinResponse }
     * 
     */
    public CalculPrixMagasinResponse createCalculPrixMagasinResponse() {
        return new CalculPrixMagasinResponse();
    }

    /**
     * Create an instance of {@link AjouterProduitNonPerissableMagasinResponse }
     * 
     */
    public AjouterProduitNonPerissableMagasinResponse createAjouterProduitNonPerissableMagasinResponse() {
        return new AjouterProduitNonPerissableMagasinResponse();
    }

    /**
     * Create an instance of {@link ModifierProdPerissableResponse }
     * 
     */
    public ModifierProdPerissableResponse createModifierProdPerissableResponse() {
        return new ModifierProdPerissableResponse();
    }

    /**
     * Create an instance of {@link SupprimerMagasin }
     * 
     */
    public SupprimerMagasin createSupprimerMagasin() {
        return new SupprimerMagasin();
    }

    /**
     * Create an instance of {@link GetAllProduitsResponse }
     * 
     */
    public GetAllProduitsResponse createGetAllProduitsResponse() {
        return new GetAllProduitsResponse();
    }

    /**
     * Create an instance of {@link AjouterProduitNonPerissableMagasin }
     * 
     */
    public AjouterProduitNonPerissableMagasin createAjouterProduitNonPerissableMagasin() {
        return new AjouterProduitNonPerissableMagasin();
    }

    /**
     * Create an instance of {@link AjouterMagasinResponse }
     * 
     */
    public AjouterMagasinResponse createAjouterMagasinResponse() {
        return new AjouterMagasinResponse();
    }

    /**
     * Create an instance of {@link SupprimerProduitResponse }
     * 
     */
    public SupprimerProduitResponse createSupprimerProduitResponse() {
        return new SupprimerProduitResponse();
    }

    /**
     * Create an instance of {@link ProduitNonPerissable }
     * 
     */
    public ProduitNonPerissable createProduitNonPerissable() {
        return new ProduitNonPerissable();
    }

    /**
     * Create an instance of {@link ProduitPerissable }
     * 
     */
    public ProduitPerissable createProduitPerissable() {
        return new ProduitPerissable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProdPerissable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProdPerissable")
    public JAXBElement<AjouterProdPerissable> createAjouterProdPerissable(AjouterProdPerissable value) {
        return new JAXBElement<AjouterProdPerissable>(_AjouterProdPerissable_QNAME, AjouterProdPerissable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getProduitResponse")
    public JAXBElement<GetProduitResponse> createGetProduitResponse(GetProduitResponse value) {
        return new JAXBElement<GetProduitResponse>(_GetProduitResponse_QNAME, GetProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getMagasin")
    public JAXBElement<GetMagasin> createGetMagasin(GetMagasin value) {
        return new JAXBElement<GetMagasin>(_GetMagasin_QNAME, GetMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierProdNonPerissable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "modifierProdNonPerissable")
    public JAXBElement<ModifierProdNonPerissable> createModifierProdNonPerissable(ModifierProdNonPerissable value) {
        return new JAXBElement<ModifierProdNonPerissable>(_ModifierProdNonPerissable_QNAME, ModifierProdNonPerissable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierProdPerissable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "modifierProdPerissable")
    public JAXBElement<ModifierProdPerissable> createModifierProdPerissable(ModifierProdPerissable value) {
        return new JAXBElement<ModifierProdPerissable>(_ModifierProdPerissable_QNAME, ModifierProdPerissable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Magasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "magasin")
    public JAXBElement<Magasin> createMagasin(Magasin value) {
        return new JAXBElement<Magasin>(_Magasin_QNAME, Magasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProdNonPerissableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProdNonPerissableResponse")
    public JAXBElement<AjouterProdNonPerissableResponse> createAjouterProdNonPerissableResponse(AjouterProdNonPerissableResponse value) {
        return new JAXBElement<AjouterProdNonPerissableResponse>(_AjouterProdNonPerissableResponse_QNAME, AjouterProdNonPerissableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMagasins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getAllMagasins")
    public JAXBElement<GetAllMagasins> createGetAllMagasins(GetAllMagasins value) {
        return new JAXBElement<GetAllMagasins>(_GetAllMagasins_QNAME, GetAllMagasins.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "modifierMagasin")
    public JAXBElement<ModifierMagasin> createModifierMagasin(ModifierMagasin value) {
        return new JAXBElement<ModifierMagasin>(_ModifierMagasin_QNAME, ModifierMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierProdNonPerissableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "modifierProdNonPerissableResponse")
    public JAXBElement<ModifierProdNonPerissableResponse> createModifierProdNonPerissableResponse(ModifierProdNonPerissableResponse value) {
        return new JAXBElement<ModifierProdNonPerissableResponse>(_ModifierProdNonPerissableResponse_QNAME, ModifierProdNonPerissableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "supprimerMagasinResponse")
    public JAXBElement<SupprimerMagasinResponse> createSupprimerMagasinResponse(SupprimerMagasinResponse value) {
        return new JAXBElement<SupprimerMagasinResponse>(_SupprimerMagasinResponse_QNAME, SupprimerMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProdNonPerissable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProdNonPerissable")
    public JAXBElement<AjouterProdNonPerissable> createAjouterProdNonPerissable(AjouterProdNonPerissable value) {
        return new JAXBElement<AjouterProdNonPerissable>(_AjouterProdNonPerissable_QNAME, AjouterProdNonPerissable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProduitPerissableMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProduitPerissableMagasinResponse")
    public JAXBElement<AjouterProduitPerissableMagasinResponse> createAjouterProduitPerissableMagasinResponse(AjouterProduitPerissableMagasinResponse value) {
        return new JAXBElement<AjouterProduitPerissableMagasinResponse>(_AjouterProduitPerissableMagasinResponse_QNAME, AjouterProduitPerissableMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterMagasin")
    public JAXBElement<AjouterMagasin> createAjouterMagasin(AjouterMagasin value) {
        return new JAXBElement<AjouterMagasin>(_AjouterMagasin_QNAME, AjouterMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "modifierMagasinResponse")
    public JAXBElement<ModifierMagasinResponse> createModifierMagasinResponse(ModifierMagasinResponse value) {
        return new JAXBElement<ModifierMagasinResponse>(_ModifierMagasinResponse_QNAME, ModifierMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculPrixMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "calculPrixMagasin")
    public JAXBElement<CalculPrixMagasin> createCalculPrixMagasin(CalculPrixMagasin value) {
        return new JAXBElement<CalculPrixMagasin>(_CalculPrixMagasin_QNAME, CalculPrixMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMagasinsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getAllMagasinsResponse")
    public JAXBElement<GetAllMagasinsResponse> createGetAllMagasinsResponse(GetAllMagasinsResponse value) {
        return new JAXBElement<GetAllMagasinsResponse>(_GetAllMagasinsResponse_QNAME, GetAllMagasinsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "produit")
    public JAXBElement<Produit> createProduit(Produit value) {
        return new JAXBElement<Produit>(_Produit_QNAME, Produit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getMagasinResponse")
    public JAXBElement<GetMagasinResponse> createGetMagasinResponse(GetMagasinResponse value) {
        return new JAXBElement<GetMagasinResponse>(_GetMagasinResponse_QNAME, GetMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProduitPerissableMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProduitPerissableMagasin")
    public JAXBElement<AjouterProduitPerissableMagasin> createAjouterProduitPerissableMagasin(AjouterProduitPerissableMagasin value) {
        return new JAXBElement<AjouterProduitPerissableMagasin>(_AjouterProduitPerissableMagasin_QNAME, AjouterProduitPerissableMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProdPerissableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProdPerissableResponse")
    public JAXBElement<AjouterProdPerissableResponse> createAjouterProdPerissableResponse(AjouterProdPerissableResponse value) {
        return new JAXBElement<AjouterProdPerissableResponse>(_AjouterProdPerissableResponse_QNAME, AjouterProdPerissableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getProduit")
    public JAXBElement<GetProduit> createGetProduit(GetProduit value) {
        return new JAXBElement<GetProduit>(_GetProduit_QNAME, GetProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getAllProduits")
    public JAXBElement<GetAllProduits> createGetAllProduits(GetAllProduits value) {
        return new JAXBElement<GetAllProduits>(_GetAllProduits_QNAME, GetAllProduits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerProduit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "supprimerProduit")
    public JAXBElement<SupprimerProduit> createSupprimerProduit(SupprimerProduit value) {
        return new JAXBElement<SupprimerProduit>(_SupprimerProduit_QNAME, SupprimerProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "supprimerMagasin")
    public JAXBElement<SupprimerMagasin> createSupprimerMagasin(SupprimerMagasin value) {
        return new JAXBElement<SupprimerMagasin>(_SupprimerMagasin_QNAME, SupprimerMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProduitNonPerissableMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProduitNonPerissableMagasinResponse")
    public JAXBElement<AjouterProduitNonPerissableMagasinResponse> createAjouterProduitNonPerissableMagasinResponse(AjouterProduitNonPerissableMagasinResponse value) {
        return new JAXBElement<AjouterProduitNonPerissableMagasinResponse>(_AjouterProduitNonPerissableMagasinResponse_QNAME, AjouterProduitNonPerissableMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierProdPerissableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "modifierProdPerissableResponse")
    public JAXBElement<ModifierProdPerissableResponse> createModifierProdPerissableResponse(ModifierProdPerissableResponse value) {
        return new JAXBElement<ModifierProdPerissableResponse>(_ModifierProdPerissableResponse_QNAME, ModifierProdPerissableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculPrixMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "calculPrixMagasinResponse")
    public JAXBElement<CalculPrixMagasinResponse> createCalculPrixMagasinResponse(CalculPrixMagasinResponse value) {
        return new JAXBElement<CalculPrixMagasinResponse>(_CalculPrixMagasinResponse_QNAME, CalculPrixMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterMagasinResponse")
    public JAXBElement<AjouterMagasinResponse> createAjouterMagasinResponse(AjouterMagasinResponse value) {
        return new JAXBElement<AjouterMagasinResponse>(_AjouterMagasinResponse_QNAME, AjouterMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterProduitNonPerissableMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "ajouterProduitNonPerissableMagasin")
    public JAXBElement<AjouterProduitNonPerissableMagasin> createAjouterProduitNonPerissableMagasin(AjouterProduitNonPerissableMagasin value) {
        return new JAXBElement<AjouterProduitNonPerissableMagasin>(_AjouterProduitNonPerissableMagasin_QNAME, AjouterProduitNonPerissableMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerProduitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "supprimerProduitResponse")
    public JAXBElement<SupprimerProduitResponse> createSupprimerProduitResponse(SupprimerProduitResponse value) {
        return new JAXBElement<SupprimerProduitResponse>(_SupprimerProduitResponse_QNAME, SupprimerProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSoap.infotel.com/", name = "getAllProduitsResponse")
    public JAXBElement<GetAllProduitsResponse> createGetAllProduitsResponse(GetAllProduitsResponse value) {
        return new JAXBElement<GetAllProduitsResponse>(_GetAllProduitsResponse_QNAME, GetAllProduitsResponse.class, null, value);
    }

}
