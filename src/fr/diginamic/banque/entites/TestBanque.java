package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte[] comptes = new Compte[2];
		
		comptes[0] = new Compte(123456789, 1000.0);
		
		comptes[1] = new CompteTaux(987654321, 2000.0, 0.05);
		
		for (int i = 0; i < comptes.length; i++) {
		    System.out.println(comptes[i]);
		}
		
		

		

	}

}
