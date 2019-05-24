package com.infotel.wsSoap;

public class ProduitSOAPServiceProxy implements com.infotel.wsSoap.ProduitSOAPService {
  private String _endpoint = null;
  private com.infotel.wsSoap.ProduitSOAPService produitSOAPService = null;
  
  public ProduitSOAPServiceProxy() {
    _initProduitSOAPServiceProxy();
  }
  
  public ProduitSOAPServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProduitSOAPServiceProxy();
  }
  
  private void _initProduitSOAPServiceProxy() {
    try {
      produitSOAPService = (new com.infotel.wsSoap.ProduitSOAPServiceServiceLocator()).getProduitSOAPServicePort();
      if (produitSOAPService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)produitSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)produitSOAPService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (produitSOAPService != null)
      ((javax.xml.rpc.Stub)produitSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.infotel.wsSoap.ProduitSOAPService getProduitSOAPService() {
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService;
  }
  
  public void ajouterProdPerissable(java.lang.String nom, int stock, double prix, java.util.Calendar date) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProdPerissable(nom, stock, prix, date);
  }
  
  public double calculPrixMagasin(java.lang.Long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.calculPrixMagasin(idMagasin);
  }
  
  public com.infotel.wsSoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getMagasin(idMagasin);
  }
  
  public void ajouterProduitPerissableMagasin(java.lang.String nom, int stock, double prix, java.util.Calendar date, java.lang.Long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProduitPerissableMagasin(nom, stock, prix, date, idMagasin);
  }
  
  public com.infotel.wsSoap.Produit modifierProdNonPerissable(java.lang.Long id, java.lang.String nom, int stock, double prix, java.lang.String mode) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.modifierProdNonPerissable(id, nom, stock, prix, mode);
  }
  
  public com.infotel.wsSoap.Produit modifierProdPerissable(java.lang.Long id, java.lang.String nom, int stock, double prix, java.util.Calendar date) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.modifierProdPerissable(id, nom, stock, prix, date);
  }
  
  public com.infotel.wsSoap.Produit getProduit(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getProduit(idProduit);
  }
  
  public com.infotel.wsSoap.Magasin[] getAllMagasins() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getAllMagasins();
  }
  
  public com.infotel.wsSoap.Produit[] getAllProduits() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getAllProduits();
  }
  
  public void supprimerProduit(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.supprimerProduit(idProduit);
  }
  
  public void supprimerMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.supprimerMagasin(idMagasin);
  }
  
  public com.infotel.wsSoap.Magasin modifierMagasin(java.lang.Long id, java.lang.String nom, int code, double prix) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.modifierMagasin(id, nom, code, prix);
  }
  
  public void ajouterProdNonPerissable(java.lang.String nom, int stock, double prix, java.lang.String mode) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProdNonPerissable(nom, stock, prix, mode);
  }
  
  public void ajouterProduitNonPerissableMagasin(java.lang.String nom, int stock, double prix, java.lang.String mode, java.lang.Long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProduitNonPerissableMagasin(nom, stock, prix, mode, idMagasin);
  }
  
  public void ajouterMagasin(java.lang.String nom, int code, double prix) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterMagasin(nom, code, prix);
  }
  
  
}