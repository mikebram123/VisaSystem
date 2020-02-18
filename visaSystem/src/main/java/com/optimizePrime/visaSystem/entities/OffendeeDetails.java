package com.optimizePrime.visaSystem.entities;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="OffendeeDetails")
public class OffendeeDetails {
		
	long passportNo;
	String forename;
	String surname;
	int Age;
	String Crime;
	String Date;
	String Location;
	String Gender;
	
	public long getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}

	public String getForename() {
		return forename;		
		}
		
	public void setForename(String forename) {
		this.forename = forename;
		}
	
	public String getSurname() {
		return surname;
		}
	
	public void setSurname(String surname) {
		this.surname = surname;
		}
		
	public int getAge() {
		return Age;
		}
		
	public void setAge(int age) {
		Age = age;
		}
		
	public String getCrime() {
		return Crime;
		}
	
	public void setCrime(String crime) {
		Crime = crime;
		}
	
	public String getDate() {
		return Date;
		}
	
	public void setDate(String date) {
		Date = date;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
}