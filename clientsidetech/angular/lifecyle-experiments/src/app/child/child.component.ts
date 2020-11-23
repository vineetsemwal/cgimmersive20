import { Component, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit,OnChanges,OnDestroy {


@Input()
receivedInput:string;

  constructor() { }

  ngOnChanges(changes: SimpleChanges): void {
   console.log("inside childcomponent ngonchanges");
   let change =changes['receivedInput'];
   let previousValue=change.previousValue;
   let newValue=change.currentValue;
   console.log("previous value="+previousValue+" changevalue="+newValue);
  }

  ngOnInit(): void {
    console.log("inside childcomponent onininit");
  }

  ngOnDestroy(){
  console.log("inside childcomponent destroy");
  }


}
