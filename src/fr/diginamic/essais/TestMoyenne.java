package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne calcul1 = new CalculMoyenne();
        calcul1.ajout(5.0);
        calcul1.ajout(7.0);
        calcul1.ajout(10.0);
        System.out.println("Moyenne du test 1: " + calcul1.calcul());

        
        CalculMoyenne calcul2 = new CalculMoyenne();
        calcul2.ajout(2.5);
        calcul2.ajout(3.5);
        calcul2.ajout(4.5);
        System.out.println("Moyenne du test 2: " + calcul2.calcul());

	}

}
