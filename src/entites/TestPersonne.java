package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(47, "passage des ombrettes", 34000, "Montpellier");

		Personne perso1 = new Personne("Novara", "Arthur", null);
		perso1.setAdresse(adr1);
		
		perso1.afficherNomPrenom();
		System.out.println(perso1);

	}

}
