<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD PRODUIT PERISSABLE</title>
<link rel="stylesheet" href="./css/Main.css" />
<link rel="stylesheet" href="./css/Bootstrap.css" />
</head>
<body>
<div class="s1">
<div>
		<nav class="container">
			<a href="/synthese-client-ws-soap-equipe-1">Accueil</a> 
			<a href="/synthese-client-ws-soap-equipe-1/crudMagasin.jsp">CRUD Magasin</a>
			<a href="/synthese-client-ws-soap-equipe-1/crudProdPerissable.jsp">CRUD Produit périssable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/crudProdNonPerissable.jsp">CRUD Produit non périssable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/methodeCalcul.jsp">Méthode Calcul</a>
			<a href="/synthese-client-ws-soap-equipe-1/methodeAjouterProduitMagasin.jsp">Méthode Ajout ProduitMagasin</a>
		</nav>
</div>
<section class="container">
	<h1>CRUD PRODUIT PERISSABLE</h1>
		<div>
			<form action="ServletProduitPerissable">

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
					<label for="dateLimiteUtilisation">Date Limite Utilisation</label> 
					<input id="dateLimiteUtilisation" class="form-control"
						placeholder="Entrer la date" type="text" name="dateLimiteUtilisation" value="${dateLimiteUtilisation}"
						required />
				</div>
				
				<!--  IL FAUT METTRE LE PATTERN DE LA DATE !!!!!!!!! -->
				
				
				<div class="bar">
					<button type="submit" class="btn btn-primary" name="modifier"
						value="Modifier">Modifier</button>
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
					<td>Modifier</td>
					<td>Supprimer</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${! empty produit}">
					<c:forEach items="${produit}" var="prod">
						<tr>
							<td><c:out value="${prod.idProduit}" /></td>
							<td><c:out value="${prod.nomProduit}" /></td>
							<td><c:out value="${prod.stock}" /></td>
							<td><c:out value="${prod.prix}" /></td>
							<td><c:out value="${prod.dateLimiteUtilisation}" /></td>
							<td><c:out value="${prod.modeDemploi}" /></td>
							<td><a href="ModifierProd?idProduit=${prod.idProduit}">Modifier</a></td>
							<td><a href="SupprimerProd?idProduit=${prod.idProduit}">Supprimer</a></td>

						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</section>
	</div>
</body>
</html>