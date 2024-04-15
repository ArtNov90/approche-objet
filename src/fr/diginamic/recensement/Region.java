package fr.diginamic.recensement;

public class Region {
    private String nomRegion;
    private int population;

    public Region(String nomRegion, int population) {
        this.nomRegion = nomRegion;
        this.population = population;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulation() {
        return population;
    }
}
