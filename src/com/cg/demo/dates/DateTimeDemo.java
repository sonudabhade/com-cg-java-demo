package com.cg.demo.dates;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {

//		Date date = new Date();
//		System.out.println(date.toString());

		LocalDate date = LocalDate.now();
		System.out.println(date.toString());

		LocalDate iDay = LocalDate.of(1947, 8, 15);
		System.out.println(iDay.toString());

//		LocalDate myDate = LocalDate.parse("1947-08-15");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate myDate = LocalDate.parse("08-15-1947", formatter);
		System.out.println(myDate.toString());
        System.out.println(myDate.getDayOfMonth()); 
        System.out.println(myDate.format(formatter)); 
        //System.out.println(myDate.EPOCH); 
        System.out.println(LocalDate.EPOCH);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        LocalTime lt = LocalTime.now();
        System.out.println("Hour Minute Second nanosecond:"+lt);
         
        
        LocalDate manDate = LocalDate.now();
        LocalDate expDate = manDate.plusDays(180);

        LocalDate expDate2 = manDate.plusMonths(6);
        System.out.println("Manufacturing Date:" + manDate.toString());
        System.out.println("Expiry Date:"+expDate.toString());
        System.out.println("Expiry Date2:"+expDate2.toString());

        LocalDate expDate3 = manDate.minusDays(180);
        System.out.println("Expiry Date3:"+expDate3.toString());

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2021, 12, 31);
        System.out.println("Date1:"+ date1.datesUntil(date2).toString());
        System.out.println("Date2:"+date2.compareTo(date1));
        
        
        // formatting date
		// compare two dates and find the duration
		// add / subtract duration to date

	}

}
