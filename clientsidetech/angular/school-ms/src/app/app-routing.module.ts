import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddStudentComponent } from './add-student/add-student.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { StudentListComponent } from './student-list/student-list.component';

const routes: Routes = [
{
  path:'student-details',
  component:StudentDetailsComponent
},

{
  path:'add-student',
  component:AddStudentComponent
}
,
{
  path:'list-students',
  component:StudentListComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
