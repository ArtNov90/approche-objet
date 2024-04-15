package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> listePays = new ArrayList<>();

		listePays.add(new Pays("France", 65, "Europe"));
		listePays.add(new Pays("Allemagne", 80, "Europe"));
		listePays.add(new Pays("Belgique", 10, "Europe"));
		listePays.add(new Pays("Russie", 150, "Asie"));
		listePays.add(new Pays("Chine", 1400, "Asie"));
		listePays.add(new Pays("Indonésie", 220, "Océanie"));
		listePays.add(new Pays("Australie", 20, "Océanie"));

		HashMap<String, Integer> compteurPaysParContinent = new HashMap<>();

		for (Pays pays : listePays) {
			String continent = pays.getContinent();
			compteurPaysParContinent.put(continent, compteurPaysParContinent.getOrDefault(continent, 0) + 1);
		}

		System.out.println("Nombre de pays par continent :");
		for (String continent : compteurPaysParContinent.keySet()) {
			int nombrePays = compteurPaysParContinent.get(continent);
			System.out.println(continent + " : " + nombrePays);
		}

	}
}
