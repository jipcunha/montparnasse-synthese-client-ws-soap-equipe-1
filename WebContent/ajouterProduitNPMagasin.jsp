<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Methode Ajouter Produit Magasin</title>
<link rel="stylesheet" href="./css/Main.css" />
<link rel="stylesheet" href="./css/Bootstrap.css" />
</head>
<body>	<div class="container">
		<div class="s1">
			<div>
				<nav class="container">
					<a href="/synthese-client-ws-soap-equipe-1">Accueil</a> <a
						href="/synthese-client-ws-soap-equipe-1/ServletMagasins">CRUD
						Magasin</a> <a
						href="/synthese-client-ws-soap-equipe-1/ServletProduitsPerissables">CRUD
						Produit périssable</a> <a
						href="/synthese-client-ws-soap-equipe-1/ServletProduitsNonPerissables">CRUD
						Produit non périssable</a> <a
						href="/synthese-client-ws-soap-equipe-1/ServletCalcul">Méthode
						Calcul</a> <a
						href="/synthese-client-ws-soap-equipe-1/ajouterProdMag.jsp">
						Ajout Produit à Magasin</a>
				</nav>
			</div>
			<section class="container">
				<h1>AJOUT PRODUIT NON PERISSABLE MAGASIN</h1>
				<div>
					<form action="ServletProduitsNonPerissablesMagasins">

						<div class="form-group row">
							<input type="hidden" name="idProduit" value="${idProduit}" /> <label
								for="nomProduit">Nom du produit</label> <input id="nomProduit"
								class="form-control" placeholder="Entrer nom du produit"
								type="text" name="nomProduit" value="${nomProduit}" required />
						</div>
						<div class="form-group row">
							<label for="stock">Stock</label> <input id="stock"
								class="form-control" placeholder="Entrer stock disponible"
								type="number" name="stock" value="${stock}" required />
						</div>
						<div class="form-group row">
							<label for="prix">Prix du produit</label> <input id="prix"
								class="form-control" placeholder="Entrer prix du produit"
								type="number" name="prix" value="${prix}" required />
						</div>
						<div class="form-group row">
							<label for="modeDemploi">Mode d'emploi</label> <input
								id="modeDemploi" class="form-control"
								placeholder="Entrer mode d'emploi" type="text"
								name="modeDemploi" value="${modeDemploi}" required />
						</div>

				

						<div class="form-group row">
							<label for="idMagasin">Id du Magasin</label> <select
								name="idMagasin">
								<optgroup>
									<option value="0">-</option>
									<c:if test="${!empty magasins}">
										<c:forEach items="${magasins}" var="m">
											<option value="${m.idMagasin}"><c:out
													value="${m.nomMagasin}"></c:out>
											</option>
										</c:forEach>
									</c:if>
								</optgroup>
							</select>
						</div>
					
						<div class="bar">
							<input type="submit" class="btn btn-primary" name="action"
								value="Ajouter">
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
							<td>Mode D'emploi</td>
							<td>Id Magasin</td>

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