package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\artno\\OneDrive\\Bureau\\recensement.csv");
		List<String> list = Files.readAllLines(path);

		Path inputFile = Paths.get("C:\\Users\\artno\\OneDrive\\Bureau\\recensement.csv");

		Path outputFile = Paths.get("C:\\Users\\artno\\OneDrive\\Bureau\\100_premieres_lignes.csv");

		List<String> lines = Files.readAllLines(inputFile);
		List<String> premiereslignes100 = lines.subList(0, Math.min(100, lines.size()));

		Files.write(outputFile, premiereslignes100);
		
		  System.out.println("Contenu du fichier :");
	        for (String line : Files.readAllLines(outputFile)) {
	            System.out.println(line);
	        }
	        

	}

}
