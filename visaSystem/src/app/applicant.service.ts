import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Applicant } from './applicant';
import { Application } from './application';

@Injectable({
  providedIn: 'root'
})
export class ApplicantService {
  serviceURL:string

  constructor(private httpSvc:HttpClient) {
    this.serviceURL="http://localhost:7777/visaSystem/applicant"
   }

   findApplicantByApplicantId(applicantId:number):Observable<Applicant>{
    return this.httpSvc.get<Applicant>(this.serviceURL+"/find/"+applicantId)
  }

  findApplicationByApplicantId(applicantId:number):Observable<Application[]>{
    return this.httpSvc.get<Application[]>(this.serviceURL+"/applications/"+applicantId)
  }

  registerApplicationForApplicant(applicantId:number,newApplication:Application):Observable<Application>{
    var contentData = "applicantId="+applicantId
                      +"&dateYouPlanToLeaveUK="+newApplication.dateYouPlanToLeaveUK
                      +"&dateYouPlanToArriveUK="+newApplication.dateYouPlanToArriveUK
                      +"&whatAreYouBeingPaidFor="+newApplication.whatAreYouBeingPaidFor
                      +"&howMuchWillYouBepaid="+newApplication.howMuchWillYouBePaid
                      +"&whoWillBePayingYouInUK="+newApplication.whoWillBePayingYouInUK
                      +"&passportExpiryDate="+newApplication.passportExpiryDate
                      +"&passportIssueDate="+newApplication.passportIssueDate
                      +"&passportIssuingAuthority="+newApplication.passportIssuingAuthority
                      +"&totalPrice="+newApplication.totalPrice
                      +"&lengthOfVisaVisit="+newApplication.lengthOfVisaVisit
                      +"&haveAddressInUK="+newApplication.haveAddressInUK
                      +"&addressInUK="+newApplication.addressInUK
                      +"&familyInUK="+newApplication.familyInUK
                      +"&reasonWhyTherePayingForVisit="+newApplication.reasonWhyTherePayingForVisit
                      +"&howMuchMoneyAreTheyPaying="+newApplication.howMuchMoneyAreTheyPaying
                      +"&relyOnYouFinancially="+newApplication.relyOnYouFinancially
                      +"&recievedPublicFundsFromUK="+newApplication.receivedPublicFundsFromUK
                      +"&whoIsPayingYourVisit="+newApplication.whoIsPayingYourVisit
                      +"&amountSpendEachMonth="+newApplication.amountSpendEachMonth
                      +"&anotherIncome="+newApplication.anotherIncome
                      +"&howMuchDoYouEarnAfterTax="+newApplication.howMuchDoYouEarnAfterTax

    const httpOptions= {
      headers: new HttpHeaders(
        {"Content-Type":"application/x-www-form-urlencoded"}
      )
    }
    return this.httpSvc.post<Application>(this.serviceURL+"/applications/register", contentData,httpOptions)
   }
}