package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	static String chaine = "Durand;Marcel;2 523.5";

	public static void main(String[] args) {

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		int longueurChaine = chaine.length();
		System.out.println("longueur chaine: " + longueurChaine);

		int indexPremierPointVirgule = chaine.indexOf(';');
		System.out.println("index du premier point virgule: " + indexPremierPointVirgule);
		
		String stratEnd = chaine.substring(0, indexPremierPointVirgule + 1);
		System.out.println("la portion de chaine de caractère est: " + stratEnd);
		
		String nomDeFamille = chaine.substring(0, indexPremierPointVirgule);
		System.out.println("Nom de famille: " + nomDeFamille);
		
		String nomDeFamilleEnMajuscules = nomDeFamille.toUpperCase();
		System.out.println("Nom de famille MAJUCTULE: " + nomDeFamilleEnMajuscules);
		
		String nomDeFamilleEnMinuscules = nomDeFamille.toLowerCase();
		System.out.println("Nom de famille minuscule: " + nomDeFamilleEnMinuscules);
		
		
		String[] morceaux = chaine.split(";");
        for (String morceau : morceaux) {
            System.out.println("Morceaux de la chaîne : " + morceau);
        }
        
        
        

        String nom = morceaux[0];
        String prenom = morceaux[1];
        
        double salaire = Double.parseDouble(morceaux[2].replace(" ", ""));

        
        Salarie salarie = new Salarie(nom, prenom, salaire);

        
        System.out.println("Nom: " + salarie.getNom());
        System.out.println("Prénom: " + salarie.getPrenom());
        System.out.println("Salaire: " + salarie.getSalaire());

	}

}
