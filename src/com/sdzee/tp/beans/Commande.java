package com.sdzee.tp.beans;

import java.time.LocalDate;

public class Commande {

	private Client client;
	private LocalDate dateCommande;
	private String modePaiement, statutPaiement, modeLivraison, statutLivraison;
	Double montant;
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public LocalDate getDateCommande() {
		return dateCommande;
	}
	
	public void setDateCommande(LocalDate dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	public Double getMontant() {
		return montant;
	}
	
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	public String getModePaiement() {
		return modePaiement;
	}
	
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
	
	public String getStatutPaiement() {
		return statutPaiement;
	}
	
	public void setStatutPaiement(String statutPaiement) {
		this.statutPaiement = statutPaiement;
	}
	
	public String getModeLivraison() {
		return modeLivraison;
	}
	
	public void setModeLivraison(String modeLivraison) {
		this.modeLivraison = modeLivraison;
	}
	
	public String getStatutLivraison() {
		return statutLivraison;
	}
	
	public void setStatutLivraison(String statutLivraison) {
		this.statutLivraison = statutLivraison;
	}
	
	
}
