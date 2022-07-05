package com.java8features;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPIPeriod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate birthday=LocalDate.of(2000,7,27);
//		LocalDate today=LocalDate.now();
//		Period p=Period.between(birthday, today);
//		System.out.printf("Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
//		
		
		/*Zone*/
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(la);
		System.out.println(zt);

	}

}
