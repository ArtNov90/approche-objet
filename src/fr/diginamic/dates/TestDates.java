package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// Création d'une instance de Calendar
		Date d1 = new Date();
		Calendar cal = Calendar.getInstance();
		// Définition de la date du 19/05/2016 à 23:59:30
		cal.set(2016, Calendar.MAY, 19, 23, 59, 30);
		
		 // Récupération de la date à partir du Calendar
        Date d2 = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formateur.format(d1);
		System.out.println(dateFormatee);
		
		// Formatage de la date
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateFormatee1 = formateur1.format(d2);
		System.out.println(dateFormatee1);

	}

}
