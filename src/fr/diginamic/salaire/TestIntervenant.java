package fr.diginamic.salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		 // Création d'une instance de Salarie
        Salarie salarie = new Salarie("Doe", "John");
        salarie.setSalaireMensuel(2897.35); // Définition du salaire mensuel
        salarie.getSalaire(); // Affichage du salaire
        
        Pigiste pigiste = new Pigiste("Smith", "Alice", 20, 80); // 20 euros par jour, 80 jours travaillés
        pigiste.getSalaire(); // Affichage du salaire

	}

}
