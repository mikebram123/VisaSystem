package com.optimizePrime.visaSystem.entities;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="JPA_EmploymentHistory")
public class EmploymentHistory {

	int employmentId;
	String employerName;
	String employerAddress;
	String startDate;
	String employmentStatus;
	long telephone;
	Applicant assignedApplicant;
	
	public EmploymentHistory() {
	}

	@Id
	public int getEmploymentId() {
		return employmentId;
	}

	public void setEmploymentId(int employmentId) {
		this.employmentId = employmentId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerAddress() {
		return employerAddress;
	}

	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	
	@ManyToOne
	@JoinColumn(name="fk_assigned_applicant")
	public Applicant getAssignedApplicant() {
		return assignedApplicant;
	}

	public void setAssignedApplicant(Applicant assignedApplicant) {
		this.assignedApplicant = assignedApplicant;
	}
	
	
	
}
