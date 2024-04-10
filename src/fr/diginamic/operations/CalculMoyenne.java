package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double[] elements;
    private int taille;
    private static final int INITIAL_CAPACITY = 10;
    
    public CalculMoyenne() {
        elements = new double[INITIAL_CAPACITY];
        taille = 0;
    }
    
    public void ajout(double valeur) {
        if (taille == elements.length) {
            
            elements = Arrays.copyOf(elements, taille * 2);
        }
        elements[taille] = valeur;
        taille++;
    }
    
    public double calcul() {
        if (taille == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < taille; i++) {
            sum += elements[i];
        }
        return sum / taille;
    }
    }

	

