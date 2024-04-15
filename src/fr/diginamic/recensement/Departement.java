package fr.diginamic.recensement;

public class Departement {
    private String codeDepartement;
    private int population;

    public Departement(String string, int population) {
        this.codeDepartement = string;
        this.population = population;
    }

    public String getNomDepartement() {
        return String.valueOf(codeDepartement);
    }

    public int getPopulation() {
        return population;
    }
}
