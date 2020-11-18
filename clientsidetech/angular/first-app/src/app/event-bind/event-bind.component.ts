import { Component} from '@angular/core';

@Component({
  selector: 'event-bind',
  templateUrl: './event-bind.component.html',
  styleUrls: ['./event-bind.component.css']
})
export class EventBindComponent {

  counter:number=0;

  increment(){
    this.counter++;
    console.log("counter incremented to="+this.counter);
  }


}
