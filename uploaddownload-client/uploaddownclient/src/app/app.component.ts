import { Component } from '@angular/core';
import { observable, Observable } from 'rxjs';
import { UploadService } from './uploadservice';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'uploaddownclient';

  file:File;

  fileUploadResult:string='';

  constructor(private uploadService:UploadService){

  }


 chosenFile(fileList:FileList){
   this.file=fileList[0];
   console.log("file="+this.file.name+" "+this.file.size);
 }

  upload(myform){
    let observable:Observable<string>=this.uploadService.upload(this.file);
    observable.subscribe(result=>this.fileUploadResult=result);
  }
}
