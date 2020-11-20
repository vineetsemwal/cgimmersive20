import { Component, OnInit } from '@angular/core';
import { Student } from '../model/student';
import { StudentService } from '../services/studentservice';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent  {
  
students=[];

constructor(private studentService:StudentService){
this.students=this.studentService.fetchStudents();
}


}
