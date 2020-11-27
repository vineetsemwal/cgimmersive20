import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthenticateComponent } from './authenticate/authenticate.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HttpClient, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AuthenticationService } from './authservice';
import { HomeComponent } from './home/home.component';
import { AuthInterceptor } from './auth.interceptor';
import { GreetComponent } from './greet-component/greet-component.component';
import { GreetService } from './services/greetservice';
import { UserService } from './services/userservice';

@NgModule({
  declarations: [
    AppComponent,
    AuthenticateComponent,
    HomeComponent,
    GreetComponent
  ],
  
  imports: [
    AppRoutingModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserModule,

  ],

  providers: [
    AuthenticationService,
    HttpClient,
    UserService,
    GreetService,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
