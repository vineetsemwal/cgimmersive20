import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { observable, Observable } from 'rxjs';
import { Constants } from './constants';

@Injectable()
export class AuthenticationService{

 readonly userKey="username";

  
   constructor(private http:HttpClient){
    }

loginRequest(username:string, password:string):Observable<boolean> {
  let url=Constants.baseUrl+"/login";
  let headers:HttpHeaders=new HttpHeaders({'Content-Type':'application/x-www-form-urlencoded'});
  let headers:HttpHeaders=new HttpHeaders({enctype:"multipart/form-data"});
  
  let credentials="username="+username +"&password="+password;
  let result:Observable<boolean>= this.http.post<boolean>(url, credentials,
      { headers: headers, withCredentials: true  }      
    );
  return result;
  
}   


saveDetailsOnLoginSuccess(data){
  let username=data.username
  localStorage.setItem(this.userKey,username);
}

isAuthenticated(){
  let username=localStorage.getItem(this.userKey);
  if(username==null || username==undefined ){
   return false;
  }
  return true;
}


getLoginUsername(){
  let username= localStorage.getItem(this.userKey);
  return username;
}

logout(){
localStorage.removeItem(this.userKey);
let url=Constants.baseUrl+"/logout";
 let observable=this.http.get(url,{responseType:"text"});
 observable.subscribe(data=>console.log("logout done at server"),
 err=>console.log(err.message+" "+err.error)
 );

//should have tried to expire cookie for session id too but in javascript that is done in a very quirky way so ignoring it
//anyway we are killing session at server
}

}