import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { AuthenticationService } from '../authservice';
import { User } from '../model/user';
import { Constants } from '../constants';

@Injectable()
export class UserService{
   
 
    constructor(private http:HttpClient,private authService:AuthenticationService){
   
     }
 

    fetchMe():Observable<User>{
     let username=this.authService.getLoginUsername()
     if(username==""|| username==undefined|| username==null){
         return;
     }
     let url=Constants.baseSecureUrl+"/user/by/username/"+username;  
     let observable:Observable<User>=this.http.get<User>(url);
     return observable;
    }


    

}