import { Component, OnChanges, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Observable } from 'rxjs';
import { Student } from '../model/student';
import { StudentService } from '../services/studentservice';

@Component({
  selector: 'app-studentlist-byname',
  templateUrl: './studentlist-byname.component.html',
  styleUrls: ['./studentlist-byname.component.css']
})
export class StudentlistBynameComponent  implements OnInit,OnDestroy{

  firstname:string;
  students:Student[]=[];

  constructor(private route:ActivatedRoute,private studentService:StudentService){

  }


  ngOnInit(): void {
   let observable:Observable<ParamMap>=this.route.paramMap;
   observable.subscribe(
     (params:ParamMap)=>{
      this.firstname= params.get('firstname');
      console.log("firstname passed in component="+this.firstname);  
      let observable:Observable<Student[]>= this.studentService.fetchStudententsByFirstName(this.firstname);
      observable.subscribe(
          (studentsArg:Student[])=>this.students=studentsArg,
          (err)=>console.log("isnide studentlist by name, err="+err.message+" "+err.error)
      );
    }
   )
  }

  ngOnDestroy(){
 console.log("inside ond destroy");
  }

}
