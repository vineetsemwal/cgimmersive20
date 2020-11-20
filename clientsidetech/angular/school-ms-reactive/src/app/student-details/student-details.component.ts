import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../model/student';
import { StudentService } from '../services/studentservice';

@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent  {

  student:Student;

  constructor(private studentService:StudentService){

  }

  fetchStudent(myform:any){
    let data=myform.value;
    let id:number=data.id;
    console.log("id for which student should be fetched="+id);
    let observable:Observable<Student>=this.studentService.fetchStudentById(id);
    //let successHandler=(student:Student)=>this.student=student;
    //let errHandler=err=>console.log("err is "+err.message);
    observable.subscribe(
      (student:Student)=>this.student=student,
      err=>console.log("err is "+err.message+" "+err.error)
    );
  }

}
