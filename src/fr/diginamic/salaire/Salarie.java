package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	private double salaireMensuel;

	public Salarie(String nom, String prenom) {
		super(nom, prenom);
		
	}

	public void getSalaire() {
		  System.out.println("Le salaire mensuel de " + getNom() + " " + getPrenom() + " est : " + getSalaireMensuel() + " euros.");
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	

}
