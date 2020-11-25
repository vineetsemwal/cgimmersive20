import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

fieldNames=[];

names:string[]=[];

count=0;

updateCount(value:number){
 this.fieldNames=[]; 
 console.log("inside updateCount, value="+value); 
this.count=value;
for(let i=0;i<this.count;i++){
  let fieldName="name"+i;
  this.fieldNames.push(fieldName);
}
}

submitted(myForm){
let data=myForm.value;
for(let feild of this.fieldNames){
 let value= data[feild];
 this.names.push(value);
 console.log("name fetched is "+value);
}

}

}
