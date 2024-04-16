package equals;

public class Ville {
	
	private String nom;
    private int population;

    public Ville(String nom, int population) {
        this.nom = nom;
        this.population = population;

}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Ville autre = (Ville) obj;
        return population == autre.population &&
               nom.equals(autre.nom);
    }
}
