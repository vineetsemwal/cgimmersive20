import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']
})
export class AppComponent {
  title:string = 'first-app';

  description:string="our first attempt at writing";

  trainees=[
    new Trainee(1,"harshil"),
    new Trainee(2, "swaiti"),
    new Trainee(3,"jay"),
    new Trainee(4,"sahitya")
  
  ]

}

export class Trainee{
   constructor( public id:number,public name:string){
  
  }

}