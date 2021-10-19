package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);
		Date d1 = cal1.getTime();
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
		String chaine1 = formateur1.format(d1);
		System.out.println("Date du 19/05/2016 à 23:59:30 au format yyyy/MM/dd : " + chaine1);
		
		Calendar cal2 = Calendar.getInstance();
		Date d2 = cal2.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.FRANCE);
		String chaine2 = formateur2.format(d2);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss : " + chaine2);
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", Locale.FRANCE);
		String chaine3 = formateur3.format(d2);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale française) : " + chaine3);
		
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", Locale.CHINESE);
		String chaine4 = formateur4.format(d2);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale chinoise) : " + chaine4);
		
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", Locale.GERMAN);
		String chaine5 = formateur5.format(d2);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale allemande) : " + chaine5);
		
		Locale locale = new Locale("ru");
		SimpleDateFormat formateur6 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", locale);
		String chaine6 = formateur6.format(d2);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale russe) : " + chaine6);
		
		
		
	}

}
