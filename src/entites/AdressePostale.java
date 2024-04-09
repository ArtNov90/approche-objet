package entites;

/**
 * représente le type de données
 */

public class AdressePostale {

	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		super();
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
	    return numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
	}
	
	public int getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	public String getLibelleRue() {
		return libelleRue;
	}
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


}
	
	

	

	


