import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Trainee } from './model/trainee';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']
})
export class AppComponent implements OnInit{

  title:string = 'first-app';

  description:string="our first attempt at writing";
/*
  constructor(private router:Router){

  }
*/  
  ngOnInit(): void {
  //  this.router.navigate(['property']);
  }

  
  trainees=[
    new Trainee(1,"harshil"),
    new Trainee(2, "swaiti"),
    new Trainee(3,"jay"),
    new Trainee(4,"sahitya")
  
  ];


  getDescription():string{
  return this.description;
  }



}