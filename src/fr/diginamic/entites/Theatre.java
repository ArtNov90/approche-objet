package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capaciteClientMax;
	private int totalClient;
	private double recetteTotale;
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getCapaciteClientMax() {
		return capaciteClientMax;
	}



	public void setCapaciteClientMax(int capaciteClientMax) {
		this.capaciteClientMax = capaciteClientMax;
	}



	public int getTotalClient() {
		return totalClient;
	}



	public void setTotalClient(int totalClient) {
		this.totalClient = totalClient;
	}



	public double getRecetteTotale() {
		return recetteTotale;
	}



	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}



	public void inscrire(int nbClients, double prixPlace) {
		
		if(totalClient + nbClients <= capaciteClientMax ) {
			
			totalClient += nbClients;
	        recetteTotale += nbClients * prixPlace;
			
		} else {
			
			System.out.println("capacité max atteinte");
			
		}
	}
	

}
