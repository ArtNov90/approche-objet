package fr.diginamic.banque.entites;

public class Compte {
	// variables d'instance
	private int numCompte;
	private double soldeCompte;

	// Constructeur ici généré par l'IDE
	public Compte(int numCompte, double soldeCompte) {
		this.setNumCompte(numCompte);
		this.setSoldeCompte(soldeCompte);
	}
	

	@Override
	public String toString() {
		return  "Numéro Compte = " + numCompte + ", Solde Compte = " + soldeCompte ;
	}


	// Getter Setter généré par l'IDE
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
