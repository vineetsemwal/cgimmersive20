import { Component, OnInit, Injectable } from '@angular/core';
import { AuthenticationService } from '../authservice';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-authenticate',
  templateUrl: './authenticate.component.html',
  styleUrls: ['./authenticate.component.css']
})

export class AuthenticateComponent implements OnInit {
  
  error:string="";
  constructor(private service:AuthenticationService,private router: Router) {
   
   }

  ngOnInit(): void {
  }


  loginSubmit(form:any){
let data=form.value;
let username=data.username;
let password=data.password;
 let observable:Observable<boolean>=this.service.loginRequest(username,password);
 observable.subscribe(
   (result:boolean)=>{
     console.log("login result is "+result);
     this.service.saveDetailsOnLoginSuccess(data);
     this.router.navigate(['app-home']);
   },
   err=>{
     this.error="couldn't login due to some issue";
     console.log("err is "+err.message+" "+err.error);
   }
 );
}

}
