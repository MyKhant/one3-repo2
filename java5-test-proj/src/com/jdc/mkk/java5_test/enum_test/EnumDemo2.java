package com.jdc.mkk.java5_test.enum_test;

public class EnumDemo2 {
	public static void main(String[] args) {
		
		//Day d=Day.MON;
		//System.out.println(d);
		//Day.MON.showName();
		showResult(Day.MON);
	}
	static void showResult(Day d) {
		d.showName();
		d.hide();
	}
}
