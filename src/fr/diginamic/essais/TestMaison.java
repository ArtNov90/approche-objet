package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// Création de la maison
        Maison maison = new Maison(10); // Supposons qu'il y ait 10 pièces au maximum

        // Ajout des pièces à la maison
        maison.ajouterPiece(new Chambre(15, 0)); // Chambre au rez-de-chaussée
        maison.ajouterPiece(new Chambre(12, 1)); // Chambre au 1er étage
        maison.ajouterPiece(new Cuisine(20, 0)); // Cuisine au rez-de-chaussée
        maison.ajouterPiece(new Salon(30, 0));   // Salon au rez-de-chaussée
        maison.ajouterPiece(new SalleDeBain(8, 1)); // Salle de bain au 1er étage
        maison.ajouterPiece(new WC(4, 0)); // WC au rez-de-chaussée

        
        System.out.println("Superficie totale de la maison : " + maison.superficieTotale() + " m²");

       
        System.out.println("Superficie du rez-de-chaussée : " + maison.superficieEtage(0) + " m²");
        System.out.println("Superficie du 1er étage : " + maison.superficieEtage(1) + " m²");

	}

}
