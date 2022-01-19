package com.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class CustomDate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	 Date d1=new Date(); System.out.println(d1); 
	 LocalDate l1=LocalDate.now();
	 System.out.println(l1);
	
	int i=Integer.parseInt("78");
	
	System.out.println("Enter your birthdate dd/mm/yyyy");
	String birthdate=sc.next();
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	try {
		Date d2=sdf.parse(birthdate);
		
		System.out.println(d2);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	LocalDate l1=LocalDate.of(2020, 1, 10);
	System.out.println(l1);
	System.out.println(LocalDate.now());
	Period p=Period.between( l1,LocalDate.now());
	System.out.println("years:"+p.getYears());
	System.out.println("days:"+p.getDays());
	
}
}
