import { formatDate } from '@angular/common';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable()
export class UploadService{
constructor(private http:HttpClient){

}

upload(file:File):Observable<string>{
    let url="http://localhost:8585/medias/add";
    let headers:HttpHeaders=new HttpHeaders({enctype:'multipart/form-data' });
    let requestData=new FormData();
    requestData.append('file',file); 
    console.log("file info before sending "+file.name+" size="+file.size+" type="+file.type);
    let observable=this.http.post(url,requestData,{headers,responseType:'text'});
    return observable;
}
}