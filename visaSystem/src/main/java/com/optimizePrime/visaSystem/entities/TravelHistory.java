package com.optimizePrime.visaSystem.entities;

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

@Entity
@Table(name="JPA_TravelHistory")
public class TravelHistory {
	
		
	
	int travelHistoryId;
	Set<Country> countryRecords;
	int timesVisted;
	boolean refusedVisa;
	boolean refusedEntryAtBorder;
	boolean refusedPermissionToStay;
	boolean deported;
	boolean removed;
	boolean requiredToLeave;
	boolean bannedFromEntry;
	Application assignedApplication;
	
	@Id
	@Column(name="travel_history")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTravelHistoryId() {
		return travelHistoryId;
	}

	@ManyToOne
	@JoinColumn(name="fk_assigned_application")
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
	public Set<Country> getCountryRecords() {
		return countryRecords;
	}
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
	
	@Override
	public String toString() {
		return "TravelHistory [travelHistoryId=" + travelHistoryId + ", countryRecords=" + countryRecords
				+ ", timesVisted=" + timesVisted + ", refusedVisa=" + refusedVisa + ", refusedEntryAtBorder="
				+ refusedEntryAtBorder + ", refusedPermissionToStay=" + refusedPermissionToStay + ", deported="
				+ deported + ", removed=" + removed + ", requiredToLeave=" + requiredToLeave + ", bannedFromEntry="
				+ bannedFromEntry + ", assignedApplication=" + assignedApplication + "]";
	}
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
	