package com.jdc.mkk.date_calender;

import java.text.ParseException;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();
		c.setLenient(false);

		// System.out.println(c.getTime());
		getDate(c);
		setDate(c);

		// System.out.println(c.getTime());
		System.out.println();
		getDate(c);
	}

	static void setDate(Calendar c) {
		System.out.println();
		c.set(Calendar.DATE, 01);
		c.set(Calendar.MONTH, 02);
		c.set(Calendar.YEAR, 2025);
		c.set(Calendar.DAY_OF_MONTH, 31);
	}

	static void getDate(Calendar c) {
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.DATE));
//		System.out.println(c.get(Calendar.DAY_OF_WEEK));
//		System.out.println(c.get(Calendar.DAY_OF_YEAR));
//		System.out.println(c.get(Calendar.MAY));
		System.out.println(c.getTime());
	}

}
