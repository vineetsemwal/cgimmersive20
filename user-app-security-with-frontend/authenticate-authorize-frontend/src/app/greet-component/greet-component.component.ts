import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthenticationService } from '../authservice';
import { GreetService } from '../services/greetservice';

@Component({
  selector: 'greet',
  templateUrl: './greet-component.component.html',
  styleUrls: ['./greet-component.component.css']
})
export class GreetComponent implements OnInit {

  resultMsg:string='';
  err:string='';

  constructor(private greetService:GreetService, private authService:AuthenticationService, private router:Router) {
   let isAuthenticated:boolean= this.authService.isAuthenticated();
   if(!isAuthenticated){
     router.navigateByUrl("/authenticate");
   }
   }

  ngOnInit(): void {
  
  }

  clearErr(){
    this.err='';
  }

  getAdminHello(){
    this.clearErr();
  let observable:Observable<string>= this.greetService.getAdminHello();
  observable.subscribe(
    (result:string)=>this.resultMsg=result,
    err=>this.err=err.message
  )  
}

getManagerHello(){
  this.clearErr();
  let observable:Observable<string>= this.greetService.getManagerHello();
  observable.subscribe(
    (result:string)=>this.resultMsg=result,
    err=>this.err=err.error
  )  
}


getSecureHello(){
  this.clearErr();
  let observable:Observable<string>= this.greetService.getSecureHello();
  observable.subscribe(
    (result:string)=>this.resultMsg=result,
    err=>this.err=err.error
  )  
}

}
