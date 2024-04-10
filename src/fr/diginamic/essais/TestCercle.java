package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(5.0);
		Cercle cercle2 = new Cercle(7.5);

		System.out.println("Cercle 1 :");
		System.out.println("Périmètre : " + cercle1.calculerPerimetre());
		System.out.println("Surface : " + cercle1.calculerSurface());

		System.out.println("\nCercle 2 :");
		System.out.println("Périmètre : " + cercle2.calculerPerimetre());
		System.out.println("Surface : " + cercle2.calculerSurface());

	}

}
