<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD PRODUIT NON PERISSABLE</title>
<link rel="stylesheet" href="./css/Main.css" />
<link rel="stylesheet" href="./css/Bootstrap.css" />
</head>
<body >
<div class="container">
<div class="s1">
<div>
		<nav class="container">
			<a href="/synthese-client-ws-soap-equipe-1">Accueil</a> 
			<a href="/synthese-client-ws-soap-equipe-1/ServletMagasins">CRUD Magasin</a>
			<a href="/synthese-client-ws-soap-equipe-1/ServletProduitsPerissables">CRUD Produit p�rissable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/ServletProduitsNonPerissables">CRUD Produit non p�rissable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/ServletCalcul">M�thode Calcul</a>
			<a href="/synthese-client-ws-soap-equipe-1/ServletAjoutProdMag">M�thode Ajout ProduitMagasin</a>
			<a href="/synthese-client-ws-soap-equipe-1/ServletProduitsPerissablesMagasins">CRUD Produit P�rissable Magasin</a>
			<a href="/synthese-client-ws-soap-equipe-1/ServletProduitsNonPerissablesMagasins">CRUD Produit non p�rissable Magasin</a>
		</nav>
</div>
<section class="container">
	<h1>CRUD PRODUIT NON PERISSABLE</h1>
		<div>
			<form action="ServletProduitsNonPerissablesMagasins">

				<div class="form-group row">
					<input type="hidden" name="idProduit" value="${idProduit}" /> 
					<label for="nomProduit">Nom du produit</label>
					<input id="nomProduit" class="form-control" 
						placeholder="Entrer nom du produit" type="text" name="nomProduit" value="${nomProduit}" 
						required />
				</div>
				<div class="form-group row">
					<label for="stock">Stock</label> 
					<input id="stock" class="form-control"
						placeholder="Entrer stock disponible" type="number" name="stock" value="${stock}"
						required />
				</div>
				<div class="form-group row">
					<label for="prix">Prix du produit</label> 
					<input id="prix" class="form-control"
						placeholder="Entrer prix du produit" type="number" name="prix" value="${prix}"
						required />
				</div>
				<div class="form-group row">
					<label for="modeDemploi">Mode d'emploi</label> 
					<input id="modeDemploi" class="form-control"
						placeholder="Entrer mode d'emploi" type="text" name="modeDemploi" value="${modeDemploi}"
						required />
				</div>
				<div class="form-group row">
					<label for="idMagasin">ID Magasin</label> 
					<input id="idMagasin" class="form-control"
						placeholder="Entrer ID Magasin" type="number" name="idMagasin" value="${idMagasin}"
						required />
				</div>				
				<div class="bar">
					<button type="submit" class="btn btn-primary" name="ajouter"
						value="Ajouter">Ajouter</button>
				</div>
			</form>
		</div>
	</section>
	
	<section class="container">
		<h2>Liste des Produits</h2>
		<table class="table">
			<thead> 
				<tr>
					<td>ID</td>
					<td>Nom Produit</td>
					<td>Stock</td>
					<td>Prix Produit</td>
					<td>Date Limite</td>
					<td>Mode D'emploi</td>
					<td>ID Magasin</td>		
				</tr>
			</thead>
			<tbody>
				<c:if test="${! empty produits}">
					<c:forEach items="${produits}" var="prod">
						<tr>
							<td><c:out value="${prod.idProduit}" /></td>
							<td><c:out value="${prod.nomProduit}" /></td>
							<td><c:out value="${prod.stock}" /></td>
							<td><c:out value="${prod.prix}" /></td>
							<td><c:out value="${prod.dateLimiteUtilisation}" /></td>
							<td><c:out value="${prod.modeDemploi}" /></td>
							<td><c:out value="${prod.magasin.idMagasin}" /></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</section>
	</div>
	</div>
</body>
</html>