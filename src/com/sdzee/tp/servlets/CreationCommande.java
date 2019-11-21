package com.sdzee.tp.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.tp.beans.Client;
import com.sdzee.tp.beans.Commande;

public class CreationCommande extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Double montant;
		String nom, prenom, adresse, telephone, email, modeLivraison, modePaiement, statutLivraison, statutPaiement;
		Client client = new Client();
		Commande commande = new Commande();
		String msg;
		Boolean valid = false;
		
		nom = req.getParameter("nomClient");
		prenom = req.getParameter("prenomClient");
		adresse = req.getParameter("adresseClient");
		telephone = req.getParameter("telephoneClient");
		email = req.getParameter("emailClient");
		modeLivraison = req.getParameter("modeLivraisonCommande");
		modePaiement = req.getParameter("modePaiementCommande");
		statutLivraison = req.getParameter("statuLivraisonCommande");
		montant = Double.valueOf(req.getParameter("montantCommande"));
		statutPaiement = req.getParameter("statutPaiementCommande");
		
		client.setNom(req.getParameter("nomClient"));
		client.setPrenom(req.getParameter("prenomClient"));
		client.setAdresse(req.getParameter("adresseClient"));
		client.setTelephone(req.getParameter("telephoneClient"));
		client.setEmail(req.getParameter("emailClient"));
		
		commande.setClient(client);
		commande.setDateCommande(LocalDate.now());
		commande.setModeLivraison(modeLivraison);
		commande.setModePaiement(modePaiement);
		commande.setMontant(montant);
		commande.setStatutLivraison(statutLivraison);
		commande.setStatutPaiement(statutPaiement);
		
		valid = (nom != null && !nom.isEmpty())&&(adresse != null && !adresse.isEmpty())&&(telephone != null && !telephone.isEmpty())&&(montant != null)&&(modePaiement != null && !modePaiement.isEmpty())&&(modeLivraison != null && !modeLivraison.isEmpty());
		
		if(valid) {
			msg = "Commande créer avec succès !";
		}
		else {
			msg = "Erreur - Vous n'avez pas rempli tous les champs obligatoires.";
		}

		req.setAttribute("commande", commande);
		req.setAttribute("msg", msg);
		req.setAttribute("valid", valid);
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/afficherCommande.jsp" ).forward( req, resp );
		
	}

	
	
}
