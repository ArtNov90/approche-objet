package fr.diginamic.salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		// Création d'une instance de Salarie
		Salarie salarie = new Salarie("Novara", "Arthur");
		salarie.setSalaireMensuel(2897.35); // Définition du salaire mensuel

		// Création d'une instance de Pigiste
		Pigiste pigiste = new Pigiste("Okome", "Christelle", 20, 80); // 20 euros par jour, 80 jours travaillés

		salarie.afficherDonnees();// Affiche le nom, le prénom et le salaire du salarié
		pigiste.afficherDonnees();// Affiche le nom, le prénom et le salaire du pigiste

	}

}
