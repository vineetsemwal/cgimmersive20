import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AuthenticateComponent } from './authenticate/authenticate.component';
import { GreetComponent } from './greet-component/greet-component.component';


const routes: Routes = [

  { path: 'app-home', component: HomeComponent },

  {
    path: 'authenticate', component:AuthenticateComponent
  },
  {
    path:"greet", component:GreetComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
