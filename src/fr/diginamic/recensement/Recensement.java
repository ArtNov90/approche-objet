package fr.diginamic.recensement;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Recensement {

    private List<Ville> villes;
    private Path path; // Chemin vers le fichier de données

    public Recensement() throws IOException {
        this.setVilles(new ArrayList<>());
        this.path = Paths.get("C:\\Users\\artno\\OneDrive\\Bureau\\recensement.csv"); // Spécifiez le chemin vers votre fichier CSV
        chargerDonnees(); // Charge les données à partir du fichier lors de la création d'une instance de Recensement
    }

    private void chargerDonnees() throws IOException {
        // Lecture de toutes les lignes du fichier et conversion en une liste de chaînes
        List<String> lines = Files.readAllLines(path);

        // Conversion des lignes en objets Ville et ajout à la liste des villes
        this.villes = lines.stream()
                           .skip(1) // Skip la première ligne (entête)
                           .map(this::convertirEnVille)
                           .collect(Collectors.toList());
    }

    private Ville convertirEnVille(String ligne) {
        String[] elements = ligne.split(";"); // Supposons que les données sont séparées par des points-virgules

        // Extraction des informations à partir des éléments de la ligne
        int codeRegion = Integer.parseInt(elements[0]); // Supposons que le code région est le premier élément
        String nomRegion = elements[1]; // Supposons que le nom de la région est le deuxième élément
        String codeDepartement = (elements[2]); // Supposons que le code département est le troisième élément
        int codeCommune = Integer.parseInt(elements[3]); // Supposons que le code commune est le quatrième élément
        String nomCommune = elements[4]; // Supposons que le nom de la commune est le cinquième élément
        int populationTotal = Integer.parseInt(elements[5]); // Supposons que la population totale est le sixième élément

        // Création et retour de l'objet Ville
        Ville ville = new Ville();
        ville.setCodeRegion(codeRegion);
        ville.setNomRegion(nomRegion);
        ville.setCodeDepartement(codeDepartement);
        ville.setCodeCommune(codeCommune);
        ville.setNomCommune(nomCommune);
        ville.setPopulationTotal(populationTotal);

        return ville;
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
}
