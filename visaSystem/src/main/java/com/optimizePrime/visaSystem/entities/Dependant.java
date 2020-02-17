package com.optimizePrime.visaSystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JPA_Dependant")
public class Dependant {
	
	private int dependantId;
	private String familyName;
	private String givenNames;
	private String dateOfBirth;
	private dependantRelationship relationshipToYou;
	private Boolean alwaysHadSameNationality;
	private String countryOfNationality;
	
	private Applicant assignedApplicant;
	
	public Dependant() {
		// TODO Auto-generated constructor stub
	}
	
	

	@ManyToOne
	@JoinColumn(name="fk_dependant_records")
	public Applicant getAssignedApplicant() {
		return assignedApplicant;
	}



	public void setAssignedApplicant(Applicant assignedApplicant) {
		this.assignedApplicant = assignedApplicant;
	}



	@Override
	public String toString() {
		return "Dependant [dependantId=" + dependantId + ", familyName=" + familyName + ", givenNames=" + givenNames
				+ ", dateOfBirth=" + dateOfBirth + ", relationshipToYou=" + relationshipToYou
				+ ", alwaysHadSameNationality=" + alwaysHadSameNationality + ", countryOfNationality="
				+ countryOfNationality + ", assignedApplicant=" + assignedApplicant + "]";
	}



	//GETTERS AND SETTERS
	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getDependantId() {
		return dependantId;
	}
	
	public void setDependantId(int dependentId) {
		this.dependantId = dependentId;
	}
	
	@Column(name="family_name", length=40, nullable=false)
	public String getFamilyName() {
		return familyName;
	}
	
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getGivenNames() {
		return givenNames;
	}
	
	public void setGivenNames(String givenNames) {
		this.givenNames = givenNames;
	}
	
	@Column(name="Date_of_birth", length=10, nullable=false)
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	//Create Enum
	@Enumerated(EnumType.STRING)
	public dependantRelationship getRelationshipToYou() {
		return relationshipToYou;
	}
	
	public void setRelationshipToYou(dependantRelationship relationshipToYou) {
		this.relationshipToYou = relationshipToYou;
	}
	
	public Boolean getAlwaysHadSameNationality() {
		return alwaysHadSameNationality;
	}
	
	public void setAlwaysHadSameNationality(Boolean alwaysHadSameNationality) {
		this.alwaysHadSameNationality = alwaysHadSameNationality;
	}
	
	public String getCountryOfNationality() {
		return countryOfNationality;
	}
	
	public void setCountryOfNationality(String countryOfNationality) {
		this.countryOfNationality = countryOfNationality;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dependantId;
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
		Dependant other = (Dependant) obj;
		if (dependantId != other.dependantId)
			return false;
		return true;
	}
	
}
