package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> listEntier = new ArrayList<Integer>();

		listEntier.add(-1);
		listEntier.add(5);
		listEntier.add(7);
		listEntier.add(3);
		listEntier.add(-2);
		listEntier.add(4);
		listEntier.add(8);
		listEntier.add(5);

		System.out.println("Voici la liste entière: " + listEntier);
		System.out.println("la taille de la liste est: " + listEntier.size());

		int max = listEntier.get(0);

		for (int i = 0; i < listEntier.size(); i++) {
			int current = listEntier.get(i);
			if (current > max) {
				max = current;
			}
		}
		System.out.println("Le plus grand élément de la liste est : " + max);

		Iterator<Integer> iter = listEntier.iterator();

		while (iter.hasNext()) {
			Integer element = iter.next();
			if (element.equals(-2)) {
				iter.remove();
				
				System.out.println("liste sans l'élément le + petit: " + listEntier);
			}
		}

			
			while (iter.hasNext()) {
				Integer element = iter.next();
				if (element < 0) {
					iter.remove(); 
					listEntier.add(Math.abs(element)); // Ajouter sa valeur absolue à la liste
				}
			}

			System.out.println("Liste après la modification : " + listEntier);

		}

	}


