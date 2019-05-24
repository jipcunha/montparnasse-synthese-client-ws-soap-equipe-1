<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>METHODE CALCUL</title>
<link rel="stylesheet" href="./css/Main.css" />
<link rel="stylesheet" href="./css/Bootstrap.css" />
</head>
<body>
<div class="container">
	<div class="s1">
		<div>
			<nav class="container">
				<a href="/synthese-client-ws-soap-equipe-1">Accueil</a> 
			<a href="/synthese-client-ws-soap-equipe-1/ServletMagasins">CRUD Magasin</a>
			<a href="/synthese-client-ws-soap-equipe-1/ServletProduitsPerissables">CRUD Produit périssable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/ServletProduitsNonPerissables">CRUD Produit non périssable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/ServletCalcul">Méthode Calcul</a>
			<a href="/synthese-client-ws-soap-equipe-1/ServletAjoutProdMag">Méthode Ajout ProduitMagasin</a>
			</nav>
		</div>
		<section class="container">
			<h1>METHODE CALCUL</h1>
			<div>
				<form action="ServletCalcul">
					<label for="idMagasin">ID Magasin</label> 
					<input id="idMagasin"
						class="form-control" placeholder="Entrer l'ID du magasin"
						type="number" name="idMagasin" value="${idMagasin}" required />
						
						<br/>
						<input type="submit" class="btn btn-primary" name="action"
							value="calculer">
					<p><label for="somme">Somme : ${somme}</label></p>
				</form>
			</div>
		</section>
		
		<section class="container">
		<h2>Liste des magasins</h2>
		<table class="table">
			<thead> 
				<tr>
					<td>ID</td>
					<td>Nom Magasin</td>
					<td>Code Magasin</td>
					<td>Prix Local</td>
					<td>Modifier</td>
					<td>Supprimer</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${! empty magasins}">
					<c:forEach items="${magasins}" var="mag">
						<tr>
							<td><c:out value="${mag.idMagasin}" /></td>
							<td><c:out value="${mag.nomMagasin}" /></td>
							<td><c:out value="${mag.codeMagasin}" /></td>
							<td><c:out value="${mag.prixDuLocal}" /></td>
							<td><a href="ModifierMag?idMagasin=${mag.idMagasin}">Modifier</a></td>
							<td><a href="SupprimerMag?idMagasin=${mag.idMagasin}">Supprimer</a></td>

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