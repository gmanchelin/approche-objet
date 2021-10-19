package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {

		Date d1 = new Date();
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
		String chaine1 = formateur1.format(d1);
		System.out.println("Date du jour format au jour/mois/année : " + chaine1);
		
		@SuppressWarnings("deprecation")
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
		String chaine2 = formateur2.format(d2);
		System.out.println("Date du 19/05/2016 à 23:59:30 au format yyyy/MM/dd HH:mm:ss : " + chaine2);
		
		System.out.println("Date du jour au même format que le précédent : " + formateur2.format(d1));

	}

}
