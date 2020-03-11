import { Component, OnInit } from '@angular/core';
import { Applicant } from '../applicant';
import { ApplicantService } from '../applicant.service';
import { Application } from '../application';

@Component({
  selector: 'app-applicant',
  templateUrl: './applicant.component.html',
  styleUrls: ['./applicant.component.css']
})
export class ApplicantComponent implements OnInit {

  isApplicantEditing: boolean
  isApplicantFormVisible:boolean
  currentApplicant: Applicant
  applicantApplications: Application[]
  isApplicationFormVisible: boolean

  constructor(private applicantService:ApplicantService) {
    this.isApplicationFormVisible=false
    this.isApplicantFormVisible=false
    this.currentApplicant={
      applicantId: 46,
      name: "Unknown",
      passportNo: -1,
      coutryOfNationality: "Unknown",
      datOfBirth: "Unknown",
      gender: "Unknown",
      contactEmail: "Unknown",
      contactLanguage: "Unknown",
      placeOfBirth: "Unknown",
      relationshipStatus: "Unknown",
      haveEmail: false,
      whoDoesThisEmailBelongTo: "Unknown",
      familyName: "Unknown",
      givenName: "Unknown",
      canBeContactedByTelephone: true,
      typeOfTelephone: "Unknown",
      forUseWhileOutsideOfUK: true,
      forUseWhileInsideOfUK:  true,
      whereDoYouUseTelephone: "Unknown",
      telephone: -1,
      recievedUKMedicalTreatment: false,
      haveUKDrivingLicense: false,
      address: "Unknown",
      ownershipStatusOfHome: "Unknown",
      howLongHaveYouLivedAtThisAddress: -1,
      thisCorrespondenceAddress: true,
      holdAnyOtherCItizenship: true,
      nationalIdentityNo: -1,
      issuingAuthority: "Unknown",
      enteredUKIllegally: false,
      remainedInUKBeyondVisa: false,
      breachedConditions: false,
      beenInUkPast10Years: false,
      currentApplicationStatus: "Unknown"
    }
   }

  ngOnInit(): void {
    this.fetchApplicantFromServer() 
  }

  fetchApplicantFromServer(){
    this.applicantService.findApplicantByApplicantId(this.currentApplicant.applicantId).subscribe(
      response => {
        console.log("Response received")
        this.currentApplicant=response
        this.fetchApplicantsApplicationsFromServer()
      }
    )
  }

  showApplicationForm(){
    console.log("jfdnsjf")
    this.isApplicationFormVisible= !this.isApplicationFormVisible
  }
  showApplicantForm(){
    console.log("this works")
    this.isApplicantFormVisible=!this.isApplicantFormVisible
    
  }

  addNewApplication(newApplication:Application){
    this.applicantService.registerApplicationForApplicant(
      this.currentApplicant.applicantId,newApplication
    ).subscribe(
      response =>{
        this.fetchApplicantsApplicationsFromServer()
      }
    )
    this.isApplicationFormVisible=false
  }


  fetchApplicantsApplicationsFromServer(){
    this.applicantService.findApplicationByApplicantId(this.currentApplicant.applicantId).subscribe(
      response=>{
        this.applicantApplications=response
      }
    )
  }

  toggleApplicantEditForm(){
    this.isApplicantEditing=!this.isApplicantEditing
    this.fetchApplicantFromServer()
  }

 

  
}
