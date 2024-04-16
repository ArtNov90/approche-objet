package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
	      long startTime = System.currentTimeMillis();

	        String result = "";

	        // Ajout des nombres de 1 à 100 000 dans la chaîne de caractères
	        for (int i = 1; i <= 100000; i++) {
	            result += i + " ";
	        }

	        long endTime = System.currentTimeMillis();
	        long executionTime = endTime - startTime;

	        // Affichage du contenu de la chaîne de caractères
	        System.out.println(result);

	        // Affichage du temps d'exécution
	        System.out.println("Temps d'exécution : " + executionTime + " millisecondes");
	    }


	}
	



