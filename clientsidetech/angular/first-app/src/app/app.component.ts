import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']
})
export class AppComponent {
  title:string = 'first-app';

  description:string="our first attempt at writing";

  trainee:Trainee=new Trainee(1,"harshil");

}

export class Trainee{
   constructor( public id:number,public name:string){
  
  }

}