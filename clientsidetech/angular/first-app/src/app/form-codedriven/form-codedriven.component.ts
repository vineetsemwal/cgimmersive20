import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { User } from '../model/user';

@Component({
  selector: 'form-codedriven',
  templateUrl: './form-codedriven.component.html',
  styleUrls: ['./form-codedriven.component.css']
})
export class FormCodedrivenComponent  {
user:User;  
userForm:FormGroup;
nameCtrl:FormControl;
ageCtrl:FormControl;

constructor(builder:FormBuilder){
 this.nameCtrl =builder.control('',[Validators.required, Validators.minLength(2)]);
 this.ageCtrl=builder.control('', [Validators.required]);
 this.userForm=builder.group(
{
fullname:this.nameCtrl,
age: this.ageCtrl 

} );  
}

addUser(){
let name:string=this.nameCtrl.value;
let age:number=this.ageCtrl.value;
this.user=new User(name,age);
console.log("inside addUser() name ="+name+" age="+age);
}

}
