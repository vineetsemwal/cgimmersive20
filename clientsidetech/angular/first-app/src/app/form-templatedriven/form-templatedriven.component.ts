import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';

@Component({
  selector: 'form-templatedriven',
  templateUrl: './form-templatedriven.component.html',
  styleUrls: ['./form-templatedriven.component.css']
})
export class FormTemplatedrivenComponent {

  user:User;


  addUser(formArg:any){
    let data=formArg.value;
     let name=data.fullname;
     let age=data.age;
     this.user=new User(name,age); 
     console.log("data received="+name+", "+age); 
  }

}
