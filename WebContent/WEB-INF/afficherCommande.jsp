<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="inc/style.css" />
<title>Commande</title>
</head>
<body>

	<p class="info">
		${ msg } <br />
		<%
			if(!(Boolean)request.getAttribute("valid")){
				out.println("<a href=\"./creerCommande.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'une commande. <br />");
			}
		%>
	</p>

	<p>Nom : ${ commande.client.nom }</p>
	<p>Prénom : ${ commande.client.prenom }</p>
	<p>Adresse : ${ commande.client.adresse }</p>
	<p>Numéro de téléphone : ${ commande.client.telephone }</p>
	<p>Email : ${ commande.client.email }</p>
	<br />
	<p>Commande</p>
	<p>Date: ${ commande.dateCommande }</p>
	<p>Montant : ${ commande.montant }</p>
	<p>Mode de paiement : ${ commande.modePaiement }</p>
	<p>Statut de paiement : ${ commande.statutPaiement }</p>
	<p>Mode de livraison : ${ commande.modeLivraison }</p>
	<p>Statut de la livraison : ${ commande.statutLivraison }</p>

</body>
</html>