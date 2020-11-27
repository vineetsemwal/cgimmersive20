import { Component, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit, OnDestroy {

  constructor() { }
  

  ngOnInit(): void {
    console.log("inside childcomponent oninitt");
  }

  
  ngOnDestroy(): void {
    console.log("inside  child ondestroy");
    
  }
}
