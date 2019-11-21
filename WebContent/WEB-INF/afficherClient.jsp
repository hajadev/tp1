<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="inc/style.css" />
<title>Client</title>
</head>
<body>

	<p class="info">
		${ msg }
		<%
			if(!(Boolean)request.getAttribute("valid")){
				out.println("<a href=\"./creerClient.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un client. <br />");
			}
			else{
				out.println("Client créé avec succès !");
			}
		%>
	</p>
	<p>
		Nom : ${ client.nom } <br />
		Prénom : ${ client.prenom } <br />
		Adresse : ${ client.adresse } <br />
		Numéro de téléphone : ${ client.telephone } <br />
		Email : ${ client.email }
	</p>

</body>
</html>