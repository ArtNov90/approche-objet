package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), 
	ETE("Eté", 2), 
	AUTOMNE("Automne", 3), 
	HIVER("Hiver", 4);

	private String libelle;
	private int numeroOrdre;

	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	// Méthode pour récupérer une instance de saison en fonction du libellé
	public static Saison getSaisonByLibelle(String libelle) {
		for (Saison saison : Saison.values()) {
			if (saison.getLibelle().equalsIgnoreCase(libelle)) {
				return saison;
			}
		}
		return null; // Retourne null si aucune correspondance trouvée
	}
}
