package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		 double result = Operations.calcul(5.0, 3.0, '+');
	        System.out.println("5 + 3 = " + result);
	        
	        result = Operations.calcul(10.0, 2.0, '*');
	        System.out.println("10 * 2 = " + result);
	        
	        result = Operations.calcul(8.0, 4.0, '/');
	        System.out.println("8 / 4 = " + result);

	}

}
