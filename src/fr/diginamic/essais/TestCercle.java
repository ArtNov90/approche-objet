package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(5.0);
		Cercle cercle2 = new Cercle(7.5);
		
		afficherCercle(cercle1);
        afficherCercle(cercle2);
	}

        public static void afficherCercle(Cercle cercle) {
            System.out.println("Rayon du cercle : " + cercle.getRayon());
            System.out.println("Surface du cercle : " + cercle.calculerSurface());
            System.out.println("Périmètre du cercle : " + cercle.calculerPerimetre());
            System.out.println();
        

	}

}
