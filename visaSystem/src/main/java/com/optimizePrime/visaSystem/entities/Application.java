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
@Table(name="JPA_Application")
public class Application {
	private int applicationid;
	
	@FormParam("dateYouPlanToLeaveUK")
	private String dateYouPlanToLeaveUK;
	
	@FormParam("dateYouPlanToArriveUK")
	private String dateYouPlanToArriveUK;
	
	@FormParam("whatAreYouBeingPaidFor")
	private String whatAreYouBeingPaidFor;
	
	@FormParam("howMuchWillYouBePaid")
	private Double howMuchWillYouBePaid;
	
	@FormParam("whoWillBePayingYouInUK")
	private String whoWillBePayingYouInUK;
	
	@FormParam("passportExpiryDate")
	private String passportExpiryDate;
	
	@FormParam("passportIssueDate")
	private String passportIssueDate;
	
	@FormParam("passportIssuingAuthority")
	private String passportIssuingAuthority;
	
	@FormParam("totalPrice")
	private Double totalPrice;
	
	@FormParam("lengthOfVisaVisit")
	private int lengthOfVisaVisit;
	
	@FormParam("haveAddressInUK")
	private boolean haveAddressInUK;
	
	@FormParam("addressInUK")
	private String addressInUK;
	
	@FormParam("familyInUK")
	private boolean familyInUK;
	
	@FormParam("reasonWhyTherePayingForVisit")
	private String reasonWhyTherePayingForVisit;
	
	@FormParam("howMuchMoneyAreTheyPaying")
	private double howMuchMoneyAreTheyPaying;
	
	@FormParam("relyOnYouFinancially")
	private boolean relyOnYouFinancially;
	
	@FormParam("receivedPublicFundsFromUK")
	private boolean receivedPublicFundsFromUK;
	
	@FormParam("whoIsPayingYourVisit")
	private String whoIsPayingYourVisit;
	
	@FormParam("amountSpendEachMonth")
	private double amountSpendEachMonth;
	
	@FormParam("anotherIncome")
	private boolean anotherIncome;
	
	@FormParam("howMuchDoYouEarnAfterTax")
	private double howMuchDoYouEarnAfterTax;

	private Applicant assignedApplicant;

	private Set<TravelHistory> travelHistoryRecords = new HashSet<>();


	@ManyToOne
	@JoinColumn(name="fk_assigned_applicant")
	@XmlTransient
	public Applicant getAssignedApplicant() {
		return assignedApplicant;
	}

	public void setAssignedApplicant(Applicant assignedApplicant) {
		this.assignedApplicant = assignedApplicant;
	}

	@OneToMany(mappedBy="assignedApplication")
	@XmlTransient
	public Set<TravelHistory> getTravelHistoryRecords() {
		return travelHistoryRecords;
	}

	public void setTravelHistoryRecords(Set<TravelHistory> travelHistoryRecords) {
		this.travelHistoryRecords = travelHistoryRecords;
	}

