import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../model/student';
import { StudentService } from '../services/studentservice';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent {
  
students=[];

constructor(private studentService:StudentService){

  let observable:Observable<Student[]>=this.studentService.fetchStudents();
  observable.subscribe(
    (studentsArg:Student[])=>this.students=studentsArg,
    err=>console.log("err is "+err.message)
  ); 
}




}
