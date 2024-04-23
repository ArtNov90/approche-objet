package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;
	

	public abstract void getSalaire();

	public void afficherDonnees() {
		System.out.println("Nom: " + nom);
		System.out.println("Prénom: " + prenom);
		getSalaire();
	}

	public Intervenant(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
