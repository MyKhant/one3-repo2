package com.jdc.mkk.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;

public class Main {

	public static void main(String[] args) {
//		LocalDateTime ld = LocalDateTime.now();
//		System.out.println(ld);
//		System.out.println("Year :" + ld.get(ChronoField.YEAR));
//		System.out.println("Month :" + ld.get(ChronoField.MONTH_OF_YEAR));
//		System.out.println("getHour :" + ld.getHour());
//		System.out.println("dayOfWeek :" + ld.getDayOfWeek());
		temporalAdj();
		LocalDateTime ld = LocalDateTime.now();
		LocalDateTime ld1 = ld.with(ChronoField.YEAR, 2020);
		System.out.println(ld1);

		Duration d = Duration.ofDays(20);
		LocalDateTime ld2 = ld.plus(d);
		System.out.println(ld2);
		LocalDateTime ld3 = ld.minus(d);
		System.out.println(ld3);

		System.out.println(ld.plusDays(30));

		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = lt1.plusHours(3);

		System.out.println(Duration.between(ld1, ld2));
	}

	static TemporalAdjuster temporalAdj() {
		TemporalAdjuster taj = tmp -> {
			return LocalDate.of(tmp.get(ChronoField.YEAR), tmp.get(ChronoField.MONTH_OF_YEAR), 23);
		};33
		return taj;
	}

}
