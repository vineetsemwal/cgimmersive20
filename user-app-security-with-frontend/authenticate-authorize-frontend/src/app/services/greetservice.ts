import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { observable, Observable } from 'rxjs';
import { Constants } from '../constants';

@Injectable()
export class GreetService{

    constructor(private http:HttpClient){

    }

    getAdminHello():Observable<string>{
     let url:string=Constants.baseAdminUrl+"/hello";
    let observable =  this.http.get(url,{"responseType":"text"});
    return observable;   
   }

   getSecureHello():Observable<string>{
    let url:string=Constants.baseSecureUrl+"/hello";
    let observable =  this.http.get(url,{"responseType":"text"});
    return observable;          
   }

   getManagerHello():Observable<string>{
    let url:string=Constants.baseManagerUrl+"/hello";
    let observable =  this.http.get(url,{"responseType":"text"});
    return observable;          
    }


}