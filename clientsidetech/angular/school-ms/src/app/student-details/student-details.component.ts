import { Component, OnInit } from '@angular/core';
import { Student } from '../model/student';
import { StudentService } from '../services/studentservice';

@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent  {

  student;

  constructor(private studentService:StudentService){

  }

  fetchStudent(myform:any){
    let data=myform.value;
    let id:number=data.id;
    console.log("id for which student should be fetched="+id);
    this.student=this.studentService.fetchStudentById(id);
  }

}
