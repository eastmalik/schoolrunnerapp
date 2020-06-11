package com.cognixia.jump.fullstack.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		// Basic date object
		getDate();
		
		// Format date
		dateFormat();
		
		// LocalDate // LocalTime // LocalDateTime
		getLocalDateTime();
		
		// ZonedDateTime
		getZonedDate();
		
	}
	public static void getDate() {
		// create date for today
		Date today = new Date();
		System.out.println(today);
	}
	
	public static void dateFormat() {
		// make a date
		Date today = new Date();
		SimpleDateFormat sdfi, sdf2;
		sdfi = new SimpleDateFormat("MM/dd/yy");
		sdfi = new SimpleDateFormat("MMM/dd/yyyy");
		
		String format1 = sdfi.format(today);
		String format2 = sdfi.format(today);
		
		System.out.println(format1);
		System.out.println(format2);
	}
	
	public static void getLocalDateTime() {
		LocalDate july3 = LocalDate.of(2015, 07, 03);
		System.out.println(july3);
		LocalDate ld = LocalDate.parse("2015-07-03");
		
		LocalDate july6 = july3.plusDays(3);
		System.out.println(july6);
		System.out.println(july6.getDayOfWeek());
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		// Combo of LocalDate and LocalTime = LocalDateTime
		LocalDateTime ldt = LocalDateTime.of(july3, now);
		LocalDateTime ldt2 = LocalDateTime.of(2015,7,3,20,45);
		System.out.println(ldt);
		System.out.println(ldt2);
		
	}
	
	public static void getZonedDate() {
		LocalDateTime ldt;
		ZonedDateTime zdt;
		ZoneId zd;
		
		// list of all time zone
		System.out.println(ZoneId.getAvailableZoneIds());
		ldt = LocalDateTime.of(2020, 6, 3, 16, 19);
		
		zd = ZoneId.of("Europe/Paris");
		
		zdt = ZonedDateTime.of(ldt,zd);
		System.out.println(zdt);
	}
}
