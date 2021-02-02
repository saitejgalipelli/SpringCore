package com.nt.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18nApp {
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Country language key: ");
		String langKey= sc.next();
		System.out.println("Enter Country Name key: ");
		String couKey= sc.next();
		
		// Create Locale object
		//Locale locale =new Locale(args[0],args[1]);
		Locale locale =new Locale(langKey,couKey);
		//Create ResourceBundle object
		ResourceBundle bundle= ResourceBundle.getBundle("com/nt/commons/App",locale);
		System.out.println(bundle.getString("wishMessage"));
		System.out.println(bundle.getString("welcome.message"));
		System.out.println(bundle.getString("bye.message"));
		}
	}

}
