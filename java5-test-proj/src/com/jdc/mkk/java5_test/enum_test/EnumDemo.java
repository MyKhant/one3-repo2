package com.jdc.mkk.java5_test.enum_test;

import java.util.Scanner;

public class EnumDemo {
	public static void main(String[] args) {
		/**
		Day d=Day.MON;
		System.out.println(d.name()+"\t"+d.ordinal());
		System.out.println(Day.MON==d);
		System.out.println(d);
		**/
		Scanner sc=new Scanner(System.in);
		System.out.println("""
				please type day!
				1.Mon
				2.Tue
				3.Wed
				4.Thur
				5.Fri
				6.Sat
				7.Sun
				""" );
		String s=sc.next();
		String result=checkWorkDay(Day.valueOf(s.toUpperCase()));
		System.out.println(String.format("Today is %s !", result));
	}
	static String checkWorkDay(Day day) {
		switch(day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			return "Work Day";
		case SAT:
		case SUN:
			return "Off Day";
		default:
				return "Something Wrong";
		}
	}
}
