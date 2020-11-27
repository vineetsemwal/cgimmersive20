import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { AuthenticationService } from '../authservice';
import { User } from '../model/user';

@Injectable()
export class UserService{
   
    baseServiceUrl="http://localhost:8585";
 
    constructor(private http:HttpClient,private authService:AuthenticationService){
   
     }
 

    fetchMe():Observable<User>{
     let username=this.authService.getLoginUsername()
     if(username==""|| username==undefined|| username==null){
         return;
     }
     let url=this.baseServiceUrl+"/c/user/by/username/"+username;  
     let observable:Observable<User>=this.http.get<User>(url);
     return observable;
    }


    

}