import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SplashComponent } from './splash/splash.component';
import { ActorComponent } from './actor/actor.component';


const routes: Routes = [
  { path: 'splash', component: SplashComponent },
  { path: 'actor', component: ActorComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
