import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../model/student';

@Injectable()
export class StudentService{

      baseUrl="http://localhost:8585/students"
  
     constructor(private http:HttpClient){

     }



      addStudent(student:Student):Observable<Student>{
       const url=this.baseUrl+"/add";
       let requestData={firstName:student.firstName,lastName:student.lastName,age:student.age};
       let observable:Observable<Student>=this.http.post<Student>(url,requestData);
       return observable;
      }

      fetchStudents():Observable<Student[]>{
        const url=this.baseUrl;
       let observable:Observable<Student[]>= this.http.get<Student[]>(url);
       return observable; 
      }


      fetchStudentById(id:number):Observable<Student>{
       const url=this.baseUrl+"/by/id/"+id;
       let observable:Observable<Student> =this.http.get<Student>(url);
       return observable;
      }

}