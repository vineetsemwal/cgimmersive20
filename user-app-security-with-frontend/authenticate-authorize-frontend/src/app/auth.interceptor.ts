import { Observable } from 'rxjs';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Constants } from './constants';


export class AuthInterceptor implements HttpInterceptor {
  constructor() {}

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
  
    

    let interceptedUrl=request.url;
    if(interceptedUrl.startsWith(Constants.baseManagerUrl) || 
    interceptedUrl.startsWith(Constants.baseAdminUrl) || 
    interceptedUrl.startsWith(Constants.baseSecureUrl)){
      request = request.clone({
        withCredentials: true
    });
    
    }


  return next.handle(request);
  }
}