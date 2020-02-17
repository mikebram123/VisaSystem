package com.optimizePrime.visaSystem.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.id.Assigned;

public class Country {
	
	int countryId;
	String countryVisited;
	Assigned travelHistory;
	
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
	@OneToMany(mappedBy="assignedCountry")
	public Assigned getTravelHistory() {
		return travelHistory;
	}
	public void setTravelHistory(Assigned travelHistory) {
		this.travelHistory = travelHistory;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryVisited=" + countryVisited + ", travelHistory="
				+ travelHistory + "]";
	}
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
