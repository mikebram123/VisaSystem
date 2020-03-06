export interface Applicant {

    applicantId: number
    name: string
    passportNo: number
    coutryOfNationality: string
    datOfBirth: String
    gender: String
    contactEmail: string
    contactLanguage: string
    placeOfBirth: string
    relationshipStatus: string
    haveEmail: boolean
    whoDoesThisEmailBelongTo: string
    familyName: string
    givenName:string
    canBeContactedByTelephone: boolean
    typeOfTelephone: string
    forUseWhileOutsideOfUK: boolean
    forUseWhileInsideOfUK: boolean
    whereDoYouUseTelephone: string
    telephone: number
    recievedUKMedicalTreatment: boolean
    haveUKDrivingLicense: boolean
    address: string
    ownershipStatusOfHome: string
    howLongHaveYouLivedAtThisAddress: number
    thisCorrespondenceAddress: boolean
    holdAnyOtherCItizenship: boolean
    nationalIdentityNo: number
    issuingAuthority: string
    enteredUKIllegally: boolean
    remainedInUKBeyondVisa: boolean
    breachedConditions: boolean
    beenInUkPast10Years: boolean
    currentApplicationStatus: string
}
