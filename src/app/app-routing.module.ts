import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookListComponent } from './book-list/book-list.component';
import { DisplayUserComponent } from './display-user/display-user.component';
import { HomeComponent } from './home/home.component';
import { UserListComponent } from './user-list/user-list.component';

const routes: Routes = [
  {path:'books',component:BookListComponent },
  {path:'home',component:HomeComponent},
    {path:'users',component:UserListComponent},
    {path:'display-user/:id',component:DisplayUserComponent},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
