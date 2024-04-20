package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {
        Saison[] saisons = Saison.values();
        Saison hiver = Saison.getSaisonByLibelle("Hiver");
        
        for (Saison saison : saisons) {
            System.out.println(saison);
        }
        //Méthode pour retrouvé ETE et l'afficher
        Saison saisonETE = Saison.valueOf("ETE");
        System.out.println("Libellé de la saison ETE : " + saisonETE.getLibelle());
        
        //Méthode pour retrouver HIVER
        if (hiver != null && hiver == Saison.HIVER) {
            System.out.println("La méthode getSaisonByLibelle a retourné HIVER avec succès !");
        } else {
            System.out.println("La méthode getSaisonByLibelle n'a pas retourné la saison HIVER.");
        }
    }
}