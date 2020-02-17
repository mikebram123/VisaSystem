package com.optimizePrime.visaSystem.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import aj.org.objectweb.asm.Type;

	@Entity
	@Table(name="JPA_Application")
	public class Application {
		private int applicationid;
		private String dateYouPlanToLeaveUK;
		private String dateYouPlanToArriveUK;
		private String whatAreYouBeingPaidFor;
		private Double howMuchWillYouBePaid;
		private String whoWillBePayingYouInUK;
		private String passportExpiryDate;
		private String passportIssueDate;
		private Type passportIssuingAuthority;
		private Double totalPrice;
		private int lengthOfVisaVisit;
		private Applicant assignedApplicant;
		private boolean haveAddressInUK;
		private String addressInUK;
		private boolean familyInUK;
		private String reasonWhyTherePayingForVisit;
		private double howMuchMoneyAreTheyPaying;
		private boolean relyOnYouFinancially;
		private boolean receivedPublicFundsFromUK;
		private String whoIsPayingYourVisit;
		private double amountSpendEachMonth;
		private boolean anotherIncome;
		private double howMuchDoYouEarnAfterTax;
		
		private Applicant linkedApplicant;

		Set<TravelHistory> travelHistoryRecords = new HashSet<>();

		@ManyToOne
		@JoinColumn(name="fk_applicationid")
		public Applicant getLinkedApplicant() {
			return linkedApplicant;
		}

		public void setLinkedApplicant(Applicant linkedApplicant) {
			this.linkedApplicant = linkedApplicant;
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

		public Type getPassportIssuingAuthority() {
			return passportIssuingAuthority;
		}

		public void setPassportIssuingAuthority(Type passportIssuingAuthority) {
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

		public Applicant getAssignedApplicant() {
			return assignedApplicant;
		}

		public void setAssignedApplicant(Applicant assignedApplicant) {
			this.assignedApplicant = assignedApplicant;
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

		@OneToMany(mappedBy="assignedApplication",cascade=CascadeType.ALL)
		public Set<TravelHistory> getTravelHistoryRecords() {
			return travelHistoryRecords;
		}

		public void setTravelHistoryRecords(Set<TravelHistory> travelHistoryRecords) {
			this.travelHistoryRecords = travelHistoryRecords;
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
					+ lengthOfVisaVisit + ", assignedApplicant=" + assignedApplicant + ", haveAddressInUK="
					+ haveAddressInUK + ", addressInUK=" + addressInUK + ", familyInUK=" + familyInUK
					+ ", reasonWhyTherePayingForVisit=" + reasonWhyTherePayingForVisit + ", howMuchMoneyAreTheyPaying="
					+ howMuchMoneyAreTheyPaying + ", relyOnYouFinancially=" + relyOnYouFinancially
					+ ", receivedPublicFundsFromUK=" + receivedPublicFundsFromUK + ", whoIsPayingYourVisit="
					+ whoIsPayingYourVisit + ", amountSpendEachMonth=" + amountSpendEachMonth + ", anotherIncome="
					+ anotherIncome + ", howMuchDoYouEarnAfterTax=" + howMuchDoYouEarnAfterTax + ", linkedApplicant="
					+ linkedApplicant + ", travelHistoryRecords=" + travelHistoryRecords + "]";
		}
			
	}