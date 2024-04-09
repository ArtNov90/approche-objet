package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte(123456789, 1000.0);
		
		System.out.println("Numéro de compte : " + compte.getNumCompte());
		System.out.println( compte);

		

	}

}
