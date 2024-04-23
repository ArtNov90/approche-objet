package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	private int nbJoursTravail;
	private double MontantJournalierRemuneration;

	public Pigiste(String nom, String prenom, int nbJoursTravail, double MontantJournalierRemuneration) {
		super(nom, prenom);
		this.nbJoursTravail = nbJoursTravail;
		this.MontantJournalierRemuneration = MontantJournalierRemuneration;

	}
	//Création de la méthode pour calculer le salaire du pigiste
	public void getSalaire() {
		double salaireMensuel = nbJoursTravail * MontantJournalierRemuneration;
		System.out.println("Salaire mensuel: " + salaireMensuel + " euros");
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
