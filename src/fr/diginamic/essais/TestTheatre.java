package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {


		Theatre theatre = new Theatre();
		theatre.setNom("Casse Noisettes");
		theatre.setCapaciteClientMax(100); 
		
		double prixPlace = 20.0;
		
		int nbClientsParIteration = 10;
		
		int totalClientsAInscrire = theatre.getCapaciteClientMax();
		
		 for (int i = 0; i < totalClientsAInscrire; i += nbClientsParIteration) {
	            theatre.inscrire(nbClientsParIteration, prixPlace); // Inscrire nbClientsParIteration clients à chaque fois
	        }
		 System.out.println("Total de clients inscrits : " + theatre.getTotalClient());
		 
		 System.out.println("Recette totale de l'établissement : " + theatre.getRecetteTotale());
	}

}
