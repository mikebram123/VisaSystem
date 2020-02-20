package com.optimizePrime.visaSystem.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement //declares the entity to be transformed to xml or JSON
@Entity  //declared the class as an entity which will be managed by JPA
@Table(name="JPA_Applicant") //declare the table name associated with the class
public class Applicant {

	int applicantId;
	@FormParam("name")
	String Name;
	
	@FormParam("passportNo")
	long passportNo;
	
	@FormParam("coutryOfNationality")
	String coutryOfNationality;
	
	@FormParam("datOfBirth")
	String datOfBirth;
	
	@FormParam("gender")
	Gender gender;
	
	@FormParam("contactEmail")
	String contactEmail;
	
	@FormParam("contactLanguage")
	String contactLanguage;
	
	@FormParam("placeOfBirth")
	String placeOfBirth;
	
	@FormParam("countryOfBirth")
	String countryOfBirth;
	
	@FormParam("relationshipStatus")
	RelationshipStatus relationshipStatus;
	
	@FormParam("haveEmail")
	boolean haveEmail;
	
	@FormParam("whoDoesThisEmailBelongTo")
	String whoDoesThisEmailBelongTo; // do we need this??
	
	@FormParam("familyName")
	String familyName;
	
	@FormParam("givenName")
	String givenName;
	
	@FormParam("canBeContactedByTelephone")
	boolean canBeContactedByTelephone;
	
	@FormParam("typeOfTelephone")
	TypeOfTelephone typeOfTelephone;
	
	@FormParam("forUseWhileOutsideOfUK")
	boolean forUseWhileOutsideOfUK;
	
	@FormParam("forUseWhileInsideOfUK")
	boolean forUseWhileInsideOfUK;
	
	@FormParam("whereDoYouUseTelephone")
	String whereDoYouUseTelephone;
	
	@FormParam("telephone")
	long telephone;
	
	@FormParam("recievedUKMedicalTreatment")
	boolean recievedUKMedicalTreatment;
	
	@FormParam("haveUKDrivingLicense")
	boolean haveUKDrivingLicense;
	
	@FormParam("address")
	String address;
	
	@FormParam("ownershipStatusOfHome")
	String ownershipStatusOfHome;
	
	@FormParam("howLongHaveYouLivedAtThisAddress")
	double howLongHaveYouLivedAtThisAddress;
	
	@FormParam("isThisCorrespondenceAddress")
	boolean isThisCorrespondenceAddress;
	
	@FormParam("holdAnyOtherCItizenship")
	boolean holdAnyOtherCItizenship;
	
	@FormParam("nationalIdentityNo")
	long nationalIdentityNo;
	
	@FormParam("issuingAuthority")
	String issuingAuthority;
	
	@FormParam("enteredUKIllegally")
	boolean enteredUKIllegally;
	
	@FormParam("remainedInUKBeyondVisa")
	boolean remainedInUKBeyondVisa;
	
	@FormParam("breachedConditions")
	boolean breachedConditions;
	
	@FormParam("beenInUkPast10Years")
	boolean beenInUkPast10Years;
	
	@FormParam("currentApplicationStatus")
	String currentApplicationStatus;
	
	
	Set<Dependant> dependantsRecords= new HashSet <>();
	
	Set<EmploymentHistory> employmentHistoryRecords= new HashSet<>();
	
	Set<Application> applicationRecords= new HashSet<>();

	public String getCurrentApplicationStatus() {
		return currentApplicationStatus;
	}

	public void setCurrentApplicationStatus(String currentApplicationStatus) {
		this.currentApplicationStatus = currentApplicationStatus;
	}

	@OneToMany(mappedBy="assignedApplicant",cascade=CascadeType.ALL)
	@XmlTransient  
	public Set<Dependant> getDependantsRecords() {
		return dependantsRecords;
	}

	public void setDependantsRecords(Set<Dependant> dependantsRecords) {
		this.dependantsRecords = dependantsRecords;
	}
	
	@OneToMany(mappedBy="assignedApplicant",cascade=CascadeType.ALL)
	@XmlTransient  
	public Set<EmploymentHistory> getEmploymentHistoryRecords() {
		return employmentHistoryRecords;
	}

