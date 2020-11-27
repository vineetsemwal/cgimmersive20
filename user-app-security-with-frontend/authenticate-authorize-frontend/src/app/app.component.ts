import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from './authservice';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  constructor(authenticationService:AuthenticationService){
    this.authenticationService=authenticationService;
  }
  title = 'authenticate';
  authenticationService:AuthenticationService;
  loginSuccess=false;
  
  ngOnInit(): void {
    this.loginSuccess=this.authenticationService.isAuthenticated();
  }

  loginStatus(){
   this.loginSuccess=this.authenticationService.isAuthenticated();
  }

  logout(){
    this.authenticationService.logout();
  }

}
