package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// Création d'une instance de Calendar
		Calendar cal = Calendar.getInstance();
		// Défini l'affichage en fonction du pays choisi
		Locale chine = Locale.CHINA;

		// Définition de la date du 19 mai 2016 à 23h59 et 30 secondes
		// cal.set(2016, Calendar.MAY, 7, 23, 59, 30);

		// Récupération de la date à partir du Calendar
		Date date = cal.getTime();

		// Formatage de la date
		SimpleDateFormat formateur = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINA);
		String formateurDate = formateur.format(date);

		// Affichage de la date
		System.out.println("Date : " + formateurDate);

	}

}