	@Id // marking the property as primary Key for the table.
	@Column(name="application_number") // using Column to provide the default column name.
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getApplicationid() {
		return applicationid;
	}

	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}

	public String getDateYouPlanToLeaveUK() {
		return dateYouPlanToLeaveUK;
	}

	public void setDateYouPlanToLeaveUK(String dateYouPlanToLeaveUK) {
		this.dateYouPlanToLeaveUK = dateYouPlanToLeaveUK;
	}

	public String getDateYouPlanToArriveUK() {
		return dateYouPlanToArriveUK;
	}

	public void setDateYouPlanToArriveUK(String dateYouPlanToArriveUK) {
		this.dateYouPlanToArriveUK = dateYouPlanToArriveUK;
	}

	public String getWhatAreYouBeingPaidFor() {
		return whatAreYouBeingPaidFor;
	}

	public void setWhatAreYouBeingPaidFor(String whatAreYouBeingPaidFor) {
		this.whatAreYouBeingPaidFor = whatAreYouBeingPaidFor;
	}

	public Double getHowMuchWillYouBePaid() {
		return howMuchWillYouBePaid;
	}

	public void setHowMuchWillYouBePaid(Double howMuchWillYouBePaid) {
		this.howMuchWillYouBePaid = howMuchWillYouBePaid;
	}

	public String getWhoWillBePayingYouInUK() {
		return whoWillBePayingYouInUK;
	}

	public void setWhoWillBePayingYouInUK(String whoWillBePayingYouInUK) {
		this.whoWillBePayingYouInUK = whoWillBePayingYouInUK;
	}

	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getPassportIssueDate() {
		return passportIssueDate;
	}

	public void setPassportIssueDate(String passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}



	public String getPassportIssuingAuthority() {
		return passportIssuingAuthority;
	}

	public void setPassportIssuingAuthority(String passportIssuingAuthority) {
		this.passportIssuingAuthority = passportIssuingAuthority;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getLengthOfVisaVisit() {
		return lengthOfVisaVisit;
	}

	public void setLengthOfVisaVisit(int lengthOfVisaVisit) {
		this.lengthOfVisaVisit = lengthOfVisaVisit;
	}

	public boolean isHaveAddressInUK() {
		return haveAddressInUK;
	}

	public void setHaveAddressInUK(boolean haveAddressInUK) {
		this.haveAddressInUK = haveAddressInUK;
	}

	public String getAddressInUK() {
		return addressInUK;
	}

	public void setAddressInUK(String addressInUK) {
		this.addressInUK = addressInUK;
	}

	public boolean isFamilyInUK() {
		return familyInUK;
	}

	public void setFamilyInUK(boolean familyInUK) {
		this.familyInUK = familyInUK;
	}

	public String getReasonWhyTherePayingForVisit() {
		return reasonWhyTherePayingForVisit;
	}

	public void setReasonWhyTherePayingForVisit(String reasonWhyTherePayingForVisit) {
		this.reasonWhyTherePayingForVisit = reasonWhyTherePayingForVisit;
	}

	public double getHowMuchMoneyAreTheyPaying() {
		return howMuchMoneyAreTheyPaying;
	}

	public void setHowMuchMoneyAreTheyPaying(double howMuchMoneyAreTheyPaying) {
		this.howMuchMoneyAreTheyPaying = howMuchMoneyAreTheyPaying;
	}

	public boolean isRelyOnYouFinancially() {
		return relyOnYouFinancially;
	}

	public void setRelyOnYouFinancially(boolean relyOnYouFinancially) {
		this.relyOnYouFinancially = relyOnYouFinancially;
	}

	public boolean isReceivedPublicFundsFromUK() {
		return receivedPublicFundsFromUK;
	}

	public void setReceivedPublicFundsFromUK(boolean receivedPublicFundsFromUK) {
		this.receivedPublicFundsFromUK = receivedPublicFundsFromUK;
	}

	public String getWhoIsPayingYourVisit() {
		return whoIsPayingYourVisit;
	}

	public void setWhoIsPayingYourVisit(String whoIsPayingYourVisit) {
		this.whoIsPayingYourVisit = whoIsPayingYourVisit;
	}

	public double getAmountSpendEachMonth() {
		return amountSpendEachMonth;
	}

	public void setAmountSpendEachMonth(double amountSpendEachMonth) {
		this.amountSpendEachMonth = amountSpendEachMonth;
	}

	public boolean isAnotherIncome() {
		return anotherIncome;
	}

	public void setAnotherIncome(boolean anotherIncome) {
		this.anotherIncome = anotherIncome;
	}

	public double getHowMuchDoYouEarnAfterTax() {
		return howMuchDoYouEarnAfterTax;
	}

	public void setHowMuchDoYouEarnAfterTax(double howMuchDoYouEarnAfterTax) {
		this.howMuchDoYouEarnAfterTax = howMuchDoYouEarnAfterTax;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + applicationid;
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
		Application other = (Application) obj;
		if (applicationid != other.applicationid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Application [applicationid=" + applicationid + ", dateYouPlanToLeaveUK=" + dateYouPlanToLeaveUK
				+ ", dateYouPlanToArriveUK=" + dateYouPlanToArriveUK + ", whatAreYouBeingPaidFor="
				+ whatAreYouBeingPaidFor + ", howMuchWillYouBePaid=" + howMuchWillYouBePaid
				+ ", whoWillBePayingYouInUK=" + whoWillBePayingYouInUK + ", passportExpiryDate="
				+ passportExpiryDate + ", passportIssueDate=" + passportIssueDate + ", passportIssuingAuthority="
				+ passportIssuingAuthority + ", totalPrice=" + totalPrice + ", lengthOfVisaVisit="
				+ lengthOfVisaVisit + ", haveAddressInUK=" + haveAddressInUK + ", addressInUK=" + addressInUK
				+ ", familyInUK=" + familyInUK + ", reasonWhyTherePayingForVisit=" + reasonWhyTherePayingForVisit
				+ ", howMuchMoneyAreTheyPaying=" + howMuchMoneyAreTheyPaying + ", relyOnYouFinancially="
				+ relyOnYouFinancially + ", receivedPublicFundsFromUK=" + receivedPublicFundsFromUK
				+ ", whoIsPayingYourVisit=" + whoIsPayingYourVisit + ", amountSpendEachMonth="
				+ amountSpendEachMonth + ", anotherIncome=" + anotherIncome + ", howMuchDoYouEarnAfterTax="
				+ howMuchDoYouEarnAfterTax + "]";
	}



}