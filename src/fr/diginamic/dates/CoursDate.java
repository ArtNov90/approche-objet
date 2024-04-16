package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class CoursDate {

	public static void main(String[] args) throws ParseException {
		Date d1 = new Date();
		Date d2 = new Date(98);
		System.out.println(d1);
		System.out.println(d2);
		
		//Utilisation de Calendar
		Calendar cal = Calendar.getInstance();// par défaut un calendrier est positioné sur la date/heure system
		cal.set(1988, 1, 15, 0, 0, 0);// Exemple
		cal.set(Calendar.YEAR, 1988);// Exemple
		cal.set(Calendar.MONTH, 1);// Exemple
		Date d3 = cal.getTime();
		System.out.println(d3);
		
		//Afficher la date au format : jj/mm/annee hh:mi:ss
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formateur.format(d2);
		System.out.println(dateFormatee);
		//Afficher la date au format : jj/mm/anne
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veulliez saisir la date au format jj/mm/aaaa:");
		String saisie = scanner.nextLine();
		
		Date dateNaissance = formateur.parse(saisie);
		System.out.println(dateNaissance);

	}

}
