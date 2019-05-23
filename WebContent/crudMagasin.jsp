<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD MAGASIN</title>
<link rel="stylesheet" href="./css/Main.css" />
<link rel="stylesheet" href="./css/Bootstrap.css" />
</head>
<body>
		<nav class="container">
			<a href="/synthese-client-ws-soap-equipe-1">Accueil</a> 
			<a href="/synthese-client-ws-soap-equipe-1/crudMagasin.jsp">CRUD Magasin</a>
			<a href="/synthese-client-ws-soap-equipe-1/crudProdPerissable.jsp">CRUD Produit p�rissable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/crudProdNonPerissable.jsp">CRUD Produit non p�rissable</a> 
			<a href="/synthese-client-ws-soap-equipe-1/methodeCalcul.jsp">M�thode Calcul</a>
			<a href="/synthese-client-ws-soap-equipe-1/methodeAjouterProduitMagasin.jsp">M�thode Ajout ProduitMagasin</a>
		</nav>
	
	<section class="container">
	<h1>CRUD MAGASIN</h1>
		<div>
			<form action="ServletMagasins">

				<div class="form-group row">
					<input type="hidden" name="idMagasin" value="${idMagasin}" /> 
					<label for="nomMagasin">Nom du magasin</label>
					<input id="nomMagasin" class="form-control" placeholder="Entrer nom du magasin"
						type="text" name="nomMagasin" value="${nomMagasin}" required />
				</div>
				<div class="form-group row">
					<label for="codeMagasin">Code du magasin</label> 
					<input id="codeMagasin" class="form-control"
						placeholder="Entrer code du magasin" type="number" name="codeMagasin" value="${codeMagasin}"
						required />
				</div>
				<div class="form-group row">
					<label for="prixDuLocal">Prix du local</label> 
					<input id="prixDuLocal" class="form-control"
						placeholder="Entrer prix du local" type="number" name="prixDuLocal" value="${prixDuLocal}"
						required />
				</div>
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
					<c:forEach items="${magasin}" var="mag">
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
</body>
</html>