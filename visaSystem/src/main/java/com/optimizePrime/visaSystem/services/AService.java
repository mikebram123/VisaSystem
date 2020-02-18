package com.optimizePrime.visaSystem.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class AService {

//Method that we will use to get current date
	public static boolean inLast10Years(String Date) {
		double years = 0;
		try { 				//example 
			String string = "18-02-2020T10:20:00";//comes from the param of date

			Date date = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss").parse(Date); //convert DB date from string to Date object
			Date currentDate = new Date(); //gets current date

			long diffMil = currentDate.getTime() - date.getTime(); //get miliseconds between dates
			long days = TimeUnit.MILLISECONDS.toDays(diffMil); //get days between dates
			years = days / 365.25; //gets years between dates
			// so meantion conflict in timezones between data in database and what we have in here
			//may not be an issue *

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return years <= 10;
	}
	public static Instant getDateFromString(String string)
	{
		Instant timeStamp = null;

		timeStamp=Instant.parse(string);

		return timeStamp;
	}

	public static void main(String[]args)
	{

		String exampledate = "13-02-2012T10:20:00";
		
		System.out.println(inLast10Years(exampledate));//make call from method
}

}
