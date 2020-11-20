import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EventBindComponent } from './event-bind/event-bind.component';
import { FormCodedrivenComponent } from './form-codedriven/form-codedriven.component';
import { FormTemplatedrivenComponent } from './form-templatedriven/form-templatedriven.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { PropertyBindingComponent } from './property-binding/property-binding.component';
import { StyleDemoComponent } from './style-demo/style-demo.component';
import { TwoWayComponent } from './two-way/two-way.component';

const routes: Routes = [
  {
    path:'two',
    component:TwoWayComponent
  }
  ,
{
path:"templateform",
component:FormTemplatedrivenComponent

}
,
{
path:'codedrivenform',
component:FormCodedrivenComponent
}
  ,

  {
   path:'property' ,
   component:PropertyBindingComponent
  }
,
{
  path:'pipe',
  component:PipeDemoComponent
},

{
  path:'event',
  component:EventBindComponent
}
,
{
  path:'style',
  component:StyleDemoComponent
}
]

;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
