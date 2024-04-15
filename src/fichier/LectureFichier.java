package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import tri.Ville;

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\artno\\OneDrive\\Bureau\\recensement.csv");
		List<String> lines = Files.readAllLines(path);

		ArrayList<Ville> listeVilles = new ArrayList<>();

		// Parcourir chaque ligne du fichier
		for (int i = 1; i < lines.size(); i++) {
			String line = lines.get(i);
			String[] tokens = line.split(";");

			// Créer une instance de la classe Ville en extrayant les informations
			Ville ville = new Ville();
			ville.setNom(tokens[0]);
			ville.setCodeDepartement((tokens[2]));
			ville.setNomRegion(tokens[1]);
			ville.setPopulationTotale(Integer.parseInt(tokens[9].replaceAll(" ", "")));

			// Ajoute la ville à la liste des villes
			listeVilles.add(ville);
		}

		// Affiche les informations sur toutes les villes
		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}
	}

}
