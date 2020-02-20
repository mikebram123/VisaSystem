package com.optimizePrime.visaSystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="JPA_Country")
public class Country {
	
	int countryId;
	@FormParam("countryVisited")
	String countryVisited;
	
	//Relationship
	
	TravelHistory assignedTravelHistory;
	
	@ManyToOne
	@JoinColumn(name="fk_country_records")
	@XmlTransient
	public TravelHistory getAssignedTravelHistory() {
		return assignedTravelHistory;
	}
	public void setAssignedTravelHistory(TravelHistory assignedTravelHistory) {
		this.assignedTravelHistory = assignedTravelHistory;
	}
	
	//Getters and Setters
	
	@Id
	@Column(name="Country_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryVisited() {
		return countryVisited;
	}
	public void setCountryVisited(String countryVisited) {
		this.countryVisited = countryVisited;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryVisited=" + countryVisited + ", assignedTravelHistory="
				+ assignedTravelHistory + "]";
	}
	
	//HashCode
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (countryId != other.countryId)
			return false;
		return true;
	}
	
	

}
