package com.optimizePrime.visaSystem.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="JPA_TravelHistory")
public class TravelHistory {
	
	
	int travelHistoryId;
	
	@FormParam("timesVisted")
	int timesVisted;
	
	@FormParam("refusedVisa")
	boolean refusedVisa;
	
	@FormParam("refusedEntryAtBorder")
	boolean refusedEntryAtBorder;
	
	@FormParam("refusedPermissionToStay")
	boolean refusedPermissionToStay;
	
	@FormParam("deported")
	boolean deported;
	
	@FormParam("removed")
	boolean removed;
	
	@FormParam("requiredToLeave")
	boolean requiredToLeave;
	
	@FormParam("bannedFromEntry")
	boolean bannedFromEntry;
	
	//RELATIONSHIPS
	
	Application assignedApplication;
	Set<Country> countryRecords = new HashSet<>();
	
	@Id
	@Column(name="travel_history")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTravelHistoryId() {
		return travelHistoryId;
	}

	@ManyToOne
	@JoinColumn(name="fk_assigned_application")
	@XmlTransient
	public Application getAssignedApplication() {
		return assignedApplication;
	}
	public void setAssignedApplication(Application assignedApplication) {
		this.assignedApplication = assignedApplication;
	}
	public void setTravelHistoryId(int travelHistoryId) {
		this.travelHistoryId = travelHistoryId;
	}
	
	@OneToMany(mappedBy="assignedTravelHistory")
	@XmlTransient
	public Set<Country> getCountryRecords() {
		return countryRecords;
	}
	
	//GETTERS AND SETTERS
	
	public void setCountryRecords(Set<Country> countryRecords) {
		this.countryRecords = countryRecords;
	}
	public int getTimesVisted() {
		return timesVisted;
	}
	public void setTimesVisted(int timesVisted) {
		this.timesVisted = timesVisted;
	}
	public boolean isRefusedVisa() {
		return refusedVisa;
	}
	public void setRefusedVisa(boolean refusedVisa) {
		this.refusedVisa = refusedVisa;
	}
	public boolean isRefusedEntryAtBorder() {
		return refusedEntryAtBorder;
	}
	public void setRefusedEntryAtBorder(boolean refusedEntryAtBorder) {
		this.refusedEntryAtBorder = refusedEntryAtBorder;
	}
	public boolean isRefusedPermissionToStay() {
		return refusedPermissionToStay;
	}
	public void setRefusedPermissionToStay(boolean refusedPermissionToStay) {
		this.refusedPermissionToStay = refusedPermissionToStay;
	}
	public boolean isDeported() {
		return deported;
	}
	public void setDeported(boolean deported) {
		this.deported = deported;
	}
	public boolean isRemoved() {
		return removed;
	}
	public void setRemoved(boolean removed) {
		this.removed = removed;
	}
	public boolean isRequiredToLeave() {
		return requiredToLeave;
	}
	public void setRequiredToLeave(boolean requiredToLeave) {
		this.requiredToLeave = requiredToLeave;
	}
	public boolean isBannedFromEntry() {
		return bannedFromEntry;
	}
	public void setBannedFromEntry(boolean bannedFromEntry) {
		this.bannedFromEntry = bannedFromEntry;
	
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "TravelHistory [travelHistoryId=" + travelHistoryId 
				+ ", timesVisted=" + timesVisted + ", refusedVisa=" + refusedVisa + ", refusedEntryAtBorder="
				+ refusedEntryAtBorder + ", refusedPermissionToStay=" + refusedPermissionToStay + ", deported="
				+ deported + ", removed=" + removed + ", requiredToLeave=" + requiredToLeave + ", bannedFromEntry="
				+ bannedFromEntry  + "]";
	}
	
	//HASHCODE
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + travelHistoryId;
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
		TravelHistory other = (TravelHistory) obj;
		if (travelHistoryId != other.travelHistoryId)
			return false;
		return true;
	}
	
}
	