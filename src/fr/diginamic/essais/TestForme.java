package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
	
	public static void main(String[] args) {
        // Création d'une instance de Cercle
        Cercle cercle = new Cercle(5);

        // Création d'une instance de Rectangle
        Rectangle rectangle = new Rectangle(4, 6);

        // Création d'une instance de Carré
        Carre carre = new Carre(5);

        // Test de la méthode afficher avec différentes formes
        System.out.println("Affichage du cercle :");
        AffichageForme.afficher(cercle);

        System.out.println("\nAffichage du rectangle :");
        AffichageForme.afficher(rectangle);

        System.out.println("\nAffichage du carré :");
        AffichageForme.afficher(carre);
    }

}
