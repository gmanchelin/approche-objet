package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		Date d1 = new Date(121, 9, 18, 14, 43, 30);
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
		System.out.println("Date du jour format au jour/mois/ann�e : " + formateur1.format(d1));
		
		@SuppressWarnings("deprecation")
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
		System.out.println("Date du 19/05/2016 � 23:59:30 au format yyyy/MM/dd HH:mm:ss : " + formateur2.format(d2));
		
		System.out.println("Date du jour au m�me format que le pr�c�dent : " + formateur2.format(d1));

	}

}
