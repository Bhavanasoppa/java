package com.day3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TimeDate {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);

		DateTimeFormatter newPattern=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String Date1=date.format(newPattern);
		System.out.println(Date1);
		LocalTime time=LocalTime.now();
		DateTimeFormatter tformatter=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(tformatter.format(time));
	}
}
