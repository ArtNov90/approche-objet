package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	private int nbJoursTravail;
	private double MontantJournalierRemuneration;

	public Pigiste(String nom, String prenom) {
		super(nom, prenom);
		
	}

	public void getSalaire() {

	}

	public int getNbJoursTravail() {
		return nbJoursTravail;
	}

	public void setNbJoursTravail(int nbJoursTravail) {
		this.nbJoursTravail = nbJoursTravail;
	}

	public double getMontantJournalierRemuneration() {
		return MontantJournalierRemuneration;
	}

	public void setMontantJournalierRemuneration(double montantJournalierRemuneration) {
		MontantJournalierRemuneration = montantJournalierRemuneration;
	}

}
