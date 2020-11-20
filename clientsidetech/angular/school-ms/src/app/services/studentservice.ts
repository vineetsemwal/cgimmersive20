import { Injectable } from '@angular/core';
import { Student } from '../model/student';

@Injectable()
export class StudentService{

    students=[]

      generateId():number{
         return this.students.length+1;
      }

      addStudent(student:Student):Student{
        let id=this.generateId();  
        student.id=id;
        this.students.push(student);
        return student;
      }

      fetchStudents():Student[]{
          return this.students;
      }


      fetchStudentById(id:number):Student{
        for(let student of this.students){
            console.log("id arge="+id+" stored id="+student.id);
            if(student.id===id){
                return student;
            }
        }
        return null;      
      }

}