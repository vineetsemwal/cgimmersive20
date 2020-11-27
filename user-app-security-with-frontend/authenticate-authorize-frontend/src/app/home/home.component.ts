import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { AuthenticationService } from '../authservice';
import { UserService } from '../services/userservice';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  user:User=null;
  errMsg=null;

 
  constructor(private authenticationService:AuthenticationService,private userService:UserService) {
    
  }

 ngOnInit(): void {
 let observable=this.userService.fetchMe();
 observable.subscribe(customer=>{
   this.user=customer;
    },
    
 err=>{
  this.errMsg=err.error;
 });
 }

}
