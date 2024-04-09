package entites2;

import entites.AdressePostale;

 

public class Personne {
	
	private String nom;
	private String prenom;
	private AdressePostale adresse;
	
	
	public Personne(String pnom, String pprenom, AdressePostale padresse) {
		
		nom = pnom;
		prenom = pprenom;
		adresse = padresse;
		
	}
	
	@Override
	public String toString() {
	    return "Nom: " + nom + ", Prénom: " + prenom + ", Adresse: " + adresse;
	}
	
	public void afficherNomPrenom() {
        System.out.println(prenom + " " + nom.toUpperCase());
    }
	
	public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }
	
	public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

	 public void setAdresse(AdressePostale adr1) {
	        this.adresse = adr1;
	    }
	 
	 public String getNom() {
	        return nom;
	    }
	 public String getPrenom() {
	        return prenom;
	    }
	 
	 public AdressePostale getAdressePostale() {
	        return adresse;
	    }
	

}
