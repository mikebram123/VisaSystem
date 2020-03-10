import { NgModule } from '@angular/core';
import { HomeComponent } from './home/home.component';
import { ApplicantComponent } from './applicant/applicant.component';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:"applicant",component:ApplicantComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
