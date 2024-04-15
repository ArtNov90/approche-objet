package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MenuService {
    public void afficherTop10RegionsEtDepartements(Recensement recensement) {
        // Récupération de la liste des régions
        List<Region> regions = recensement.getVilles().stream()
                .collect(Collectors.groupingBy(Ville::getNomRegion, Collectors.summingInt(Ville::getPopulationTotal)))
                .entrySet().stream().map(entry -> new Region(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        // Tri des régions par population décroissante
        regions.sort(Comparator.comparingInt(Region::getPopulation).reversed());

        // Affichage des 10 régions les plus peuplées
        System.out.println("Les 10 régions les plus peuplées :");
        for (int i = 0; i < 10 && i < regions.size(); i++) {
            System.out.println(regions.get(i).getNomRegion());
        }

        // Récupération de la liste des départements
        List<Departement> departements = recensement.getVilles().stream()
                .collect(Collectors.groupingBy(Ville::getCodeDepartement, Collectors.summingInt(Ville::getPopulationTotal)))
                .entrySet().stream().map(entry -> new Departement(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        // Tri des départements par population décroissante
        departements.sort(Comparator.comparingInt(Departement::getPopulation).reversed());

        // Affichage des 10 départements les plus peuplés
        System.out.println("\nLes 10 départements les plus peuplés :");
        for (int i = 0; i < 10 && i < departements.size(); i++) {
            System.out.println(departements.get(i).getNomDepartement());
        }
    }
}
