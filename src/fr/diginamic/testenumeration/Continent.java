package fr.diginamic.testenumeration;

public enum Continent {
    EUROPE("Europe"),
    AMERIQUE("Amérique"),
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    OCEANIE("Océanie");

    private String libelle;

    private Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
