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
		System.out.println("Date du 19/05/2016 � 23:59:30 au format yyyy/MM/dd : " + formateur1.format(d1));
		
		Calendar cal2 = Calendar.getInstance();
		Date d2 = cal2.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.FRANCE);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss : " + formateur2.format(d2));
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", Locale.FRANCE);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale française) : " + formateur3.format(d2));
		
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", Locale.CHINESE);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale chinoise) : " + formateur4.format(d2));
		
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", Locale.GERMAN);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale allemande) : " + formateur5.format(d2));
		
		Locale locale = new Locale("ru");
		SimpleDateFormat formateur6 = new SimpleDateFormat("EEEEE/MM/yyyy hh:mm:ss", locale);
		System.out.println("Date du jour format au dd/MM/yyyy hh:mm:ss (locale russe) : " + formateur6.format(d2));
		
		
		
	}

}
