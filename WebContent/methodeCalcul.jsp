<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>METHODE CALCUL</title>
<link rel="stylesheet" href="./css/Main.css" />
<link rel="stylesheet" href="./css/Bootstrap.css" />
</head>
<body>
<div class="container">
	<div class="s1">
		<div>
			<nav class="container">
				<a href="/synthese-client-ws-soap-equipe-1">Accueil</a> <a
					href="/synthese-client-ws-soap-equipe-1/crudMagasin.jsp">CRUD
					Magasin</a> <a
					href="/synthese-client-ws-soap-equipe-1/crudProdPerissable.jsp">CRUD
					Produit périssable</a> <a
					href="/synthese-client-ws-soap-equipe-1/crudProdNonPerissable.jsp">CRUD
					Produit non périssable</a> <a
					href="/synthese-client-ws-soap-equipe-1/methodeCalcul.jsp">Méthode
					Calcul</a> <a
					href="/synthese-client-ws-soap-equipe-1/methodeAjouterProduitMagasin.jsp">Méthode
					Ajout ProduitMagasin</a>
			</nav>
		</div>
		<section class="container">
			<h1>METHODE CALCUL</h1>
			<div>
				<form action="ServletMagasins">
					<label for="idMagasin">ID Magasin</label> <input id="idMagasin"
						class="form-control" placeholder="Entrer l'ID du magasin"
						type="number" name="idMagasin" value="${idMagasin}" required />
					<div class="bar">
						<button type="submit" class="btn btn-primary" name="calculer"
							value="Calculer">"Calculer"</button>
					</div>
					<p>${somme}</p>
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
				<c:if test="${! empty magasin}">
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