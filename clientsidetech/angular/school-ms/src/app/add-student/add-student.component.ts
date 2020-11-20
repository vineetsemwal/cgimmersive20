import { Component, OnInit } from '@angular/core';
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
    this.studentService.addStudent(this.student);
    console.log("received="+data.firstName+" "+data.lastName+" "+data.age);       
    myform.reset();// clear form
  }

}
