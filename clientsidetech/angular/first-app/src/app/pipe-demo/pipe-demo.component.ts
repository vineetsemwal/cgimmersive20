import { Component, OnInit } from '@angular/core';
import { Trainee } from '../model/trainee';

@Component({
  selector: 'pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent  {

  name:string="hasrshil";

  balance:number=100.23;

  currentDate=new Date();

  trainee=new Trainee(2,'jay');
}
