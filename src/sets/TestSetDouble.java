package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		// Créer un HashSet
		HashSet<Double> set = new HashSet<>();

		// Ajouter les éléments
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		System.out.println("Affichage des éléments : " + set);
		
		// Rechercher le plus grand élément
		double max = Double.NEGATIVE_INFINITY; // Initialiser à la plus petite valeur possible
		for (double element : set) {
			if (element > max) {
				max = element;
			}

		}
		 double min = Double.POSITIVE_INFINITY; // Initialiser à la plus grande valeur possible
	        Iterator<Double> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            double current = iterator.next();
	            if (current < min) {
	                min = current;
	            }
	        }
	        set.remove(min);
	        
	        
		System.out.println("le plus grand double est: " + max);
		System.out.println("Suppression du plus petit élément : " + set);
	}
}
