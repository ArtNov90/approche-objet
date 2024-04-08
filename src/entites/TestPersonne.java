package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		

		Personne perso1 = new Personne();
		Personne perso2 = new Personne();
		
		AdressePostale adr1 = new AdressePostale();
		AdressePostale adr2 = new AdressePostale();
		
		perso1.nom = "Novara";
		perso1.prenom = "Arthur";
		perso1.adresse = adr1;
		
		
		
		perso2.nom = "Okome";
		perso2.prenom = "Christelle";
		perso2.adresse = adr2;
		
		
		System.out.println(perso1.nom);

	}

}
