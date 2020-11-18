import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent {

  description:string="property binding demo description";

  linkUrl:string="http://google.com";

  imgUrl="https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/255px-Flag_of_India.svg.png";



  getImageUrl():string{
   return this.imgUrl;
  }

}