	public void setEmploymentHistoryRecords(Set<EmploymentHistory> employmentHistoryRecords) {
		this.employmentHistoryRecords = employmentHistoryRecords;
	}

	@OneToMany(mappedBy="assignedApplicant",cascade=CascadeType.ALL)
	@XmlTransient  
	public Set<Application> getApplicationRecords() {
		return applicationRecords;
	}

	public void setApplicationRecords(Set<Application> applicationRecords) {
		this.applicationRecords = applicationRecords;
	}
	

	public Applicant() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="Applicant_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	@Column(name="Applicant_name",length=50,nullable=false)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	@Column(name="Passport_No",length=9,nullable=false)
	public long getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}

	public String getCoutryOfNationality() {
		return coutryOfNationality;
	}

	public void setCoutryOfNationality(String coutryOfNationality) {
		this.coutryOfNationality = coutryOfNationality;
	}
	@Column(name="Date_ofBirth",length=10,nullable=false)
	public String getDatOfBirth() {
		return datOfBirth;
	}

	public void setDatOfBirth(String datOfBirth) {
		this.datOfBirth = datOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactLanguage() {
		return contactLanguage;
	}

	public void setContactLanguage(String contactLanguage) {
		this.contactLanguage = contactLanguage;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public RelationshipStatus getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public boolean isHaveEmail() {
		return haveEmail;
	}

	public void setHaveEmail(boolean haveEmail) {
		this.haveEmail = haveEmail;
	}

	public String getWhoDoesThisEmailBelongTo() {
		return whoDoesThisEmailBelongTo;
	}

	public void setWhoDoesThisEmailBelongTo(String whoDoesThisEmailBelongTo) {
		this.whoDoesThisEmailBelongTo = whoDoesThisEmailBelongTo;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public boolean isCanBeContactedByTelephone() {
		return canBeContactedByTelephone;
	}

	public void setCanBeContactedByTelephone(boolean canBeContactedByTelephone) {
		this.canBeContactedByTelephone = canBeContactedByTelephone;
	}

	public TypeOfTelephone getTypeOfTelephone() {
		return typeOfTelephone;
	}

	public void setTypeOfTelephone(TypeOfTelephone typeOfTelephone) {
		this.typeOfTelephone = typeOfTelephone;
	}

	public boolean isForUseWhileOutsideOfUK() {
		return forUseWhileOutsideOfUK;
	}

	public void setForUseWhileOutsideOfUK(boolean forUseWhileOutsideOfUK) {
		this.forUseWhileOutsideOfUK = forUseWhileOutsideOfUK;
	}

	public boolean isForUseWhileInsideOfUK() {
		return forUseWhileInsideOfUK;
	}

	public void setForUseWhileInsideOfUK(boolean forUseWhileInsideOfUK) {
		this.forUseWhileInsideOfUK = forUseWhileInsideOfUK;
	}

	public String getWhereDoYouUseTelephone() {
		return whereDoYouUseTelephone;
	}

	public void setWhereDoYouUseTelephone(String whereDoYouUseTelephone) {
		this.whereDoYouUseTelephone = whereDoYouUseTelephone;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public boolean isRecievedUKMedicalTreatment() {
		return recievedUKMedicalTreatment;
	}

	public void setRecievedUKMedicalTreatment(boolean recievedUKMedicalTreatment) {
		this.recievedUKMedicalTreatment = recievedUKMedicalTreatment;
	}

	public boolean isHaveUKDrivingLicense() {
		return haveUKDrivingLicense;
	}

	public void setHaveUKDrivingLicense(boolean haveUKDrivingLicense) {
		this.haveUKDrivingLicense = haveUKDrivingLicense;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwnershipStatusOfHome() {
		return ownershipStatusOfHome;
	}

	public void setOwnershipStatusOfHome(String ownershipStatusOfHome) {
		this.ownershipStatusOfHome = ownershipStatusOfHome;
	}

	public double getHowLongHaveYouLivedAtThisAddress() {
		return howLongHaveYouLivedAtThisAddress;
	}

	public void setHowLongHaveYouLivedAtThisAddress(double howLongHaveYouLivedAtThisAddress) {
		this.howLongHaveYouLivedAtThisAddress = howLongHaveYouLivedAtThisAddress;
	}

	public boolean isThisCorrespondenceAddress() {
		return isThisCorrespondenceAddress;
	}

	public void setThisCorrespondenceAddress(boolean isThisCorrespondenceAddress) {
		this.isThisCorrespondenceAddress = isThisCorrespondenceAddress;
	}

	public boolean isHoldAnyOtherCItizenship() {
		return holdAnyOtherCItizenship;
	}

	public void setHoldAnyOtherCItizenship(boolean holdAnyOtherCItizenship) {
		this.holdAnyOtherCItizenship = holdAnyOtherCItizenship;
	}

	public long getNationalIdentityNo() {
		return nationalIdentityNo;
	}

	public void setNationalIdentityNo(long nationalIdentityNo) {
		this.nationalIdentityNo = nationalIdentityNo;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public boolean isEnteredUKIllegally() {
		return enteredUKIllegally;
	}

	public void setEnteredUKIllegally(boolean enteredUKIllegally) {
		this.enteredUKIllegally = enteredUKIllegally;
	}

	public boolean isRemainedInUKBeyondVisa() {
		return remainedInUKBeyondVisa;
	}

	public void setRemainedInUKBeyondVisa(boolean remainedInUKBeyondVisa) {
		this.remainedInUKBeyondVisa = remainedInUKBeyondVisa;
	}

	public boolean isBreachedConditions() {
		return breachedConditions;
	}

	public void setBreachedConditions(boolean breachedConditions) {
		this.breachedConditions = breachedConditions;
	}

	public boolean isBeenInUkPast10Years() {
		return beenInUkPast10Years;
	}

	public void setBeenInUkPast10Years(boolean beenInUkPast10Years) {
		this.beenInUkPast10Years = beenInUkPast10Years;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + applicantId;
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
		Applicant other = (Applicant) obj;
		if (applicantId != other.applicantId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", Name=" + Name + ", passportNo=" + passportNo
				+ ", coutryOfNationality=" + coutryOfNationality + ", datOfBirth=" + datOfBirth + ", gender=" + gender
				+ ", contactEmail=" + contactEmail + ", contactLanguage=" + contactLanguage + ", placeOfBirth="
				+ placeOfBirth + ", countryOfBirth=" + countryOfBirth + ", relationshipStatus=" + relationshipStatus
				+ ", haveEmail=" + haveEmail + ", whoDoesThisEmailBelongTo=" + whoDoesThisEmailBelongTo
				+ ", familyName=" + familyName + ", givenName=" + givenName + ", canBeContactedByTelephone="
				+ canBeContactedByTelephone + ", typeOfTelephone=" + typeOfTelephone + ", forUseWhileOutsideOfUK="
				+ forUseWhileOutsideOfUK + ", forUseWhileInsideOfUK=" + forUseWhileInsideOfUK
				+ ", whereDoYouUseTelephone=" + whereDoYouUseTelephone + ", telephone=" + telephone
				+ ", recievedUKMedicalTreatment=" + recievedUKMedicalTreatment + ", haveUKDrivingLicense="
				+ haveUKDrivingLicense + ", address=" + address + ", ownershipStatusOfHome=" + ownershipStatusOfHome
				+ ", howLongHaveYouLivedAtThisAddress=" + howLongHaveYouLivedAtThisAddress
				+ ", isThisCorrespondenceAddress=" + isThisCorrespondenceAddress + ", holdAnyOtherCItizenship="
				+ holdAnyOtherCItizenship + ", nationalIdentityNo=" + nationalIdentityNo + ", issuingAuthority="
				+ issuingAuthority + ", enteredUKIllegally=" + enteredUKIllegally + ", remainedInUKBeyondVisa="
				+ remainedInUKBeyondVisa + ", breachedConditions=" + breachedConditions + ", beenInUkPast10Years="
				+ beenInUkPast10Years + "]";
	}
	
	
	
	
}
