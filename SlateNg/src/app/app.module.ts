import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { EffectsModule } from '@ngrx/effects';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { SplashComponent } from './splash/splash.component';
import { ActorComponent } from './actor/actor.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

import { AuthService } from './services/auth.service';
import { AuthEffects } from './store/effects/auth.effects';
import { reducers } from './store/app.states';
import { StoreModule } from '@ngrx/store';


@NgModule({
  declarations: [
    AppComponent,
    SplashComponent,
    ActorComponent,
    SearchComponent,
    LoginComponent,
    SignupComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
    EffectsModule.forRoot([AuthEffects]),
    StoreModule.forRoot(reducers, {}),
  ],
  providers: [AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
