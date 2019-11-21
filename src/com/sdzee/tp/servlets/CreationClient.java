package com.sdzee.tp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.tp.beans.Client;

public class CreationClient extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Client client = new Client();
		String nom, prenom, adresse, telephone, email;
		Boolean valid = false;
		String msg;

		nom = req.getParameter("nomClient");
		prenom = req.getParameter("prenomClient");
		adresse = req.getParameter("adresseClient");
		telephone = req.getParameter("telephoneClient");
		email = req.getParameter("emailClient");

		valid = (((nom != null) && (!nom.isEmpty()))&&((adresse != null) && (!adresse.isEmpty()))&&((telephone != null) && (!telephone.isEmpty())));

		System.out.println(((nom != null) && (!nom.isEmpty())) + " + " + ((adresse != null) && (!adresse.isEmpty())) + " + " + ((telephone != null) && (telephone.isEmpty())) );
		
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setTelephone(telephone);
		client.setEmail(email);
		
		if(valid) {
			msg = "Client créer avec succès !";
		}
		else {
			msg = "Erreur - Vous n'avez pas rempli tous les champs obligatoires.";
		}

		req.setAttribute("client", client);
		req.setAttribute("msg", msg);
		req.setAttribute("valid", valid);

		this.getServletContext().getRequestDispatcher( "/WEB-INF/afficherClient.jsp" ).forward( req, resp );

	}



}
