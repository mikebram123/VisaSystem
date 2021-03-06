package com.optimizePrime.visaSystem.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//This is the method that we use to get and compare dates, 
		//to see if they are less than or more than 10years ago.
@Component
@Scope("singleton")
public class AService {

	public static boolean inLast10Years(String Date) {//parameter using to find data in Last 10years
		double years = 0;
		try {
			//this converts DataBase date from String to Date Object
			Date date = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss").parse(Date); 
			//this gets the current date; as in todays date.
			Date currentDate = new Date(); 
			System.out.println(currentDate);
//The 'formula' to get the years between dates
			long diffMil = currentDate.getTime() - date.getTime(); //get miliseconds between dates
			long days = TimeUnit.MILLISECONDS.toDays(diffMil); //gets the number of days between dates
			years = days / 365.25; //gets the number of years between dates
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return years <= 10; //return date if its less than 10years or equals to ten years.
	}
	
	public static void main(String[]args)
	{

		String exampledate = "20-07-2014T10:20:00";
		
		System.out.println(inLast10Years(exampledate));//makes a call from method
		
	}
}
