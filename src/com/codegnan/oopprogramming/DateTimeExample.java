package com.codegnan.oopprogramming;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
public class DateTimeExample {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Current Date:"+date);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Current Date and Time:"+dateTime);
		LocalTime time=LocalTime.now();
		System.out.println("Current Time:"+time);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.println("Day:"+dd);
		System.out.println("Month:"+mm);
		System.out.println("Year"+yy);
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		System.out.println("Hour:"+h);
		System.out.println("Minute:"+m);
		System.out.println("Second:"+s);
		System.out.println("After 6 months:"+date.plusMonths(6));
		System.out.println("Before 8 months:"+date.minusDays(8));
		//Creating a new date
		LocalDateTime dt=LocalDateTime.of(2000,Month.MAY,23,11,11,15);
		System.out.println("New Date and Time:"+dt);
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(la);
		System.out.println("Zoned Date  Time:"+zt);
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(2005,3,25);
		Period p=Period.between(birthday, today);
		System.out.println(p);
		System.out.printf("Age is %d years,%d is moths,and %d days.\n",p.getYears(),p.getMonths(),p.getDays());
		Date obj=new Date();
		System.out.println(obj);
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		String date1=format.format(obj);
		System.out.println(date1);
		format=new SimpleDateFormat("dd MMM yyy EEEE");
		date1=format.format(obj);
		System.out.println(date1);
	}

}
