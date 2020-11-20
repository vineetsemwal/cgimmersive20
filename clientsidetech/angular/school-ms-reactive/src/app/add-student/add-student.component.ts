import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../model/student';
import { StudentService } from '../services/studentservice';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent  {

  student:Student;

  constructor(private studentService:StudentService){

  }

  addStudent(myform:any){
    let data=myform.value;
    this.student=new Student(0,data.firstName,data.lastName,data.age);
    let observable:Observable<Student>=this.studentService.addStudent(this.student);
    observable.subscribe(
      (student:Student)=>this.student=student,
      err=>console.log("err is "+err.message)

    );
    console.log("received="+data.firstName+" "+data.lastName+" "+data.age);       
    myform.reset();// clear form
  }

}
