/**
 * ProduitSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wsSoap;

public interface ProduitSOAPService extends java.rmi.Remote {
    public void ajouterProdPerissable(java.lang.String nom, int stock, double prix, java.util.Calendar date) throws java.rmi.RemoteException;
    public double calculPrixMagasin(java.lang.Long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wsSoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException;
    public void ajouterProduitPerissableMagasin(java.lang.String nom, int stock, double prix, java.util.Calendar date, java.lang.Long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wsSoap.Produit modifierProdNonPerissable(java.lang.Long id, java.lang.String nom, int stock, double prix, java.lang.String mode, java.lang.Long idM) throws java.rmi.RemoteException;
    public com.infotel.wsSoap.Produit modifierProdPerissable(java.lang.Long id, java.lang.String nom, int stock, double prix, java.util.Calendar date, java.lang.Long idM) throws java.rmi.RemoteException;
    public com.infotel.wsSoap.Produit getProduit(long idProduit) throws java.rmi.RemoteException;
    public com.infotel.wsSoap.Magasin[] getAllMagasins() throws java.rmi.RemoteException;
    public com.infotel.wsSoap.Produit[] getAllProduits() throws java.rmi.RemoteException;
    public void supprimerProduit(long idProduit) throws java.rmi.RemoteException;
    public void supprimerMagasin(long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wsSoap.Magasin modifierMagasin(java.lang.Long id, java.lang.String nom, int code, double prix) throws java.rmi.RemoteException;
    public void ajouterProdNonPerissable(java.lang.String nom, int stock, double prix, java.lang.String mode) throws java.rmi.RemoteException;
    public void ajouterProduitNonPerissableMagasin(java.lang.String nom, int stock, double prix, java.lang.String mode, java.lang.Long idMagasin) throws java.rmi.RemoteException;
    public void ajouterMagasin(java.lang.String nom, int code, double prix) throws java.rmi.RemoteException;
}
