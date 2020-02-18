package com.optimizePrime.visaSystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="JPA_EmploymentHistory")
public class EmploymentHistory {

	int employmentId;
	
	@FormParam("employerName")
	String employerName;
	
	@FormParam("employerAddress")
	String employerAddress;
	
	@FormParam("startDate")
	String startDate;
	
	@FormParam("employmentStatus")
	String employmentStatus;
	
	@FormParam("telephone")
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
	@XmlTransient
	public Applicant getAssignedApplicant() {
		return assignedApplicant;
	}

	public void setAssignedApplicant(Applicant assignedApplicant) {
		this.assignedApplicant = assignedApplicant;
	}
	
	
	
}
