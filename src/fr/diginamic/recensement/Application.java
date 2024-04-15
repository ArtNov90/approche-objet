package fr.diginamic.recensement;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException  {
        // Création du recensement avec la liste de villes
        Recensement recensement = new Recensement();

        // Création du menu service
        MenuService menuService = new MenuService();

        // Affichage des 10 régions les plus peuplées et des 10 départements les plus peuplés
        menuService.afficherTop10RegionsEtDepartements(recensement);
    }
}
