package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args)throws IOException {

		Path path = Paths.get("C:\\Users\\artno\\OneDrive\\Bureau\\recensement.csv");
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		for (String line : lines) {
            System.out.println(line);
        }

	}
}
