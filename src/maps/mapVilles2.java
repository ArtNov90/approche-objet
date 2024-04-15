package maps;

import java.util.HashMap;

public class mapVilles2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mapPopulation = new HashMap<>(); 
		
		    mapPopulation.put("Marseille", 870000);
	        mapPopulation.put("Montpellier", 285000);
	        mapPopulation.put("Nantes", 315000);
	        mapPopulation.put("Paris", 2190000);
	        mapPopulation.put("Toulouse", 479000);
	        mapPopulation.put("Lille", 233000);
	        mapPopulation.put("Lyon", 516000);
	        mapPopulation.put("Bordeaux", 257000);
	     // Rechercher et supprimer la ville avec la population la plus basse
	        String villeLaMoinsPeuplee = null;
	        int populationMin = Integer.MAX_VALUE;
	        for (String ville : mapPopulation.keySet()) {
	            int population = mapPopulation.get(ville);
	            if (population < populationMin) {
	                populationMin = population;
	                villeLaMoinsPeuplee = ville;
	            }
	        }
	     // Supprimer la ville avec la population la plus basse de la carte
	        if (villeLaMoinsPeuplee != null) {
	            mapPopulation.remove(villeLaMoinsPeuplee);
	            System.out.println(villeLaMoinsPeuplee);
	        }
	}

}
